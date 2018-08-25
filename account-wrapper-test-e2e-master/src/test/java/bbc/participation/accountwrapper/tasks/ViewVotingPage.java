package bbc.participation.accountwrapper.tasks;

import bbc.participation.accountwrapper.constants.Constants;
import bbc.participation.accountwrapper.serenity.ui.AccountWrapperHomePage;
import bbc.participation.accountwrapper.utils.EnvironmentProperties;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Class to view Voting Page
 *
 * @author Amit Kumar
 */
public class ViewVotingPage implements Task {

	private final String accountWrapperBaseUrl = EnvironmentProperties.getProperty(Constants.ACCOUNT_WRAPPER_UI_URL);
	private String url;

	public ViewVotingPage(String voteId) {
		this.url = accountWrapperBaseUrl + "?" + "aw_vote_id=" + voteId;
	}

	AccountWrapperHomePage accountWrapperHomePage;

	@Override
	public <T extends Actor> void performAs(T theActor) {
		accountWrapperHomePage.setDefaultBaseUrl(url);
		theActor.attemptsTo(Open.browserOn().the(accountWrapperHomePage));
	}

}