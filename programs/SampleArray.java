package programs;

/**
 * Author Pradeep Kumar Nemmani
 * ij13b
 */

/**
 * Question:-Amazon
 Find an element in the array following the condition a[i] =i.
 
 Explanation:-What I  Understood is, a is an integer array and i is an integer element
 for  every i element I need to store in a array in i index(a[i]=i).
 */

/**
 * Algorithm
 *create a  private global variable which type is integer[]
 * create a method for  store the elements in array ie.store(int[] intArr), In this method, store the element in a[] based on element index
 * finally create print() which prints elements in array
 *
 */
public class SampleArray
{
    private static int[] a;


    //store(int[] intArr) ia a method which takes int[] as argument
    public static void store(int[] intArr)
    {
        //creating an  object for int[] a length is array argument length
     a=new int[intArr.length];
        //For every integer element in array argument storing in to array a.for example 1 is stored in a[1]=1, if second element is 3 then a[3]=3,a[5]=5,a[7]=7....        for(Integer i:intArr )
       for(Integer i:intArr)
        {
            a[i]=i;
        }


    }
    //print() prints the elements in a[]
    public static void print()
    {
        //for Every Integer in a[] printing in console
        for(Integer i:a)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {

        int arr[]={0,1,3};

        store(arr);
        print();

    }
}


