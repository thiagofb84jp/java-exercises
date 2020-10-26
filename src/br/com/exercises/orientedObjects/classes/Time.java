package br.com.exercises.orientedObjects.classes;

public class Time {

	private int hour;

	private int minute;

	private int second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(hour);
		builder.append(":");
		builder.append(minute);
		builder.append(":");
		builder.append(second);
		return builder.toString();
	}

	public Time nextSecond() {
		++second;
		if (second >= 59) {
			second = 00;
			++minute;
			if (minute >= 59) {
				minute = 00;
				++hour;
				if (hour >= 24) {
					hour = 00;
				}
			}
		}
		return this;
	}

	public Time previousSecond() {
		--second;
		if (second >= 59) {
			second = 00;
			--minute;
			if (minute >= 59) {
				minute = 00;
				--hour;
				if (hour >= 24) {
					hour = 00;
				}
			}
		}
		return this;
	}
}