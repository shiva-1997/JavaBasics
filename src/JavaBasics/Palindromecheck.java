package zoho;

import java.util.Scanner;
import java.lang.StringBuffer;


public class Palindromecheck {
	static int count=0;
	private static boolean palindrome(String string) {
		if(string.equals(new StringBuffer(string).reverse().toString()))//function to check palindrome
		   return true;
		return false;
	}
	private static void palindromechecker(String[] words) {
		StringBuffer palincheck= new StringBuffer();
		int i,j;
		for(i=0;i<words.length-1;i++)
		{
			palincheck=new StringBuffer();
			palincheck.append(words[i]);
			for(j=i+1;j<words.length;j++)
			{
				palincheck.append(words[j]);
				if(palindrome(palincheck.toString()))
				{
					count++;
					System.out.println(palincheck.toString());//function to check any palindrome removing whitespaces
				}
				else
					break;
			}
		}
	}


	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String palin=s.nextLine();
		String[] words=palin.split("[,| |.]");
		int i,j;
		for(i=0;i<words.length;i++)
		{
			if(palindrome(words[i])&&(words[i].length()>1))
			{
				System.out.println(words[i]);
				count++;
			}
		}
		palindromechecker(words);
		System.out.println("Total no of palindromes:");
		System.out.println(count);
	}

	
	}
