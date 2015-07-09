package formulas;

import java.util.concurrent.Callable;

public class SubString implements Callable<String>

{
	private String year;
	public  SubString()
	{
		
	}
	public SubString(String year)
	{
		this.year =year;
		
	}
	@Override
	public   String call() throws Exception
	{
		
		String subStr=null;
		int y=Integer.parseInt(year);
		
		if(y>=1801 && y<=1803)
		{
			return year.substring(3, 4);
		}
		else if(y>=1804 && y<=1899)
		{
			return year.substring(2, 4); 
		}
		else if(y==1900)
		{
			return "null";
		}
		else if(y>=1901 && y<=1903)
		{
			return year.substring(3, 4);
			
		}
		
		else if(y>=1904 && y<=1999)
		{
			return year.substring(2, 4);
		}
		else if(y==2000)
		{
			return "null";
		}
		else if(y>=2001 && y<=2003)
		{
			return year.substring(3, 4);
		}
		else if(y>=2004 && y<=2099)
		{
			return year.substring(2, 4);
		}
		else if(y>=2100 && y<=2999)
		{
			return year.substring(3, 4);
		}
	
		return subStr;
	}
	
}
