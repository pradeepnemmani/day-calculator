package formulas;

import java.util.GregorianCalendar;

public class Today {
	private int year;
	private int month;
	private int date;
	private String week;
	private String day;
	private String time;
	
	public Today()
	{
		GregorianCalendar calendar=new GregorianCalendar();
		String[] time=calendar.getTime().toString().split(" ");
		this.day=time[0];
		this.month=new MonthCode().getActualMonthNumber(time[1].toLowerCase());
		this.date=Integer.parseInt(time[2]);
		this.time=time[3];
		this.week=time[4];
		this.year=Integer.parseInt(time[5]);
		
	}
	public int getThisMonth()
	{
		return this.month;
	}
	public int getThisYear()
	{
		return this.year;
	}
	public int getThisDate()
	{
		return this.date;
	}
	public String getThisDay()
	{
		return this.day;
	}
	public String getThisTime()
	{
		return this.time;
	}
	public String getThisWeek()
	{
		return this.week;
	}


}
