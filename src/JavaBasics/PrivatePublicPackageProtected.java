package zoho;
import addition.*;//package is imported
public class PrivatePublicPackageProtected {
		public static void main(String args[])
	{
		add objadd=new add();
		System.out.println(objadd.addition(5,6));
		//System.out.println(objadd.subtraction(6,5)); cannot be called since subtraction is a protected method
		pugdog pdobj=new pugdog();
		dog dobj=new dog();
		pdobj.pug();//since public visibility
		pdobj.move();//since public visibility
		pdobj.anim();//since public visibility
		dobj.anim();//since public visibility
		//pdobj.display();    since it has private visibility
		}
	
}
abstract class animal
{
	public abstract void move();
	
	public void anim()
	{
		System.out.println("all are animals");
	}
}
class dog extends animal
{   
	private boolean x=true;
	private void display()
	{
		System.out.println("inside dogs");
	}
	public void move()
	{
		System.out.println("running");
	}
	
}
class pugdog extends dog
{
	public void pug()
	{
		System.out.println("pug dog is a dog");
	}
}
