package zoho;
import java.util.Scanner;
class Break
{
	String dictionary[] = {"i","like","sam","sung","samsung",
            "man","go","mango", "icecream",
            "mobile","ice","cream"};
	int n,count=0;
	boolean dictionaryContains(String word)
	{
	     for (int i = 0; i < dictionary.length; i++)
	        if (word.compareTo(dictionary[i]) == 0)
	            return true;
	    return false;
	}

	boolean wordBreakUtil(String str, int n, String result)
	{
	    
	    for (int i=1; i<=n; i++)
	    {
	         String prefix = str.substring(0, i);
	        if (dictionaryContains(prefix))
	        {
	       
	            if (i == n)
	            {
	            	if(count==0)
	            	System.out.println("YES");//to print yes if the word can be broken into segments
	            	count++;
	                result += prefix;// add this element to previous prefix
	                System.out.println(result); //print result
	                return true;
	            }
	            wordBreakUtil(str.substring(i, n), n-i, result + prefix + " ");
	          //to create another combination if the word can be broken into multiple segments  
	          //blank space is included 
	        }
	    }
	   
	    return false;
	}
	void wordBreak(String str)
	{
	    
	    wordBreakUtil(str, str.length(), "");
	}
   
}
public class WordBreak {
public static void main(String[] args)
{   
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the segment:");
	String seg;
	seg=s.nextLine();
	Break br=new Break();
	br.wordBreak(seg);
	System.out.println(br.count);
	if(br.count==0)
    	System.out.println("NO");//if the word cannot be broken down into segments
}
}
