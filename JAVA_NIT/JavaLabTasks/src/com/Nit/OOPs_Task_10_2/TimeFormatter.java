package com.Nit.OOPs_Task_10_2;

public class TimeFormatter {
	private int hh;
	private int mm;
	private int ss;
	
	public TimeFormatter()
	{
		this.hh=0;
		this.mm=0;
		this.ss=0;
	}
	
	public TimeFormatter(int hours,int minutes,int seconds)
	{
		this.hh=hours;
		this.mm=minutes;
		this.ss=seconds;
	}
	
	public void show()
	{
		System.out.println(this.hh+":"+this.mm+":"+this.ss);
	}
	
	public static TimeFormatter add(TimeFormatter time1,TimeFormatter time2)
	{
		int totalSeconds =time1.ss+time2.ss;
		int totalMinutes =time1.mm+time2.mm;
		int totalHours =time1.hh+time2.hh;
		
		if(totalSeconds>=60)
		{
			totalSeconds = totalSeconds-60;
			totalMinutes++;
		}
		
		if(totalMinutes>=60)
		{
			totalMinutes = totalMinutes-60;
			totalHours++;
		}
		
		return new TimeFormatter(totalHours,totalMinutes,totalSeconds);
	}
}
