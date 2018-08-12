package com.ubs.opsit.interviews;

public class TimeSplitter {
	private int hour;
	private int minute;
	private int second;
	
	public TimeSplitter(String time){
		String[] timeArr = time.split(":");
		this.hour = Integer.parseInt(timeArr[0]);
		this.minute = Integer.parseInt(timeArr[1]);
		this.second = Integer.parseInt(timeArr[2]);
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
}
