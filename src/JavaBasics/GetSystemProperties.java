package zoho;

import java.util.Properties;

public class GetSystemProperties {
 
        public static void main(String[] args) {
              
                 Properties prop = System.getProperties();
                 //To get system properties use,
                 //static Properties getProperties() of System class.
                 // getProperties is a static method.
                 
                 System.out.println("Printing all System properties");
                 /*
                  * To print all system properties use
                  * static void list(PrintStream ps) method of System
                  * class.
                  */
                 prop.list(System.out);
                 
                 
        }
}
