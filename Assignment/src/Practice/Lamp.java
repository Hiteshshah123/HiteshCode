package Practice;


public class  Lamp  
{  

	public String name;
	private double salary;
		


	public Lamp(String empname)
	{		 name=empname;
	}
	
	public void setSalary(double empsal)
	{
		salary=empsal;
		
	}
	
	public void printEmp()
	{
		System.out.println("name :" +name);
		System.out.println("salary:"+salary);
	}
public static void main (String args[])
{
	Lamp nm=new Lamp("Rakesh");
	nm.setSalary(10000);
	nm.printEmp();
}

}

