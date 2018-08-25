package bbc.participation.accountwrapper.serenity.ui;

import org.openqa.selenium.WebDriverException;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;

/**
 * Account wrapper home page class
 *
 * @author Amit Kumar
 */
public class AccountWrapperHomePage extends PageObject {

	@WhenPageOpens
	public void whenPageOpens() {
		try {
			getDriver().manage().window().fullscreen();
			getDriver().manage().deleteAllCookies();
		} catch (WebDriverException e) {
			e.getMessage();
		}
	}
}