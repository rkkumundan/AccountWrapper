package bbc.participation.accountwrapper.pageelementsmodel;

/**
 * Vote page elements
 *
 * @author Amit Kumar
 */
public class VotePageElements {

	private String option_one;
	private String option_two;
	private String vote_now;

	public VotePageElements(String option_one, String option_two, String vote_now) {
		this.option_one = option_one;
		this.option_two = option_two;
		this.vote_now = vote_now;
	}

	public String getOption_one() {
		return option_one;
	}

	public void setOption_one(String option_one) {
		this.option_one = option_one;
	}

	public String getOption_two() {
		return option_two;
	}

	public void setOption_two(String option_two) {
		this.option_two = option_two;
	}

	public String getVote_now() {
		return vote_now;
	}

	public void setVote_now(String vote_now) {
		this.vote_now = vote_now;
	}

	@Override
	public String toString() {
		return String.format("{option_one='%s', option_two='%s', vote_now='%s'}", option_one, option_two, vote_now);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((option_one == null) ? 0 : option_one.hashCode());
		result = prime * result + ((option_two == null) ? 0 : option_two.hashCode());
		result = prime * result + ((vote_now == null) ? 0 : vote_now.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VotePageElements other = (VotePageElements) obj;
		if (option_one == null) {
			if (other.option_one != null)
				return false;
		} else if (!option_one.equals(other.option_one))
			return false;
		if (option_two == null) {
			if (other.option_two != null)
				return false;
		} else if (!option_two.equals(other.option_two))
			return false;
		if (vote_now == null) {
			if (other.vote_now != null)
				return false;
		} else if (!vote_now.equals(other.vote_now))
			return false;
		return true;
	}
}