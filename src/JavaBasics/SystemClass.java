package zoho;

import java.io.IOException;

public class SystemClass {
	public static void main(String args[]) throws IOException 
	{
		String current = new java.io.File( "." ).getCanonicalPath();
        System.out.println("Current dir:"+current);
 String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);

	}

}
