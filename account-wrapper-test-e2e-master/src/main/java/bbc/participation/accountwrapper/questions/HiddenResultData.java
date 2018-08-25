package bbc.participation.accountwrapper.questions;

import org.openqa.selenium.WebDriver;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle hidden result message for assertion
 *
 * @author Amit Kumar
 */
public class HiddenResultData implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		driver.switchTo().frame(0);
		return Text.of(TargetVotingPageView.HIDDEN_RESULT_MSG).viewedBy(actor).asString();
	}

	public static HiddenResultData displayed() {
		return new HiddenResultData();
	}

}