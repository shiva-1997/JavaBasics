package zoho;

import java.util.Scanner;

public class check {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be checked:");
		String string=sc.nextLine();
		System.out.println("using inbulit functions");
		int upper=0,lower=0,digit=0,special=0;
		for(char c:string.toCharArray()){
			if(Character.isUpperCase(c)){
				upper++;
			}
			else if(Character.isLowerCase(c)){
				lower++;
			}
			else if(Character.isDigit(c)){
				digit++;
			}
			else{
				special++;
			}
		}
		System.out.println("Number of Upper Case:"+upper);
		System.out.println("Number of Lower Case:"+lower);
		System.out.println("Number of digit:"+digit);
		System.out.println("Number of special Case:"+special);	
		System.out.println("using ascii values functions");
		int i;
       int up=0,low=0,dig=0,space=0;
        char ch[]=string.toCharArray();
        int n=string.length();
    for( i=0;i<n;i++)
      {
         if(ch[i]>=65 && ch[i]<=90) // Condition for Uppercase letters
         up++;
         if(ch[i]>='a' && ch[i] <='z')
         low++;
         if(ch[i]>='0' && ch[i]<='9')
         dig++;
         if(ch[i]==' ') // Condition for spaces
         space++;
      }
    System.out.println("\n uppercase"+up+"\n lowecase"+low+"\n digits"+dig+"\n space"+special);
        
        
        
	}

}
