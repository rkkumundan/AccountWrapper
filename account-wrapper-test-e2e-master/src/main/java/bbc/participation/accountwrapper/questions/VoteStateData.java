package bbc.participation.accountwrapper.questions;

import org.openqa.selenium.WebDriver;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle vote state for assertion
 *
 * @author Amit Kumar
 */
public class VoteStateData implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		driver.switchTo().frame(0);
		return Text.of(TargetVotingPageView.VOTE_STATE).viewedBy(actor).asString();
	}

	public static VoteStateData displayed() {
		return new VoteStateData();
	}

}