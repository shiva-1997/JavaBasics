package zoho;

class Outer_Demo {
	   int num;
	   private class Inner_Demo {// protected inner class
	      public void print() {
	         System.out.println("This is an inner class");
	      }
	   }
	   void display_Inner() {
	      Inner_Demo inner = new Inner_Demo(); // Accessing the inner class
	      inner.print();
	   }
	}
	   
	public class My_class {

	   public static void main(String args[]) {
	   
	      Outer_Demo outer = new Outer_Demo();   // Instantiating the outer class 
	  
	      outer.display_Inner();     // Accessing the display_Inner() method.
	   }
	}