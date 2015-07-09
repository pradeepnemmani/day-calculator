package formulas;

import java.util.concurrent.Callable;

public class MonthCode implements Callable<Integer> 
{
	private String year;
	private String month;
	public MonthCode()
	{
		
	}
	public MonthCode(String Year ,String month)
	{
		this.year=Year;
		this.month=month;
		
	}
	
	

	@Override
	public  Integer call() throws Exception
	{
		
		int m = Integer.parseInt(month);
		
		int mCode = -1;
		if(m==1 || m==2)
		{
			if (new FindLeapYear().findLeapYear(year)) 
			{
				
				if (m == 1)
				{
					return 0;
				} 
				else
				{
					
					mCode = 3;
					return 3;
			    }
			}	
				else 
				{
				
					switch (m) 
					{
						case 1:
							return 1;
						case 2:
							
							return 4;
							
					}

				}
			}

		
		else {
			
			switch (m) {
			

			case 3:
				return 4;

			case 4:
				return 0;

			case 5:
				return 2;

			case 6:
				return 5;

			case 7:
				return 0;

			case 8:
				return 3;

			case 9:
				return 6;

			case 10:
				return 1;

			case 11:
				return 4;

			case 12:
				return 6;
				

			}

		}
		return mCode;
		
	}
		 public int getActualMonthNumber(String month)
		 {
			 int no=0;
				if(month.startsWith("jan"))
				{
					no=1;
				}
				else if(month.startsWith("feb"))
				{
					no=2;
				}
				else if(month.startsWith("mar"))
				{
					no=3;
				}
				else if(month.startsWith("apr"))
				{
					no=4;
				}
				else if(month.startsWith("may"))
				{
					no=5;
				}
				else if(month.startsWith("jun"))
				{
					
					no=6;
				}
				else if(month.equals("jul"))
				{
					no=7;
				}
				else if(month.startsWith("aug"))
				{
					no=8;
				}
				else if(month.startsWith("sep"))
				{
					no=9;
				}
				else if(month.startsWith("oct"))
				{
					no=10;
				}
				else if(month.startsWith("nov"))
				{
					no=11;
				}
				else if(month.startsWith("dec"))
				{
					no=12;
				}
				return no;
		 }
		 public int findNoOfDaysInThisMonth(int month,int year)
		 {
			 int noOfdays=0;
			 if(month==1)
			 {
				 noOfdays=31;
			 }
			 else if(month==2)
			 {
				 if(year%4==0)
				 {
					 noOfdays=29;
				 }
				 else
				 {
					 noOfdays=28;
				 }
			 }
			 else if(month==3)
			 {
				 noOfdays=31;
			 }
			 else if(month==4)
			 {
				 noOfdays=30;
			 }
			 else if(month==5)
			 {
				 noOfdays=31;
			 }
			 else if(month==6)
			 {
				 noOfdays=30;
			 }else if(month==7)
			 {
				 noOfdays=31;
			 }
			 else if(month==8)
			 {
				 noOfdays=31;
			 }
			 else if(month==9)
			 {
				 noOfdays=30;
			 }
			 else if(month==10)
			 {
				 noOfdays=31;
			 }
			 else if(month==11)
			 {
				 noOfdays=30;
			 }
			 else if(month==12)
			 {
				 noOfdays=31;
			 }
			return noOfdays;
			 
		 }
	}
