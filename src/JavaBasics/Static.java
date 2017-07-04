package zoho;

public class Static {
	public static void main(String args[]) 
	{
		StaticMethod.display();//no object is necessary to invoke the static method
		//StaticMethod.print();//cannot be invoked since it is non static
	}
}
class StaticMethod
{
	static void display()
	{
		System.out.println("STATIC METHOD is invoked");
	}
	void print()
	{
		System.out.println("NON-static");
	}
	
}