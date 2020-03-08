
public class MyTime {
	private int hour;
	private int minute;
	private int second;

	public MyTime() {

	}

	public MyTime(int hour, int minute, int second) {

		if (hour < 0 || hour > 23) {
			throw new IllegalArgumentException("Not valid hour's value");
		} else {
		this.hour = hour;
		}
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Not valid minute's value");
		} else {
		this.minute = minute;
		}
		if (second < 0 || second > 59) {
			throw new v;
		} else {
		this.second = second;
		}
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
		} else {
		this.hour = hour;
		}
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Not valid minute's value");
		} else {
		this.minute = minute;
		}
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			throw new IllegalArgumentException("Not valid hour's value");
		} else {
		this.second = second;
		}
	}

	public String toString() {
		return String.format("%2d:%2d:%2d", hour, minute, second);
	}

	public MyTime nextSecond() {
		try {
			setTime(hour, minute, ++second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		second = 0;
		return nextMinute();
	}

	public MyTime nextMinute() {
		try {
			setTime(hour, ++minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		minute = 0;
		return nextHour();
	}

	public MyTime nextHour() {
		try {
			setTime(++hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		hour = 0;
		return this;
	}
	
	public MyTime previousSecond() {
		try {
			setTime(hour, minute, --second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		second = 59;
		return nextMinute();
	}

	public MyTime previousMinute() {
		try {
			setTime(hour, --minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		minute = 59;
		return nextHour();
	}

	public MyTime previousHour() {
		try {
			setTime(--hour, minute, second);
			return this;
		} catch (IllegalArgumentException e) {
		}
		hour = 12;
		return this;
	}

}
