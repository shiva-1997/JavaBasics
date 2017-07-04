package zoho;

import java.util.Scanner;

public class TowerOfHanoi1 {
	private void tower(int no, String start, String intermediate, String end)
	{
		if(no>0)
	      //if n0==1 then the recursive statements will not execute only the print statement works
		//thus the base case solution if size one move disc from start to end is executed
		{
	      tower(no-1,start,end,intermediate);
	      //to move n-1 discs from start to intermediate the intermediate pole becomes the end pole 
	      System.out.println("Move disc "+no+" from "+start+" to "+end);
	      /***after moving n-1 discs to the intermediate the bottom or highest disc in start in moved to the end
	        **(i.e)suppose size is 3 then disc 3 is moved from start to end(A->C).*/
	      tower(no-1,intermediate,start,end);
	      /***here the start becomes the intermediate and the intermediate becomes start
	        **(i.e)suppose size is 3 then disc is already in end..
	        **now disc 1,2 are in the intermediate to move them to end the start becomes the intermediate
	        **since start is the empty disc and end remains the same here.*/
	    }
	}
	public static void main(String args[])
	{
		TowerOfHanoi1 to=new TowerOfHanoi1();
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		to.tower(no,"A","B","C");
	}

}
