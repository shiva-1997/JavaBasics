package zoho;
import java.util.Scanner;

import addition.*;
public class sum {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	add obj=new add();
	System.out.println(obj.addition(a,b));
}
}
