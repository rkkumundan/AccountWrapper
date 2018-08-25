package bbc.participation.accountwrapper.pages;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import bbc.participation.accountwrapper.tasks.SubmitVotingPage;
import bbc.participation.accountwrapper.tasks.ViewVotingPage;

/**
 * Class for voting page
 *
 * @author Amit Kumar
 */
public class VotingPage {

	public static ViewVotingPage viewVotingPage(String voteId) {
		return instrumented(ViewVotingPage.class, voteId);
	}

	public static SubmitVotingPage submitVotingPage() {
		return instrumented(SubmitVotingPage.class);
	}

}