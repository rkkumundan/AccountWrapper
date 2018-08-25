package bbc.participation.accountwrapper.questions;

import org.openqa.selenium.WebDriver;

import bbc.participation.accountwrapper.pageelementsmodel.VotePageElements;
import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle vote and voting options for assertions
 *
 * @author Amit kumar
 */
public class VoteAndOptionsData implements Question<VotePageElements> {

	@Override
	public VotePageElements answeredBy(Actor actor) {

		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		driver.switchTo().frame(0);

		String option_one = Text.of(TargetVotingPageView.OPTION_ONE).viewedBy(actor).resolve();
		String option_two = Text.of(TargetVotingPageView.OPTION_TWO).viewedBy(actor).resolve();
		String vote_now = Text.of(TargetVotingPageView.VOTE_NOW).viewedBy(actor).resolve();

		return new VotePageElements(option_one, option_two, vote_now);
	}

	public static VoteAndOptionsData information() {
		return new VoteAndOptionsData();
	}
}