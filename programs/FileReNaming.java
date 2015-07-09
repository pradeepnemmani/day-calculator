package programs;

/**
 * Author:- 
 * 			Pradeep Kumar Nemmani,
 * 			ij13b,
 * 			dots2drops.
 */
/**
 * Question:-
 * 			    How to rename all the files at the given directory from .jpg to .jpeg.
 * 				This Question is, To Change the format from .jpg to .jpeg every file in a given directory
 * Algorithm:-
 * 				1)Take one file
 * 				2)Check weather this file is directory or file.
 * 				3)If Given file is directory, Get all files in a given file
 * 				4)For every file in a files check each file, weather  the file is Directory or File
 * 				5)If File is a file then check for format,weather the file is end with ".jpg", Then convert that file to ".jpeg"
 * 				6)If File is directory then get all files in that directory(Repeating step from 2) 
 *       
 */
import java.io.File;
import java.nio.file.Path;


public class FileReNaming 
{
	//this method will ReNames All the files in  agiven directory
	public static void reNameFiles(File file)
	{
		//Checking weather file is directory or file 
		if(file.isDirectory())
		{
			//if the file is directory getting all the file in directory by calling a method getFiles(File file) which takes file as argument
			
		File[] files=getFiles(file);
		 
		for(File f:files)
		{
			//After getting every file in a directory,Checking every file in a files for absoluteFile
			
			 if(f.isFile())
			 {
				 Path path=f.toPath();
				 //If That File is absoluteFile then checking for path ending with ".jpg"
				 if(path.endsWith(".jpg"))
				 {
					 //if the file is ended with ".jpg" then converting the formating from "jpg" to ".jpeg"
					
					 System.out.println(f.getAbsolutePath());
					 System.out.println("*********************************Strucked here************************8");
				 }
			 }
			 else
			 {
				 //if the file is directory get all the file by calling  getAllFiles(File file)
				 File[] files1=getFiles(f);
				 for(File fi:files1)
				 {
					 //Foe every file calling the same method recursively for changing he format 
					 reNameFiles(fi);
				 }
			 }
		}
		}
	}
	//this method will gets all the files in  directory by calling the method file.listFiles();
	public static File[] getFiles(File file)
	{
		File[] files=file.listFiles();
		
		return files;
	}
	public static void main(String[] args)
	{
		System.out.println("In Main");

reNameFiles(new File("C:\\d2d\\prog"));
	}

}
