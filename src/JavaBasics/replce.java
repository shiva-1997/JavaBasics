package zoho;

import java.util.Scanner;

public class replce {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String"); 
		String string=sc.nextLine();
		System.out.println("enter the substring to be replaced ");
		String subString=sc.nextLine(); 
		System.out.println("enter the substring to be replaced with ");
		String subStringreplace=sc.nextLine(); 
		System.out.println("enter the char to be replaced ");
		char c=sc.nextLine().charAt(0);
		System.out.println("enter the char to be replaced with ");
		char creplace=sc.nextLine().charAt(0);
		
		System.out.println("replacing the char with:"+string.replace(c,creplace));
		System.out.println("replacing the given substing:"+string.replaceAll(subString,subStringreplace));				
			
	}

}
