package formulas;



public class FindDay {
	private int code=-1;
	
	public int getDayCode(int year, int month, int date, int monthCode, int yld) 
	{
		
		if (year == 1800) 
		{
			code=(monthCode+date+1)%7;
		}
		else if(year>=1801 && year<=1803)
		{
			code=(monthCode+yld+date+1)%7;
		}
		else if(year>=1804 && year<=1899)
		{
			code=(int) (((Math.ceil(yld/4))+yld+monthCode+date+1))%7;
		}
		else if(year==1900)
		{
			code=(monthCode+date)%7;
		}
		else if(year>=1901 && year<=1903)
		{
			code=(monthCode+yld+date)%7;
		}
		else if(year>=1904 && year<=1999)
		{
		code=(int)(((Math.ceil(yld/4))+yld+monthCode+date))%7;
			
		}
		
		else if(year==2000)
		{
			code=(monthCode+date+6)%7;
		}
		else if(year>=2001 && year<=2003)
		{
			code=(monthCode+yld+date+6)%7;
		}
		else if(year>=2004 && year<=2099)
		{
			code=(int)(((Math.ceil(yld/4))+yld+monthCode+date+6))%7;
			
		}
		else if(year>=2100 && year<=2999)
		{
			code=(int)(((Math.ceil(yld/4))+yld+monthCode+date+6))%7;
		}
		
		return code;
	}

}
