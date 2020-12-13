package training;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String [] args)
	{
		
		System.out.println("Please enter a value");
		
		Scanner s=new Scanner (System.in);
	
		int fact = s.nextInt();
		
		int rev=0;
		int cube=0;
		
		int temp=fact;
		
		while (fact>0)
		{
			rev=fact%10;
			fact=fact/10;
			cube=cube+(rev*rev*rev);
			
		}
		
	if (temp==cube)
	{
		System.out.println("This is armstrong number");
	}	
	else
		
			System.out.println("This is not armstrong number");
		
	}
}
