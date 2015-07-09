package formulas;


import enums.EnumMonth;

public class ActualMonth 
{
	public EnumMonth getActualMonth(int mon)
	{
		EnumMonth month=null;
		if(mon==1)
		{
			month=EnumMonth.JANUARY;
		}
		else if(mon==2)
		{
			month=EnumMonth.FEBRUARY;
		}
		else if(mon==3)
		{
			month=EnumMonth.MARCH;
		}
		else if(mon==4)
		{
			month=EnumMonth.APRIL;
		}
		else if(mon==5)
		{
			month=EnumMonth.MAY;
		}
		else if(mon==6)
		{
			month=EnumMonth.JUNE;
		}
		else if(mon==7)
		{
			month=EnumMonth.JULY;
		}
		else if(mon==8)
		{
			month=EnumMonth.AUGUST;
		}
		else if(mon==9)
		{
			month=EnumMonth.SEPTEMBER;
		}
		else if(mon==10)
		{
			month=EnumMonth.OCTOBER;
		}
		else if(mon==11)
		{
			month=EnumMonth.NOVEMBER;
		}
		else 
		{
			month=EnumMonth.DECEMBER;
		}
		return month;
	}
	

}
