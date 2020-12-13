//Reading data between specific range of lines
package training;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAss1 {

public static void main (String arg[]) throws IOException
{
	
	File f=new File("../Assignment/src/training/Assignmnt1.txt");
	FileReader fr =new FileReader(f);
	BufferedReader br =new BufferedReader(fr);
    int abc=0;
    System.out.println("Enter start linenumber");
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    System.out.println("Enter End linenumber");
    int y=s.nextInt();
    
    String p;
    while((p=br.readLine())!=null)
	{
    	abc=abc+1;
    	if ((abc>=x) && (abc<=y))
    	{
    		System.out.println(p);
    	}
    	
    	
	}
}
}
