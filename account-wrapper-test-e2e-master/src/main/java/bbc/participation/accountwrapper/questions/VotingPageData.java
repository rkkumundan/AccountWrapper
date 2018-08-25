package bbc.participation.accountwrapper.questions;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Value;

/**
 * Class to handle voting page data for assertion
 *
 * @author Amit Kumar
 */
public class VotingPageData implements Question<String> {

	@Override
	public String answeredBy(Actor theActor) {
		return Value.of(TargetVotingPageView.ENGLISH_TEXT).viewedBy(theActor).asString();
	}

	public static VotingPageData displayed() {
		return new VotingPageData();
	}

}