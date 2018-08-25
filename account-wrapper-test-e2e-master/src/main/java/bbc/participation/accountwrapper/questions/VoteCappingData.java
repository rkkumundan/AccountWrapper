package bbc.participation.accountwrapper.questions;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle vote capping scenario for assertion
 *
 * @author Amit kumar
 */
public class VoteCappingData implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TargetVotingPageView.VOTE_AGAIN).viewedBy(actor).asString();
	}

	public static VoteCappingData displayed() {
		return new VoteCappingData();
	}

}