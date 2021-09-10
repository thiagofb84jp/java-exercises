package br.pb.com.programming.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Exercise27 {

	/*
	 * 27. Write a Java program to display the current date time in specific format.
	 */
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		dateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

		System.out.println("\nNow: " + dateFormat.format(System.currentTimeMillis()));
	}
}