package formulas;



public class Calculate_No_Of_Days {
	private int toYear;
	private int toMonth;
	private int toDate;
	private int fromYear;
	private int fromMonth;
	private int fromDate;
	private int totalYears;
	private int months;
	private int days;
	private String time;
	
	public Calculate_No_Of_Days()
	{
		
	}
	
	public String calculateNoOfDays(int year,int month,int date)
	{
		this.fromYear=year;
		this.fromMonth=month;
		this.fromDate=date;
		
		
	
		String result=null;
		String error="***********************************************************************************";
		Today today=new Today();
		if(today.getThisYear()==fromYear)
		{
			if(today.getThisMonth()>=fromMonth)
			{
				if(today.getThisMonth()==fromMonth && today.getThisDate()>=fromDate)
				{
					result= calculateTotalDays();
				}
				else if(today.getThisMonth()> fromMonth)
				{
					result=calculateTotalDays();
				}
				else
				{
					result=error;
				}
			}
			else
			{
				result=error;
			}
		}
			else
			{
				if(today.getThisYear()>fromYear)
				{
					result= calculateTotalDays();
				}
				else
				{
					result=error;
				}
			}
		
		return result;
	}
	
	public String calculateTotalDays()
	{
		int totalDays=0;
		int extraDays=0;
		String result=null;
		if(fromYear<=fromYear)
		{
		if(getTodayDate())
		{
			if(getFromDate())
			{
				
				totalDays=calculateTotalNoOfYear()+calculateRemainingDays();
//				System.out.println("total year days======"+totalDays);
				totalYears=(int)Math.ceil(totalDays/365);
				
				
				extraDays=totalDays%365;
				months=(int)(Math.ceil(extraDays/31));
				
				days=extraDays%31;
				
			}
			else
			{
				System.err.println("*************THERE IS SOMETHING PROBLEM WITH THE CODE*******************PLEASE TRY LATER*********");
			}
			result="****************   CALCULATED TOTAL TIME WITH RESPECT TO EVERY LEAP YEAR ******************8"+"\n"+" Years:"+totalYears+"\n"+"Approximatly Months:"+months+"\n"+" ARound Days:"+days+"\n"+"Approximatly Time:"+time;
		}
		}
		
			return result;
		
	}
	public boolean getFromDate()
	{
		boolean status=false;
		if(fromYear!=0 &&fromMonth!=0 && fromDate!=0)
		{
			status=true;
		}
		return status;
	}
	public boolean getTodayDate()
	{
		boolean status=false;
		
		 Today today=new Today();
		this.toYear=today.getThisYear();
		this.toMonth=today.getThisMonth();
		this.toDate=today.getThisDate();
		this.time=today.getThisTime();
		  if(!(toYear==0) && !(toMonth==0) && !(toDate==0))
		 {
			status=true;
		 }
		
		return status;
	}
	public int  calculateTotalNoOfYear()
	{
		int totalDays=0;
		
		for(int year=fromYear+1;year<toYear;year++)
		{
			if(year%4==0)
			{
				totalDays=totalDays+366;
			}
			else
			{
				totalDays=totalDays+365;
			}
		}
//		System.out.println("Returning the Total year dyas===="+totalDays);
		return totalDays;
	}
	public int calculateRemainingDays()
	{
		
		int toExtraDays=0;
		int fromExtraDays=0;
		int totalExtraDays=0;
		MonthCode mc=new MonthCode();
		if(fromYear==toYear)
		{
			 
			for(int to=fromMonth+1;to<toMonth;to++)
			{
				toExtraDays=toExtraDays+mc.findNoOfDaysInThisMonth(to, fromYear);
				
			}
		
			if(toMonth==fromMonth )
			{
				if( toDate==fromDate)
				{
				toExtraDays=toExtraDays+0;
				}
				else
				{
					toExtraDays=toExtraDays+(toDate-fromDate);
				}
				
			}
			else 
			{
				toExtraDays=(toExtraDays+toDate)+((mc.findNoOfDaysInThisMonth(fromMonth, fromYear)-fromDate));
			}
		}
		else
		{
			if(fromYear%4==0 && (fromMonth==1 ||fromMonth==2))
			{
			
				if(fromMonth==1)
				{
					fromExtraDays=335+(31-fromDate);
				}
				else if(fromMonth==2)
				{
					fromExtraDays=306+(29-fromDate);
				}
	    }
		else
		{
			if(fromMonth==1)
			{
				fromExtraDays=334+(31-fromDate);
			}
			else if(fromMonth==2)
			{
				fromExtraDays=306+(28-fromDate);
			}
			else if(fromMonth==3)
			{
				fromExtraDays=275+(31-fromDate);
			}
			else if(fromMonth==4)
			{
				fromExtraDays=245+(30-fromDate);
			}
			else if(fromMonth==5)
			{
				fromExtraDays=214+(31-fromDate);
			}
			else if(fromMonth==6)
			{
				fromExtraDays=184+(30-fromDate);
			}
			else if(fromMonth==7)
			{
				fromExtraDays=153+(31-fromDate);
			}
			else if(fromMonth==8)
			{
				fromExtraDays=122+(31-fromDate);
			}
			else if(fromMonth==9)
			{
				fromExtraDays=92+(30-fromDate);
			}
			else if(fromMonth==10)
			{
				fromExtraDays=61+(31-fromDate);
			}
			else if(fromMonth==11)
			{
				fromExtraDays=31+(30-fromDate);
			}
			else if(fromMonth==12)
			{
				fromExtraDays=0+(31-fromDate);
			}
			
		}
		 
		if(toYear%4==0)
		{
			
				if(toMonth==1)
				{
					fromExtraDays=0+(toDate);
				}
				else if(toMonth==2)
				{
					fromExtraDays=31+(toDate);
				}
		
		
				else if(toMonth==3)
				{
					toExtraDays=60+(toDate);
				}
				else if(toMonth==4)
				{
					toExtraDays=90+(toDate);
				}
				else if(toMonth==5)
				{
					toExtraDays=121+(toDate);
				}
				else if(toMonth==6)
				{
					toExtraDays=152+(toDate);
				}
				else if(toMonth==7)
				{
					toExtraDays=183+(toDate);
				}
				else if(toMonth==8)
				{
					toExtraDays=214+(toDate);
				}
				else if(toMonth==9)
				{
					toExtraDays=244+(toDate);
				}
				else if(toMonth==10)
				{
					toExtraDays=273+(toDate);
				}
				else if(toMonth==11)
				{
					toExtraDays=305+(toDate);
				}
				else if(toMonth==12)
				{
					toExtraDays=335+(toDate);
				}
		}
	    
		else
		{
			if(toMonth==1)
			{
				toExtraDays=0+(toDate);
			}
			else if(toMonth==2)
			{
				toExtraDays=31+(toDate);
			}
			else if(toMonth==3)
			{
				toExtraDays=59+(toDate);
			}
			else if(toMonth==4)
			{
				toExtraDays=89+(toDate);
			}
			else if(toMonth==5)
			{
				toExtraDays=120+(toDate);
			}
			else if(toMonth==6)
			{
				toExtraDays=151+(toDate);
			}
			else if(toMonth==7)
			{
				toExtraDays=182+(toDate);
			}
			else if(toMonth==8)
			{
				toExtraDays=213+(toDate);
			
			}
			else if(toMonth==9)
			{
				toExtraDays=243+(toDate);
			}
			else if(toMonth==10)
			{
				toExtraDays=272+(toDate);
			}
			else if(toMonth==11)
			{
				toExtraDays=304+(toDate);
			}
			else if(toMonth==12)
			{
				toExtraDays=334+(toDate);
			}
			
		}
	}
		totalExtraDays=(fromExtraDays+toExtraDays);
	
		if(toExtraDays==0)
		{
			totalExtraDays=0;
		}
		else
		{
			totalExtraDays=(fromExtraDays+toExtraDays);
		}
//	System.out.println("Returning the ExtraMonth Days===="+ (fromExtraDays+toExtraDays));
		
		return totalExtraDays ;
	}
	
	
	
}
