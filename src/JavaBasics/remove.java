package zoho;

import java.util.Scanner;

public class remove {
	public static void main(String[] args) 
    {
        int i,l;
        String str,substr,res=" ";
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the string:");
        str= s.nextLine();
        l=str.length();
        System.out.println("\n\nenter the suubstring you want to remove:");
        substr= s.nextLine();
        
      for( i=0;i<l;i++)
      {
         ch = str.charAt(i);
         
         if(!(ch>='0' && ch<='9'))
         res+=ch;
             
      }
          res = res.replace(substr,"");        
          System.out.println("\n"+res);
    
        
    }

}
