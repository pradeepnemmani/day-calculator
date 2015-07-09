package programs;

/**
 *  Author:-
 *  		Pradeep Kumar Nemmani
 *  		ij13b
 *  		dots2drops
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *Question:-
 *				write a function that returns the element which is having maximum occurrence in the given string
				Char input_str [] = "the things are thin"
				So it will returns "t" as it's occurrence is 3 times.
 *Explanation:-
 *				This Question is, To find the chars which are occurred more no of time in given String.
 *				for Example for given String "Pradeep". The output Should be p-2,e-2.
 *				Because char P Occurred  2 times and   E Occurred 2 times 
 *Algorithm:-
 *				1)First Of all we need a exactly one String. So, take one String
 *				2)Convert the String into chars and store that Chars into charArray.
 *				3)Create one Object for Set, And Store  the Chars in charArray.
 *				 Note:-Here the Object set will not allow to store the duplicate chars(For Example it store only p, r, a,d & e   for a given String "Pradeep" ) 
 *				4)Now Create a Object for Map<Character,Integer>  map. And Count the every character and Store that Character And Its Count in a map
 *				5)Now we get Count of every character and its Count for that I Had applied a logic shown in line 58-66 .
 *				6)Get the Maximum no of occurred character  count, Shown in line 85-95.
 *				7)Using Count get all Chars whose charCount==count, Shown in line 99-105;
 *				7)Finally Print those chars and count,Shown in Line 113-116
 */

public class MoreOccuredCharInString 
{
	//This method will converts the Given string into charArray,
	
	public static void getMoreOccuredChars(String str)
	{
		//This method will converts the Given string into charArray
		char[] cArray=str.toCharArray();
		//This set object used to store the every individual character in a given String.
		Set<Character> set=new HashSet<>();
		//This Map Object is used to store Character as Key  and its count as Value 
		Map<Character,Integer> map=new HashMap<>();
		//Here for Every Character in a cArray adding in to set 
		//(Here Set will not Allow duplicate Char) 
		for(Character c:cArray)
		{
			set.add(c);
		}
		//Now For every character in a  set count of it occurrence is going to done 
		//using  cArray shown in  below
		for(Character c:set)
		{
			//Initially count of every is  0
			int count=0;
			//Then Every Character in a cArray
			for(Character ch:cArray)    											//Line 58
			{
				//comparing weather character from set==character from aArray. 
				//If Equals count of that char is increased by 1
				if(ch.equals(c))
				{
					count++;
				}
			}																		//Line 66
			//Later Storing that as Key And count as Value in Map  
			map.put(c, count);
		}
		Map<Character,Integer> resultMap=getChars(map);
		
		show(resultMap);
		
	}
	public static  Map<Character,Integer>  getChars(Map<Character,Integer> map)
	{
		
		//This Map Object is used to store Max No of times occurred chars 
		//in a given String 
		Map<Character,Integer> result=new HashMap<>();
		//Let us assume that initially every char will occurred  
		//at least for one time
		int maxCount=1;
		//This Loop will get Max  no of occurred char count  
		for(Entry<Character, Integer> e1:map.entrySet())							//Line 85
		{
			//for char Count checking with maxCount
			//if maxCount lesser than present CharCount/
			//Then assigning maxCount as present CharCount.
			
			if(e1.getValue()>maxCount)
			{
				maxCount=e1.getValue();
			}
		}													 						//Line 95
		//Using Previous for loop we got an maximum Char Count 
		//Using that maxCharCount getting that Char and its value from Map
		//And storing them in to result Map.Shown below
		for(Entry<Character, Integer> e1:map.entrySet())							//Line 99
		{	
			if(e1.getValue()>=maxCount)
			{
				result.put(e1.getKey(), e1.getValue());
			}
		}																			//Line 105
		
		return result;
	}
	//This method will prints the max No of times times occurred char and its count
	public  static void show(Map<Character,Integer> map)
	{
		System.out.println("Highly repeated Chars");
		for(Entry<Character,Integer> entry:map.entrySet())							//Line 113
		{
			System.out.println(entry.getKey()+"="+entry.getValue());	
		}																			// Line 116
	}
	public static void main(String[] args)
	{
		
		
		if(args.length>=1)
		{
			String argument="";
			for(String str:args)
			{
			 argument=argument+str.toLowerCase();
			}
		getMoreOccuredChars(argument);
		}
		else
		{
			System.out.println("ERROR===Please enter atleast one argument");
		}
	}
	//Thank You...................

}
