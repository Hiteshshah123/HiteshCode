//write file 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {

	public static void main (String arg[]) throws IOException
	
	{
		
		File f=new File("../Assignment/src/Practice/my1.txt"); // parent directory //connection
		//FileWriter fw=new FileWriter(f);
		FileWriter fw=new FileWriter(f,true);           // to append a value in same file
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		fw.write("Salesforce china");
		b.newLine(); // for moving to next line 		
		b.write("Java testing");
		b.close();

	}
	

}
