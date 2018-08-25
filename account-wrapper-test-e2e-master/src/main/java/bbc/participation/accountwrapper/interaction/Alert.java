package bbc.participation.accountwrapper.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Alert implements Interaction {

	@Override
	public <T extends Actor> void performAs(T theActor) {
		BrowseTheWeb.as(theActor).getDriver().switchTo().alert().accept();
	}

	public static Interaction accept() {
		return instrumented(Alert.class);
	}

}