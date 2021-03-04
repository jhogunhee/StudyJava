package chapter13;

import java.util.Calendar;
import java.util.Date;

public class Sample02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		System.out.println("== DateInfo == ");
		System.out.println(date);
		
		System.out.println("\n == Date == ");
		System.out.printf("%s %s %02d %02d:%02d:%02d KST %d\n"
				, getWeekName(date.getDay() + 1)
				, getMonthName(date.getMonth())
				, date.getDate()
				, date.getHours()
				, date.getMinutes()
				, date.getSeconds()
				, date.getYear() + 1900);
	}
	
	public static String getWeekName(int WeekNumber) {
		var returnVal = switch(WeekNumber) {
			case Calendar.SUNDAY -> "SUN";
			case Calendar.MONDAY -> "MON";
			case Calendar.TUESDAY -> "TUE";
			case Calendar.WEDNESDAY -> "WED";
			case Calendar.THURSDAY -> "THU";
			case Calendar.FRIDAY -> "FRI";
			case Calendar.SATURDAY -> "SAT";
			default -> throw new IllegalArgumentException("Unexpected value : " + WeekNumber);
		};
		return returnVal;
	}
	
	public static String getMonthName(int MonthNumber) {
		var returnVal = switch(MonthNumber) {
			case Calendar.JANUARY   -> "Jan";
			case Calendar.FEBRUARY  -> "Feb";
			case Calendar.MARCH     -> "Mar";
			case Calendar.APRIL     -> "Apr";
			case Calendar.MAY 	    -> "May";
			case Calendar.JUNE      -> "Jun";
			case Calendar.JULY      -> "Jul";
			case Calendar.AUGUST    -> "Aug";
			case Calendar.SEPTEMBER -> "Sep";
			case Calendar.OCTOBER   -> "Oct";
			case Calendar.NOVEMBER  -> "Nov";
			case Calendar.DECEMBER  -> "Dec";
			default -> throw new IllegalArgumentException("unExpected Value : " + MonthNumber);
		};
		return returnVal;
	}
}
