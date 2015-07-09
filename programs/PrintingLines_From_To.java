package programs;
/**
 * @author Pradeep kumar Nemmani,
 * 		   iji3b,
 * 	       dots2drops.
 */
/**
 * Question:-
 * 			  Print the line from 20 to 30th  of a file
 * Explanation:-
 * 			  This Question is to print the lines form 20 to 30  in a given file.
 * Algorithm:- 
 * 			  1)Take a file,Check weather file is a absoluteFile 
 * 			  2)If File is Absolute File Start reading the file using Buffered reader.Here load each line
 * 				and count that line till 20
 * 			  3)start writing lines from when count is 20
 * 			  4)end writing when count of line reach 30
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PrintingLines_From_To {
	public static void startPrinting(File file) throws FileNotFoundException,
			IOException {
		//checking weather file is absolute file or not 
if(file.isFile())
{
	//if file is  absolute file then initialize count =0
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				//for every line loaded increase the count by 1;
				//when count reaches 20 start writing that line
				//stop writing when count reach 30
				count++;
				if (count >= 2 && count <= 30) {
					System.out.println(line);
				}
			}
		}
}
else
{
	//print error message if the file is not absolute file
	System.out.println("Entered file is not  a file");
}
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException 
			{
		System.out.println("In Main");
		
		startPrinting(new File("C:\\d2d\\prog\\UnaryOperater.java"));
		
			
		
	}

}
