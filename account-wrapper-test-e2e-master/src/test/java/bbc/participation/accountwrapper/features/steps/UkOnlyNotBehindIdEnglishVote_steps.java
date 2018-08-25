package bbc.participation.accountwrapper.features.steps;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import bbc.participation.accountwrapper.pages.VotingPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * Steps definition class for UK only vote not behind ID, English Only feature
 *
 * @author Amit kumar
 */
public class UkOnlyNotBehindIdEnglishVote_steps {

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());
		Serenity.getCurrentSession().clear();
	}

	/**
	 * Method to open vote based on vote Id
	 *
	 * @param voteId
	 *            Id of vote
	 * @throws Exception
	 *             if fails to open vote
	 */
	@Given("^unsigned in user opens UK vote with voteId as \"([^\"]*)\"$")
	public void unsigned_in_user_opens_UK_vote_with_voteId_as(String voteId) throws Exception {
		theActorCalled("Jeff").wasAbleTo(VotingPage.viewVotingPage(voteId));
	}

}