package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import daycalculator.DayCalculator;

public class TestDayCaculator {
	private String year;
	private String month;
	private String date;
	
	public void getDetails() throws IOException
	{
		BufferedReader  bufferedReader=new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter the year:");
		this.year=bufferedReader.readLine();
		System.out.println("Enter the Month:");
		this.month=bufferedReader.readLine();
		System.out.println("Enter the Date:");
		this.date=bufferedReader.readLine();
		
		
	}
	public void getDay()
	{
		
		if(year.equals(null) && month.endsWith(null) && date.endsWith(null))
		{
			System.out.println("Enter all the Details which are mentioned");
		}
		else
		{
			new DayCalculator().getDay(date, month, year);
		}
	}
	public static void main(String[] rags) throws Exception
	{
		System.out.println("In Main");
		TestDayCaculator caculator=new TestDayCaculator();
		caculator.getDetails();
		caculator.getDay();
		
	}

}
