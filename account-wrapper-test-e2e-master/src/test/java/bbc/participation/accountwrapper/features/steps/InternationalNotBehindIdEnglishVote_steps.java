package bbc.participation.accountwrapper.features.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;

import bbc.participation.accountwrapper.pageelementsmodel.VotePageElements;
import bbc.participation.accountwrapper.pages.VotingPage;
import bbc.participation.accountwrapper.questions.HiddenResultData;
import bbc.participation.accountwrapper.questions.InvalidVoteIdData;
import bbc.participation.accountwrapper.questions.NonUkVoteData;
import bbc.participation.accountwrapper.questions.VoteAndOptionsData;
import bbc.participation.accountwrapper.questions.VoteCappingData;
import bbc.participation.accountwrapper.questions.VoteStateData;
import bbc.participation.accountwrapper.questions.VoteSubmitData;
import bbc.participation.accountwrapper.questions.VotingPageData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

/**
 * Steps definition class for International vote not behind ID, English Only
 * feature
 *
 * @author Amit kumar
 */
public class InternationalNotBehindIdEnglishVote_steps {

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
	@Given("^unsigned in user opens INTERNATIONAL vote with voteId as \"([^\"]*)\"$")
	public void unsigned_in_user_opens_INTERNATIONAL_vote_with_voteId_as(String voteId) throws Exception {
		theActorCalled("Jeff").wasAbleTo(VotingPage.viewVotingPage(voteId));
	}

	/**
	 * Method to validate if the vote is displayed in english language
	 *
	 * @param language
	 *            english language
	 * @throws Exception
	 *             if fails to valdate the language
	 */
	@Then("^user should be able to see loaded vote in \"([^\"]*)\" language$")
	public void user_should_be_able_to_see_loaded_vote_in_language(String language) throws Exception {
		theActorInTheSpotlight().should(seeThat(VotingPageData.displayed(), is(equalTo(language))));
	}

	/**
	 * Method to validate the vote and the options
	 *
	 * @throws Exception
	 *             if fails to validate vote and options
	 */
	@Then("^user should be able to see vote and option$")
	public void user_should_be_able_to_see_vote_and_option() throws Exception {
		VotePageElements expected = new VotePageElements("London", "Edinburgh", "VOTE NOW");
		theActorInTheSpotlight().should(seeThat(VoteAndOptionsData.information(),
				equalTo(expected)));
	}

	/**
	 * Method to validate message based on vote state as pre-open
	 *
	 * @throws Exception
	 */
	@Then("^user should see respective messages corresponding to vote state as pre-open$")
	public void user_should_see_respective_messages_corresponding_to_vote_state_as_pre_open() throws Exception {
		theActorInTheSpotlight().should(
				seeThat(VoteStateData.displayed(), containsString("This vote is not open. Please come back later.")));
	}

	/**
	 * Method to validate message based on vote state as closed
	 *
	 * @throws Exception
	 */
	@Then("^user should see respective messages corresponding to vote state as closed$")
	public void user_should_see_respective_messages_corresponding_to_vote_state_as_closed() throws Exception {
		theActorInTheSpotlight().should(seeThat(VoteStateData.displayed(),
				containsString("This vote is now closed. Here are the final results.")));
	}

	/**
	 * Method to validate message based on vote state as finished
	 *
	 * @throws Exception
	 */
	@Then("^user should see respective messages corresponding to vote state as finished$")
	public void user_should_see_respective_messages_corresponding_to_vote_state_as_finished() throws Exception {
		theActorInTheSpotlight()
				.should(seeThat(VoteStateData.displayed(), containsString("Here are the final results.")));
	}

	/**
	 * Method to submit vote
	 *
	 * @throws Exception
	 *             if fails to submit vote
	 */
	@When("^user submits vote$")
	public void user_submits_vote() throws Exception {
		theActorInTheSpotlight().wasAbleTo(VotingPage.submitVotingPage());
	}

	/**
	 * Method to validate voting confirmation message
	 *
	 * @throws Exception
	 *             if fails to validate message
	 */
	@Then("^user should be able to see vote confirmation$")
	public void user_should_be_able_to_see_vote_confirmation() throws Exception {
		theActorInTheSpotlight().should(seeThat(VoteSubmitData.displayed(),
				containsString("Thank you for voting. Here are the current results.")));
	}

	/**
	 * Method to validate vote again text for capping scenario
	 *
	 * @param voteAgain
	 *            vote again text
	 * @throws Exception
	 *             if fails to validate the text
	 */
	@Then("^user should be able to see \"([^\"]*)\" text$")
	public void user_should_be_able_to_see_text(String voteAgain) throws Exception {
		theActorInTheSpotlight().should(seeThat(VoteCappingData.displayed(), containsString(voteAgain)));
	}

	/**
	 * Method to validate outside UK message
	 *
	 * @throws Exception
	 *             if fails to validate the message
	 */
	@Then("^user should be able to see outside UK message$")
	public void user_should_be_able_to_see_outside_UK_message() throws Exception {
		theActorInTheSpotlight().should(
				seeThat(NonUkVoteData.displayed(), containsString("This vote is not available outside the UK.")));
	}

	/**
	 * Method to validate error message for invalid vote Id
	 *
	 * @throws Exception
	 *             if fails to validate error message
	 */
	@Then("^user should be able to see error message corresponding to invalid vote Id$")
	public void user_should_be_able_to_see_error_message_corresponding_to_invalid_vote_Id() throws Exception {
		theActorInTheSpotlight()
				.should(seeThat(InvalidVoteIdData.displayed(), containsString("This vote is currently unavailable.")));
	}

	/**
	 * Method to validate hidden result message
	 *
	 * @throws Exception
	 *             if fails to validate message
	 */
	@Then("^user should be able to see hidden result message$")
	public void user_should_be_able_to_see_hidden_result_message() throws Exception {
		theActorInTheSpotlight().should(seeThat(HiddenResultData.displayed(),
				containsString("Thank you for voting. The results are not available.")));
	}
}