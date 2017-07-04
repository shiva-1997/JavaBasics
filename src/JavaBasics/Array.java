package zoho;

import java.util.Scanner;

public class Array {
	public static void main(String ab[])
	{
	int temp,i,j,r,k,l=0,m=0,count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the array size");
	int n=s.nextInt();
	int a[]=new int[n];
	int max=0;
	System.out.println("Enter the array elements");
	for(i=0;i<n;i++)
	{
	a[i]=s.nextInt();   //Get array input and find max element in the array
	if(a[i]>max)
	max=a[i];
	}
	int b[]=new int[max+1];   //create an array for the size of max element like an bucket sort
	for(i=1;i<max+1;i++)
	{
	b[i]=0;                    //Initialize array elements to '0'
	}

	for(i=0;i<n;i++)
	{
		r=a[i];                 //assign counts to the new array based on the index
		b[r]++;
	}
	for(i=0;i<max+1;i++)
	{
		if(b[i]!=0)              //calculate the unique elements present and store it in 'count'  
		count++;
	}
	for(i=0;i<count;i++)
	{
				l=0;                   
		for(j=0;j<max+1;j++)
		{
			if(b[j]>l)
			{                          //to find the element with max frequency
			l=b[j];
			m=j;                     
			}
		}
		for(k=0;k<l;k++)
		{
			System.out.println(m);       //display the max frequent element
		}
		b[m]=0; // max the current max element as '0' to find the next max element
		}
}
}