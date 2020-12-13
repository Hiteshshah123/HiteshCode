//To read a particular line from file

package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {

public static void main (String arg[]) throws IOException
	
	{
		File f=new File("../Assignment/src/Practice/my1.txt"); // parent directory //connection
		
		FileReader fr=new FileReader(f);
	
		BufferedReader bf= new BufferedReader(fr);
		
		String p;
		int abc=0;
		System.out.println("Enter start linenumber");
	    Scanner s=new Scanner(System.in);
	    int x=s.nextInt();
		while((p=bf.readLine())!=null)
		{
			abc=abc+1;
			
			if (abc==x)
			{
				System.out.println(p);
				break;
			}
		}
	}	
			
		
		
	
	
}
