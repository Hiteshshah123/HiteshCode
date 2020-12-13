
//Inheritance - Constructor calling and Super keyword
package Practice;

public class Alto extends Swift {
	
	
	public Alto()
	{
		
	System.out.println("child Default constructor");
					
		}
	
	public Alto(int a)
	{
		super(11);
		System.out.println("child One para constructor");
		
				
		}
	
	public Alto (int a, int b)
	{
		
		System.out.println("child Two para constructor");
		
				
		}
	
	public static void main (String args[])
	
	{
		Alto obj=new Alto(22);
				
	}
	
}
