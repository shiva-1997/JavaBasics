package zoho;

import java.util.Scanner;
import java.util.StringTokenizer;

public class split {
	public static void main(String[] args)
	   {
	      String str = " ";
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter the string");
	      str = s.nextLine();
	      StringTokenizer st = new StringTokenizer(str);
	      String[] tokens = str.split(" "); 
	      System.out.println("splitting using split() function");
	       for (int i = 0; i < tokens.length; ++i) 
	          System.out.println(tokens[i]);
	      System.out.println("splitting using tokeniser");
	      while (st.hasMoreTokens())
	         System.out.println(st.nextToken());
	          }
}
