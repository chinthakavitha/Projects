public class exampleAccessmodifiers {
	//private String name;
	//protected void display() {
	 //System.out.println("welcome to java");
 public int count;
	 public void display() {
		 System.out.println("welcome");
		 System.out.println("It have "+ count + "letters.");
	}

      //class modifier extends exampleAccessmodifiers {
   
 public static void main(String args[]) 
      {
	 exampleAccessmodifiers obj=new exampleAccessmodifiers ();
	 obj.count=7;
	 obj.display();
    	  
    //	modifier mod =new modifier();
    //	mod.display();
	//exampleAccessmodifiers d =new exampleAccessmodifiers();
	//d.name = "programize"; 
	//we get error here because to access variables from private  we have to use methods
	//we cannot access private methods directly.
	}

}
