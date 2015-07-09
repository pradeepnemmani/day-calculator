package daycalculator;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import enums.EnumDay;
import formulas.ActualMonth;
import formulas.Calculate_No_Of_Days;
import formulas.Day;
import formulas.FindDay;
import formulas.MonthCode;
import formulas.SubString;

public class DayCalculator 
{
	 private int month=0;
	 private int year=0;
	 private int day=0;
	 private int monthCode=-1;
	 private String subString=null;
	 private int yld=0;
	 private int dayCode=-1;
	public  void getDay(String d,String m,String y)
	{
		try{
	 year=Integer.parseInt(y);
	 month=Integer.parseInt(m);
	 day=Integer.parseInt(d);
	if(year>=1800 && year<=2999)
	{
		if(month>=1 && month<=12)
		{
			if(day>=1 && day<=31)
			{
			
				startProcessing(y, m, d);
				
			}
			else
			{
				System.err.println("ERROR PLEASE ENTER DAY BETWEEN 0-31");
			}
		}
		else
		{
			System.err.println("ERROR PLEASE ENTER MONTH BETWEEN 1-12");
		}
	}
	else
	{
		System.err.println("ERROR PLEASE ENTER YEAR BETWEEN 1800-2999");
	}
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
	}
	
	
	public void startProcessing( String year , String month,String date) throws Exception
	{
		
		MonthCode monthCode2=new MonthCode(year, month); 
		SubString subString1=new SubString(year);
		
		ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		
		Future<Integer> future=executor.submit(monthCode2);
		Future<String> future2=executor.submit(subString1);
		
		if(future.isCancelled() || future2.isCancelled())
		{
			System.err.println("PLEASE ENTER THE DETAILS AGAIN:");
		}
				
				this.monthCode=future.get();
				this.subString=future2.get();
				
				if(subString.endsWith("null"))
				{
					this.yld=0;
				}
				else
				{
					this.yld=Integer.parseInt(future2.get());	
				}
				
				
				

		this.dayCode=new FindDay().getDayCode(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date), monthCode, yld);
		if(this.year%4==0)
		{
			System.out.println("\t"+"\t"+"\t"+"ENTERED DETAILS"+"\n"+"YEAR:"+year+"\n"+"LEAP YEAR: TRUE"+"\n"+"MONTH:"+new ActualMonth().getActualMonth(this.month)+"\n"+"DATE:"+date);
			
		}
		else
		{
			System.out.println("\t"+"\t"+"\t"+"ENTERED DETAILS"+"\n"+"YEAR:"+year+"\n"+"LEAP YEAR: FALSE"+"\n"+"MONTH:"+new ActualMonth().getActualMonth(this.month)+"\n"+"DATE:"+date);
			
		}
		System.out.println("THE DAY WHICH FALLS ON THE GIVEN DATE:");
		System.out.println("DAY:"+getday(dayCode));
		System.out.println(new Calculate_No_Of_Days().calculateNoOfDays(this.year, this.month, this.day));
		System.out.println("\n"+"\n"+"\n");
	
		if(executor!=null)
		{
			executor.shutdown();
		}
		
	}
	public EnumDay getday(int dayCode)
	{
		return new Day().getDay(dayCode);
	}
//	public String calculateNoOfDays()
//	{
//		String result=null;
//		String error="***********************************************************************************";
//		Today today=new Today();
//		if(today.getThisYear()==year)
//		{
//			if(today.getThisMonth()>=month)
//			{
//				if(today.getThisMonth()==month && today.getThisDate()>=day)
//				{
//					result= new Calculate_No_Of_Days().calculateTotalDays(this.year, this.month, this.day);
//				}
//				else if(today.getThisMonth()> month)
//				{
//					result=new Calculate_No_Of_Days().calculateTotalDays(this.year, this.month, this.day);
//				}
//				else
//				{
//					result=error;
//				}
//			}
//			else
//			{
//				result=error;
//			}
//		}
//			else
//			{
//				if(today.getThisYear()>year)
//				{
//					result= new Calculate_No_Of_Days().calculateTotalDays(this.year, this.month, this.day);
//				}
//				else
//				{
//					result=error;
//				}
//			}
//		
//		return result;
//	}
	

}
