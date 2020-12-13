package training;

public class Assign3 {

	
		public Assign3()
		{
			this (1,2,3,4);
		
		System.out.println("default constructor");
		}
		
		public Assign3(int a)
		{
			this (11,12);
		
			System.out.println("1 parameterized constructor");
		}
		public Assign3(int a, int b)
		{
			this();
			System.out.println("2 parameterized constructor");
			
		}

		public Assign3(int a, int b, int c)
		{
			this(4);
			System.out.println("3 parameterized constructor");
			
		}
						
		public Assign3(int a,int b, int c, int d)
		{
		    
			System.out.println("4 parameterized constructor");
		}
		
		public static void main(String args[])
		{
			
			Assign3 obj3=new Assign3(50,60,70);
			
			
		}
			
}