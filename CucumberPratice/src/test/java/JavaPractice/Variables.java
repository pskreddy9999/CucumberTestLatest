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
		
//       vars.method();
		
//       staticMethod(); // Here we calling static method directly into static one bcoz no need of creating instance for it
		
//       vars.Widening(); // Widening the values 
		
//      vars.Narrowing(); // Narrowing the values
		 
		 vars.Operators();
		
  } 
	public static void staticMethod() {
		
		System.out.println("Static variable");
	}
	
	void method(){  
		 int n=90;//local variable  
		
		 staticMethod(); //Static method we can call directly into the Non-Static method without reaction instance
		 
		 System.out.println("Non Static Method");
		 
		}  
	
	public void Widening() {
		
		int a= 21;
		float f =a;
		
		System.out.println("Before widening value in a: "+ a);
		System.out.println("After widening value a(f): " + f );		
	}
	
	public void Narrowing() {
		
		float f= 21.0F;
		int a = (int) f;
		
		System.out.println("Before narrowing :  " +f);
		System.out.println("After narrowing: " +a);
		
	}
	
	public void  Operators() {

/***Unary Operators***/
		int a = 10;
	
		System.out.println(a++); // first a value print then increase the value by (Note: After printing a = 11)
		System.out.println(++a);  // a= 11 and + 1 = 12 now a=12
		
		System.out.println(a--); // a=12 it will print a value first then -1 (Note: After Printing a= 11)
		System.out.println(--a); // a=11 and -1 = 10 now a = 10 
		
		
		System.out.println(a++ + ++a); // 10 + 1 + 1 + 10 = 22
		System.out.println(a-- - --a); // 22  - 1 - 1 -22 = 2
		
		int b = -10;
		boolean c = false;
		boolean d = true;
		
		System.out.println(~a); //-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);  //9 (positive of total minus, positive starts from 0)
		System.out.println(!c);
		System.out.println(!d);
		
		int f = 5;
		
/*** Arithmetic ***/
		
		System.out.println(a/f);  // 10/5 2 is divided
		System.out.println(a%f);  // 10%5 0 is remainder

/*** Left shift ***/
		System.out.println(10<<2);  //10*2^2=10*4=40  
		System.out.println(10<<3);  //10*2^3=10*8=80  
		System.out.println(20<<2);  //20*2^2=20*4=80  
		System.out.println(15<<4);  //15*2^4=15*16=240  

/*** Right Shift ***/	
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  

/*** Shift 	Operator ***/
		
		System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    
/*** And Operator ***/
	    
	    int x = 10;
	    int y = 20;
	    int z=5;
	    System.out.println(x<y&&y<x); //false x<y 'ok' but y<x 'not satisfied'
		System.out.println(x>z&y<z); //false  x>z 'Ok' but y<z 'Not satisfied'
		System.out.println(x<y&y>z); //true   x<y 'OK' and y>z 'Satisfied'
		System.out.println(z<x&&y>x); 
		
/*** OR ***/
		
		System.out.println(x<y||x<z); //true, x<y is true and x<z false
		System.out.println(x>y||x<z); //false both condition are false
		
/*** Ternary ***/
		
		int min=(x<z)?x:z;
		System.out.println(min); // it will print min value
		
		int min2=(x<y)?x:y;
		System.out.println(min2);
		
		int max= (y>x)?y:x;
		System.out.println(max); // It will print max value
		
/*** Assignment ***/	
		
		x+=5;
		y-=11;
		System.out.println(x); //x= 10 then x=x+5(x=10+5) = 15 
		System.out.println(y); //y=20 then y=y-11(y=20-11) = 9
		
		x*=2;
		System.out.println(x); //Here x=15 then x*2=30;
		
		x/=2;
		System.out.println(x); // Here x=30 then x/2 = 15
		
/*** Short ***/
		short a1 =10;
		short a2 = 10;
	//   a1= a1+ a2; //Compile time error because 10+10=20 now int   
		             //Type mismatch: cannot convert from int to short
		System.out.println(a1);
		
		a1 = (short) (a1+a2);
		System.out.println(a1);
 	}
}
