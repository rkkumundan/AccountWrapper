package bbc.participation.accountwrapper.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to fetch Environment Properties
 *
 * @author Amit Kumar
 */
public final class EnvironmentProperties {

	public EnvironmentProperties() {
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(EnvironmentProperties.class);
	private static Properties property;

	public static String getProperty(final String key) {
		if (property == null) {
			property = loadProperties();
		}
		return property.getProperty(key);
	}

	public static void setProperty(final Properties prop) {
		property = prop;
	}

	/**
	 * Method to load properties
	 *
	 * @return properties
	 */
	private static Properties loadProperties() {
		Properties prop = new Properties();
		InputStream input = null;
		String env = "test";
		if (System.getProperty("env") != null) {
			env = System.getProperty("env");
		}
		LOGGER.info("the environment provided is : " + env);
		input = EnvironmentProperties.class.getClassLoader().getResourceAsStream(env + ".properties");

		if (input != null) {
			try {
				prop.load(input);
				LOGGER.info("logger...");
				checkSSLSystemProperties(prop);
			} catch (IOException e) {
				LOGGER.error(e.getMessage());
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						LOGGER.error(e.getMessage());
					}
				}
			}
		}
		return prop;
	}

	/**
	 * Method to check SSL system property
	 *
	 * @param properties
	 *            Properties object
	 */
	private static void checkSSLSystemProperties(Properties properties) {
		if (properties.getProperty("local.setup") != null && properties.getProperty("local.setup").equals("true")) {
			LOGGER.info(
					"======================================Setting up local stuff===================================");
			if (System.getProperty("javax.net.ssl.keyStoreType") == null) {
				System.setProperty("javax.net.ssl.keyStoreProvider", "SunJSSE");
				System.setProperty("javax.net.ssl.keyStoreType", "PKCS12");
			}
			if (System.getProperty("javax.net.ssl.keyStore") == null) {
				System.setProperty("javax.net.ssl.keyStore", properties.getProperty("local.keyStore"));
			}
			if (System.getProperty("javax.net.ssl.keyStorePassword") == null) {
				System.setProperty("javax.net.ssl.keyStorePassword", properties.getProperty("local.keyStorePassword"));
			}
			LOGGER.debug("Checking the system properties that have been set");
			LOGGER.debug(System.getProperty("javax.net.ssl.keyStoreType"));
			LOGGER.debug(System.getProperty("javax.net.ssl.keyStore"));
			LOGGER.debug(System.getProperty("javax.net.ssl.keyStorePassword"));
			LOGGER.debug("It may be possible that the above lines are all null");
		} else {
			LOGGER.debug("No localsetup to be done.");
		}
	}
}