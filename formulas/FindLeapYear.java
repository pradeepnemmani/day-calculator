package formulas;

public class FindLeapYear 
{
	public   boolean findLeapYear(String y)
	
	{
		boolean status=false;
		int year=0;
		int yy=Integer.parseInt(y);
		if(y.substring(1,3).equals("00"))
		{
			
			year=yy%400;
			if(year==0)
			{
				status= true;
			}
			else
			{
				status= false;
			}
		}
		else
		{
			if(true)
			{
				year=yy%4;
				if(year==0)
				{
					status= true;
				}
				else
				{
										
					status= false;
				}
			}
		}
		return status;
	}

}
