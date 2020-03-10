
public class MyDate {
	
	static int MAX_YEAR = 9999;
	static int MIN_YEAR = 1;

	private int year;
	private int month;
	private int day;

	private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May",
			"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday",
			"Thursday", "Friday", "Saturday", "Sunday"};
	private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31,
			30, 31, 30, 31};

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	
	
	
	public boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else
			return true;
	}

	public boolean isValidDate(int year, int month, int day) {

		if (year < MIN_YEAR || year > MAX_YEAR)
			return false;
		if (month < 1 || month >12)
			return false;
		if (day < 1 || day >31)
		return false;
		
		if(month == 2) {
			if (isLeapYear(year))
				return (day <= 29);
			else
				return (day <= 28);
		}
		
		if (month == 4 || month == 6 ||
			month == 9 || month == 11)
			return (day <= 30);
		return true;
	}
	
	
	
	
	
	

}
