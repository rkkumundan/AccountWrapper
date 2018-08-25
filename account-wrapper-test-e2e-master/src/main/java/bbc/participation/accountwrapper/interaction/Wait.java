package bbc.participation.accountwrapper.interaction;

import bbc.participation.accountwrapper.enums.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

	private WaitFor waitFor;

	public Wait(WaitFor waitFor) {
		this.waitFor = waitFor;
	}

	@Override
	public <T extends Actor> void performAs(T theActor) {
		try {
			Thread.sleep(waitFor.getMilliseconds());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static Wait forABit(WaitFor waitFor) {
		return new Wait(waitFor);
	}
}