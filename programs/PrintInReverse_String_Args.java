package programs;
/**
 * @author Pradeep kumar Nemmani,
 * 		   iji3b,
 * 	       dots2drops.
 */
/**
 * 
 * Question:-
 * 				Write a script which reverse the given 
 * 				string x = "the pen is mine" the output is mine is pen the.
 * Explanation:-
 *               The Question is to print the given argument in to  reverse order
 *               Example:-string x = "the pen is mine" the output is mine is pen the.
 *  Algorithm:-
 *  			 1)Check Weather the args length greater than or equal to 1.
 *  			 2)If args.length greater than 1,then call agrs from last and print
 *  			 3)If args.length not greater or equal to 1, Print error message.             

 *
 */

public class PrintInReverse_String_Args 
{
	//this method will print the strings from max index to 0th index in strgs[]
	public static void printInReverse(String [] strgs)
	{
		//printing the string from higher index to lower index
		System.out.println("Before Printing in reverse");
		for(int i=0;i<=strgs.length-1 ;i++)
		{
			System.out.print(strgs[i]);
			System.out.print("\t");
		}
		System.out.println("");
		System.out.println("After Printing in reverse");
		for(int i=strgs.length-1;i>=0;i--)
		{
			System.out.print(strgs[i]);
			System.out.print("\t");
		}
	}
	public static void main(String[] args)
	{
		//checking weather args.length>0 
		if(args.length >0)
			{
			//if greater than 0 then storing each string in to string[]
			 int index=0;
			 String[] argStrings=new String[args.length];
				for(String str:args)
				{
					argStrings[index]=str;
					index++;
					 
				}
				//then calling the printInreverse() method which prints  
				printInReverse(argStrings);
			
			}
		else
		{
			//Else if args.length lesser than 1 prints error message.................
			System.out.println("Please Enter atleast one argument");
		}
	}

}
