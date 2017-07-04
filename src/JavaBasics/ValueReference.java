package zoho;

//Java doesn't pass method arguments by reference; it passes them by value.
public class ValueReference {
	int x=10;
	int y=20;
	String a="my name";
	String b="is shiva";
	Integer[] arr={4,3,2,1};
	public void intswap(int var1,int var2) //method to swap arrays
	{
		System.out.println("using variables for swapping/call by value");
		System.out.println("inside intswap method");
		System.out.println("before swappping");
		System.out.println("var1: "+var1+"var2: "+var2);
		int temp=var1;
		var1=var2;
		var2=temp;
		System.out.println("after swapping");
		System.out.println("var1: "+var1+"var2: "+var2);
	}
	public void objswap(ValueReference obj1,ValueReference obj2)//method to swap variables of object
	{
		System.out.println("using reference for swapping/call by reference");
		System.out.println("inside objswap method");
		System.out.println("before swappping");
		System.out.println("x: "+obj1.x+"y: "+obj2.y);
		int temp=obj1.x;
		obj1.x=obj2.y;
		obj2.y=temp;
		System.out.println("after swapping");
		System.out.println("x: "+obj1.x+"y: "+obj2.y);
	}
	public void stringswap(String s1,String s2) //method to swap strings
	{
		
		System.out.println("using  String variables for swapping/call by value");
		System.out.println("inside stringswap method");
		System.out.println("before swappping");
		System.out.println("String s1: "+s1+"String s2: "+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("after swapping");
		System.out.println("String s1: "+s1+"String s2: "+s2);
		
	}
  public void arraysort(Integer[] var)//method to sort array
  {
  	System.out.println("using  integer array to sort");
		System.out.println("inside arraysort method");
		System.out.println("before sorting value of var[] array");
		for(int i=0;i<var.length;i++)
		System.out.print(var[i]+" ");
		System.out.println();
		for(int i=0;i<var.length;i++)
		{
			for(int j=0;j<var.length-i-1;j++)
			{
				if(var[j]>var[j+1])
				{
					int temp=var[j];
					var[j]=var[j+1];
					var[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting the value of val[] array");
		for(int i=0;i<var.length;i++)
			System.out.print(var[i]+" ");
			System.out.println();
  }
  	
 
	public static void main(String[] args)
	{
		ValueReference p1=new ValueReference();
		System.out.println("in main method before swappping");
		System.out.println("x: "+p1.x+"y: "+p1.y);
		p1.intswap(p1.x,p1.y);
		System.out.println("in main method after swapping");
		System.out.println("x: "+p1.x+"y: "+p1.y);
		System.out.println();
		System.out.println();
		
		
		ValueReference p2=new ValueReference();
		System.out.println("in main method before swappping");
		System.out.println("x: "+p1.x+"y: "+p2.y);
		p2.objswap(p1,p2);
		System.out.println("in main method after swapping");
		System.out.println("x: "+p1.x+"y: "+p2.y);
		System.out.println();
		System.out.println();
		
		System.out.println("in main method before swappping");
		System.out.println("String a: "+p1.a+"String b: "+p1.b);
		p1.stringswap(p1.a,p1.b);
		System.out.println("in main method after swapping");
		System.out.println("String a: "+p1.a+"String b: "+p1.b);
		System.out.println();
		System.out.println();
		
		System.out.println("value of arr array in mian method before sorting");
		for(int i=0;i<p1.arr.length;i++)
			System.out.print(p1.arr[i]+" ");
			System.out.println();
		p1.arraysort(p1.arr);
		System.out.println("value of arr array in mian method after sorting");
		for(int i=0;i<p1.arr.length;i++)
			System.out.print(p1.arr[i]+" ");
			System.out.println();
			
	   		
		
		
		
		
		
		
	}

}
