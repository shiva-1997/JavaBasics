package zoho;

public class override {
	String x;
	public static void main(String args[])
	{
          override over =new override();
          override over1 =new override();
	System.out.println(over.toString());
	System.out.println(over.equals(over1));
	System.out.println(over.length());
	}
	public override()
	{
	this.x="zoho strings";
	}
	public String toString()
	{
	return x;
	}
	public Boolean equals(override over1)
	{
             if(this.x.equals(over1.x))
	          return true;
             else
             return false;
	}
	public int length()
	 {
	return 28;		
		} 
	}