package zoho;

public class stringcopyconcat {
	public static void main(String args[])
	{
		String str="hello";//create a string
		long begin,tot_time;
		begin = System.nanoTime();   // time in nanoseconds
	      String Strcpy = new String(str);//string copy using string class
	      tot_time = System.nanoTime()-begin;//total time in nano seconds
	      System.out.println("copy using string class");
	      System.out.println("time taken is " + tot_time + " nano seconds ");
	      System.out.println("copied string is "+ Strcpy);
	     
	      begin = System.nanoTime();   // time in nanoseconds
	      Strcpy+= str;//string concatination using string class
	      tot_time = System.nanoTime()-begin;//total time in nano seconds
	      System.out.println("concatination using string class");
	      System.out.println("time taken is " + tot_time + " nano seconds ");
	      System.out.println("concatinated string is "+ Strcpy);
	      
	      
	      StringBuilder sbr = new StringBuilder("builds");//create a string using stringbuilder
	      begin= System.nanoTime(); // time in nanoseconds
	      StringBuilder sbrcpy = new StringBuilder(sbr);//string copy
	      tot_time = System.nanoTime() - begin;//total time in nano seconds
	      System.out.println("copy using stringbuilder class");
	      System.out.println("\ntime taken is " +tot_time+ " nano seconds");
	       System.out.println("copied string is " + sbrcpy);
	      
	      //string concatination using stringBuilder 
	      begin= System.nanoTime(); // time in nanoseconds
	      sbrcpy.append(sbr);//string concat using(append)
	      tot_time= System.nanoTime() -begin;//total time in nano seconds
	      System.out.println("concatination using stringBuilder class");
	      System.out.println("time taken is " + tot_time + " nano seconds");
	      System.out.println("concatinated string is " +sbrcpy);
	      
	}

}
