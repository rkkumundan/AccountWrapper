package bbc.participation.accountwrapper.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class SwitchToFrame implements Interaction {

	private Target target;

	public SwitchToFrame(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T theActor) {
		WebElement targetElement = target.resolveFor(theActor);
		WebDriver driver = BrowseTheWeb.as(theActor).getDriver();

		driver.switchTo().frame(targetElement);
	}

	public static SwitchToFrame on(Target target) {
		return instrumented(SwitchToFrame.class, target);
	}
}