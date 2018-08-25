package bbc.participation.accountwrapper.questions;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Class to handle invalid vote Id message for assertion
 *
 * @author Amit Kumar
 */
public class InvalidVoteIdData implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(TargetVotingPageView.INVALID_VOTE_ID_MSG).viewedBy(actor).asString();
	}

	public static InvalidVoteIdData displayed() {
		return new InvalidVoteIdData();
	}

}