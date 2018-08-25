package bbc.participation.accountwrapper.features;

import org.junit.runner.RunWith;

import bbc.participation.accountwrapper.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-html-report" },
				features = "src/test/resources/features/accountwrapper",
				glue = "bbc.participation.accountwrapper.features.steps",
				monochrome = true,
				tags = {"@nonUkIp" })
public class ParallelFirefoxTest extends BrowserStackSerenityTest {

}