package formulas;

import enums.EnumDay;

public class Day {
	public EnumDay getDay(int dayCode)
	{
		
		EnumDay day=null;
		if(dayCode==1)
		{
			day=EnumDay.SUNDAY;
		}
		else if(dayCode==2)
		{
			day=EnumDay.MONDAY;
		}
		else if(dayCode==3)
		{
			day=EnumDay.TUESDAY;
		}
		else if(dayCode==4)
		{
			day=EnumDay.WEDNESDAY;
		}
		else if(dayCode==5)
		{
			day=EnumDay.THURSDAY;
		}
		else if(dayCode==6){
			day=EnumDay.FRIDAY;
			
		}
		else {
			day=EnumDay.SATURDAY; 
		}
		return day;
	}

}
