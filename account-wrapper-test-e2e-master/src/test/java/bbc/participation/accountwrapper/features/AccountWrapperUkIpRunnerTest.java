package bbc.participation.accountwrapper.features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

/**
 * Account Wrapper Uk Ip Runner Test class
 *
 * @author Amit Kumar
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-html-report" },
				features = "src/test/resources/features/accountwrapper",
				glue = "bbc.participation.accountwrapper.features.steps",
				monochrome = true,
				tags = {"@ukIp"})
public class AccountWrapperUkIpRunnerTest {

}