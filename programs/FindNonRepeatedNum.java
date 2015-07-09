package programs;

/**
 * Author:-Pradeep Kumar Nemmani
 * ij13
 * dots2drops
 */

import java.util.HashSet;
import java.util.Set;
/**
 * Question:-
 * 				 Find out elements which is not duplicate in the given array.
 * 				 Int arr[] = {1,3,5,7,1,3,5}
				 Output = 7
 * Explanation:-
 * 				This Question is, To find the numbers which is not repeated in a  given Array of Integers
 * Algorithm:-
 * 				1)Initialize two Sets(i.e set1  & set2),
 * 				2)Create a loop for every Integer in given array and store that integer in to two sets(set1 & set2).
 * 				  these two sets(set1 & set2) will not store the duplicate Integers.	
 * 				3)Then later  create a two loop, One for every integer in set1 and for every integer in given array And and int counter=0
 * 				  here if Integer in set1 equals to Integer in given array,Then increase the counter.
 * 				4)If counter greater or equal  to 2, Then Delete that Integer in set2(Here repeated Integer will deleted).
 * 				5)Then print  for Every Integer in set2.....
 *    
 */

public class FindNonRepeatedNum 
{
	
	public  static Set<Integer>  find(int[] arr)
	{
		
		//Initializing set1 And set2 as discussed above in algorithm 
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		
		//Here Storing the Integers in set1 And set2 so, here set1 And set2 will not allow to store
		//duplicate  integers
		for(Integer i:arr)
		{
			set1.add(i);
			set2.add(i);
		}
		//Now set1 & set2 contains non duplicate Integers
		// One for every integer in set1 and for every integer in given array And and int counter=0
		 //here if Integer in set1 equals to Integer in given array,Then increase the counter.
		
		for(Integer i:set1)
		{
			int count=0;
			for(Integer a:arr)
			{
				//Integer in set1==Integer in array counter will increases by one 
				if(i==a)
				{
					count++;
				}
			}
			//If count of that integer greater or equal to 2 then delete that Integer in set2
			if(count>=2)
			{
				set2.remove(i);
				//NOTE:- Here I Took set2 because I can not delete the Integer in set1 because it is already in use(Concurrent Modification Exception)
				
			}
		}
		//Returning the set2 which containing NonRepeated  Integers
		return set2;
		
	}
	public static void  getNonRepeatedNumbres(int[] arr )
	{
		//Calling the method find() which takes Array[Integers] as argument
		//This find() will returns the Set of NonRepeated  Integers
		Set<Integer> set=find(arr);	
		//If size  of set >=1 then there are few integers which are Non Repeated 
		if(set.size()>=1)
		{
			//Printing those  every Integers in set 
			System.out.println("Non Repeated Integers are=");
			for(Integer i:set)
			{
				System.out.println(i);
			}
		}
		//If set.size==0, Then there are no Integers Which are Non Repeated..............
		else
		{
			System.out.println("There are no repeated numbers in a given array");
		}
	}
	public static void main(String[] args)
	{
		
		//Checking weather args.length>=2
		if(args.length>=2)
		{
			
			int[] arr=new int[args.length];
			int index=0;
			for(String str:args)
				
			{
				try{
					//If arguments.length>=2, then converting them into Integers,
					//If any arguments is string "abc" it is not possible to convert to integer exception throws  
				arr[index]=Integer.parseInt(str);
				index++;
				}
				catch(Exception e)
				{
					//the raised exception will handled here
					System.out.println(e.getMessage()+" is an illegal argument");
					
				}
			}
			getNonRepeatedNumbres(arr);
		}
		else
		{
			System.out.println("ERROR==please enter more or equal to 2  integer  arguments ");
		}
		
		
		
	}
	// Thank you..............

}
