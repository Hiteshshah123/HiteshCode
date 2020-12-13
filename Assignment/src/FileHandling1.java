//how to read text file character by character
//how to read text file line by line

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {

	public static void main (String arg[]) throws IOException
	
	{
		
		File f=new File("../Assignment/src/Practice/my.txt"); // parent directory 
		
		FileReader f1=new FileReader(f);
		BufferedReader bf=new BufferedReader(f1); // read line by line
	//	int a;
	//	while((a=f1.read())!=-1) // -1 indicate the end of the file
	//	{
		//	System.out.println((char)a); // convert integer to char
	//		f1.close();
	//	}
	
	  String s;
	  while((s=bf.readLine())!=null) // readline method return String value
{
	System.out.println(s);
}
	}
	
}
