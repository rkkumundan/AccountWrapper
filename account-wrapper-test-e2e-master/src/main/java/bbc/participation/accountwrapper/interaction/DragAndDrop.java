package bbc.participation.accountwrapper.interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

public class DragAndDrop implements Interaction {

	private final Target drag;
	private final Target drop;

	public DragAndDrop(Target drag, Target drop) {
		this.drag = drag;
		this.drop = drop;
	}

	@Override
	public <T extends Actor> void performAs(T theActor) {
		WebElement dragElement = drag.resolveFor(theActor);
		WebElement dropElement = drop.resolveFor(theActor);

		as(theActor).dragAndDrop(dragElement, dropElement).build().perform();
	}

	public static DragAndDrop on(Target drag, Target drop) {
		return instrumented(DragAndDrop.class, drag, drop);
	}

	private Actions as(Actor actor) {
		return new Actions(BrowseTheWeb.as(actor).getDriver());
	}
}