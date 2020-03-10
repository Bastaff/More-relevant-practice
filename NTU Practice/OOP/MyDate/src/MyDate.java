
public class MyDate {
private int year;
private int month;
private int day;

private String[] MONTHS = {"Jan", "Feb","Mar","Apr","May","Jun","Jul",
							"Aug","Sep","Oct","Nov","Dec"};
private String[] DAYS = {"Monday","Tuesday","Wednesday","Thursday",
							"Friday","Saturday","Sunday"};
private int[] DAYS_IN_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

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
			
			if (year >= 1 && year <= 9999 ) {
				return true;
			}
			if (month >= 1 && month <= 12) {
				return true;
			}
			if (day >= 1 && day <= 31 )
	}






}
