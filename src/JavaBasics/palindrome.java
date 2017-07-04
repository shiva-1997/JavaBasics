package zoho;

import java.util.Scanner;

public class palindrome {
	
	private void rev(String str)
	{
		String str_rev="";
		 

	      for(int i=str.length()-1;i>=0;--i) 
	      {
	 
	         str_rev +=str.charAt(i);
	     
	      }
	 
	    
	 
	    
	     if(str_rev.equals(str))
	       {

	       System.out.println("The string is Palindrome \n  proved by using String class"); 
	  
	       }
	 
	    else
	      { 
	 
	       System.out.println("Not Palindrome \n proved by using String class");
	  
	      }

				
	}

	public static void main(String args[])
	   
	   {
	  
		palindrome palin=new palindrome();
	     String str;
	      
	    Scanner scan = new Scanner(System.in);

	 
	   System.out.print("Enter a String : ");
	 
	    str= scan.nextLine();
		if(str.equals(new StringBuffer(str).reverse().toString())){
			System.out.println(str+" is a palindrome \nusing reverse function");
		}else{
			System.out.println(str+" is not a palindrome  \nusing reverse function");
			
		}
         palin.rev(str);
		
		
			      
	   

	   StringBuffer str1 = new StringBuffer(str);
	     
	   StringBuffer str2 = new StringBuffer(str1.reverse());
	      
	   if((str2.toString()).equals(str1.toString()))
	   {
	   
	    System.out.println("The string is Palindrome \n by using StringBuffer class"); 
	      
	   }
	     
	   else
	     {
	 
	       System.out.println("Not Palindrome \n by using StringBuffer class");
	          
	      }
	      

	   
	}

	


}
