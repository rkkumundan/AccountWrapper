package bbc.participation.accountwrapper.tasks;

import org.openqa.selenium.WebDriver;

import bbc.participation.accountwrapper.user_interface.ui_model.TargetVotingPageView;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Class to submit vote
 *
 * @author Amit Kumar
 */
public class SubmitVotingPage implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		driver.switchTo().frame(0);
		actor.attemptsTo(
				Click.on(TargetVotingPageView.OPTION_ONE),
				Click.on(TargetVotingPageView.VOTE_NOW)
				);
		driver.switchTo().parentFrame();
	}
}