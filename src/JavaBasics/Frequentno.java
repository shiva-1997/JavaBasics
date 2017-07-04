package zoho;

import java.util.Scanner;

public class Frequentno {
	   public static void main(String[] args)

	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int i,j,count=0;
		int a[][]=new int[n][2];
		for(i=0;i<n;i++)
		{
			if(i==0)
		{
		a[i][0]=s.nextInt();	
		}
			else
			{
			int temp=s.nextInt();
			for(j=0;j<=i;j++)
			{
				if(temp==a[j][0])
				{
					a[j][1]++;
					break;
				}
				if(j==i)
					a[i][0]=temp;
				count++;
			}
			}
		}
		for(i=0;i<count;i++)
		System.out.println(a[i][1]+1);
	}

}
