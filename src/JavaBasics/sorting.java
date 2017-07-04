package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class sorting {
	public static void main(String []args){
		
		int i=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter number of string you want to enter:");
       int  n = s.nextInt();
        String arr[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string array:");
        for(i = 0; i < n; i++)
        {
            arr[i] = s1.nextLine();
        }
		String []arr1=arr;
		System.out.println("\n***Before Sort***");
		for(i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		Arrays.sort(arr1);
		System.out.println("\n***After Sort Using Inbuild function***");
		for(i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
		System.out.println("\n***After Sort Without Using Inbuild function***");
		 n=arr1.length;
		for (i = 0; i < n; i++) 
        	{
            		for (int j = i + 1; j < n; j++) 
            		{
                		if (arr1[i].compareTo(arr1[j])>0) 
                		{	
                    			String temp = arr1[i];
                    			arr1[i] = arr1[j];
                    			arr1[j] = temp;
                		}
            		}
        	}
		for(i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
	}
}
