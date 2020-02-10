package JavaPractice;

public class Variables {
	
	int data=50;    //instance variable 
	static int m=100;  //static variable  

	public static void main(String[] args) {
		
		int data=50;//instance variable 
		
//		static String str = "hell"; //Illegal modifier for parameter str; only final is permitted
		
//        static int me=100; //static variable (Note:Illegal modifier for parameter me; only final is permitted) 
		
		final int me=100; // We can declare final here not static variable wit data type
		
//        Variables.method() //Cannot make a static reference to the non-static method method() from the type Variables
		
		Variables vars = new Variables(); // Here created instance for calling Non-Static method into Static method 
		vars.method();
		
		staticMethod(); // Here we calling static method directly into static one bcoz no need of creating instance for it
		
	}
	public static void staticMethod() {
		
		System.out.println("Static variable");
	}
	
	void method(){  
		 int n=90;//local variable  
		
		 staticMethod(); //Static method we can call directly into the Non-Static method without reaction instance
		 
		 System.out.println("Non Static Method");
		 
		}  
}
