package zoho;

import java.util.Scanner;

public class PatternPrinting {
	 public static void printPattern(char patternarray[],int length)
	  {
	   for(int i=0;i<length;i++)
	    {
	     for(int j=0;j<length;j++)
	     {if(j==i || j==length-i-1)
	       System.out.print(patternarray[j]);
	      else
	       System.out.print(" ");
	     }
	     System.out.println();
	    }
	  }
	  



	 public static void main(String args[])
	 {
	  Scanner s=new Scanner(System.in);
	  char patternarray[];
	   System.out.print(" Sample Input : ");
      String string=s.nextLine();
	  int length=string.length();
	  patternarray=string.toCharArray();
      printPattern(patternarray,length);
	 }
}
