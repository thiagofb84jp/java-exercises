package br.pb.com.programming.methods;

public class Exercise16 {

	/*
	 * 16. Write a Java method to display the current date and time.
	 * Link do exercício: https://www.w3resource.com/java-exercises/method/java-method-exercise-15.php
	 */
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;

		long currentSecond = (int) (totalSeconds % 60);

		long totalMinutes = totalSeconds / 60;

		long currentMinute = (int) (totalMinutes % 60);

		long totalHours = totalMinutes / 60;

		long currentHour = (int) (totalHours % 24);

		long totalDays = totalHours / 24;

		int currentYear = (int) (totalDays / 365) + 1970;

		long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;

		if (currentHour > 0)
			daysInCurrentYear++;

		int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);

		String month = getMonthName(currentMonthNum);

		int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);

		int startDay = getStartDay(currentYear, currentMonthNum);

		int today = (int) daysInCurrentYear - daysTillCurrentMonth;

		String dayOfWeek = dayNameOfWeek(((startDay + today) % 7));

		System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today + ", " + currentYear + " "
				+ currentHour + ":" + currentMinute + ":" + currentSecond);

	}

	private static String dayNameOfWeek(int dayOfWeek) {
		switch (dayOfWeek) {
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return null;
		}
	}

	private static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;

		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	private static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

	private static int getNumOfDaysToReachThatMonth(int currentYear, int currentMonthNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String getMonthName(int currentMonthNum) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int getMonthFromDays(int year, int days) {
		int dayTracker = 0;

		for (int i = 1; i <= 12; i++) {
			dayTracker += getNumberOfDaysInMonth(year, i);

			if (dayTracker > days)
				return i;
		}

		return 12;
	}

	private static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2)
			return isLeapYear(year) ? 29 : 28;

		return 0;
	}

	private static int numberOfLeapYearsSince1970(long year) {
		int count = 0;

		for (int i = 1970; i <= year; i++) {
			if (isLeapYear(i))
				count++;
		}

		return count;
	}

	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}