package bbc.participation.accountwrapper.enums;

import java.util.concurrent.TimeUnit;

public enum WaitFor {

	QUARTER_SECOND(250, TimeUnit.MILLISECONDS), HALF_SECOND(500, TimeUnit.MILLISECONDS), ONE_SECOND(1,
			TimeUnit.SECONDS), TWO_SECONDS(2, TimeUnit.SECONDS), THREE_SECONDS(3, TimeUnit.SECONDS), FOUR_SECONDS(4,
					TimeUnit.SECONDS), FIVE_SECONDS(5, TimeUnit.SECONDS), TEN_SECONDS(10,
							TimeUnit.SECONDS), TWENTY_SECONDS(20, TimeUnit.SECONDS), THIRTY_SECONDS(30,
									TimeUnit.SECONDS), ONE_MINUTE(1, TimeUnit.MINUTES);

	private final long timePeriod;
	private final TimeUnit timeUnit;

	WaitFor(long timeout, TimeUnit timeUnit) {
		this.timePeriod = timeout;
		this.timeUnit = timeUnit;
	}

	private long getTimePeriod() {
		return timePeriod;
	}

	private TimeUnit getTimeUnit() {
		return timeUnit;
	}

	/**
	 * Performs conversion to required TimeUnit
	 *
	 * @param timeUnit
	 *            TimeUnit
	 * @return time
	 */
	public long getTimeUnitFor(TimeUnit timeUnit) {
		return timeUnit.convert(getTimePeriod(), getTimeUnit());
	}

	public long getMilliseconds() {
		return getTimeUnitFor(TimeUnit.MILLISECONDS);
	}

	public long getSeconds() {
		return getTimeUnitFor(TimeUnit.SECONDS);
	}
}