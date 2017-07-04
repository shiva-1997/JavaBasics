package zoho;

public class LifeScope {
	public void scope()
	{
		int a=10;
		System.out.println(a);
		
	}
public static void main(String args[])
{
	LifeScope obj=new LifeScope();
	obj.scope();
	//System.out.println(a); scope of variable 'a' is only with its function
	int b=100;
	System.out.println(b);
	System.out.println("lifetime of b ends here");
}
}
