package zoho;


public class MySingleTon {
     
    private static MySingleTon myObj;
    
    private MySingleTon(){ //creating private constructor
         
    }
   
    public static MySingleTon getInstance(){
        if(myObj == null){
            myObj = new MySingleTon();  //creating static method to get instance
        }
        return myObj;
    }
     
    public void display(){
        System.out.println("private constructor is created");
    }
     
   
}
