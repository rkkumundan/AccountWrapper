package bbc.participation.accountwrapper.questions;

import org.openqa.selenium.WebDriver;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle non-uk vote message for assertion
 *
 * @author Amit Kumar
 */
public class NonUkVoteData implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		driver.switchTo().frame(0);
		return Text.of(TargetVotingPageView.NON_UK_MSG).viewedBy(actor).asString();
	}

	public static NonUkVoteData displayed() {
		return new NonUkVoteData();
	}

}