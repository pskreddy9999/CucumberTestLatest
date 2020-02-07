package Pratice;


public class AbstractExample  extends PaytmAbstract{

	public static void main(String[] args) {
		
		
		PaytmAbstract pa =new AbstractExample();
		
		pa.bookTicket();
		pa.draw();
		pa.fun();

	}

	@Override
	void draw() {
		System.out.println("Draw the line");
		
	}

	@Override
	void fun() {
		System.out.println("Fun game");
		
	}


}
