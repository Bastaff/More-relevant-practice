
public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {

	}

	public MyTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Not valid hour's value");
		}
		this.hour = hour;
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Not valid minute's value");
		}
		this.minute = minute;
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Not valid hour's value");
		}
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Not valid hour's value");
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Not valid minute's value");
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Not valid hour's value");
		}
		this.second = second;
	}

	public String toString() {
		return String.format("%2d:%2d:%2d", hour, minute, second);
	}

	public MyTime nextSecond() {
		try {
			setTime(hour, minute, ++second);
			return this;
		} catch (IllegalArgumentException e) {
			return this;
		}

	}

}
