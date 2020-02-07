package Pratice;

public class TicketBooking implements PayTm {

	public static void main(String[] args) {
		
		PayTm pt = new TicketBooking();
		pt.bookTicket();
		pt.cancelTicket();
		A();
		
		//TicketBooking aa=new TicketBooking();
		//aa.
		

	}

	@Override
	public void bookTicket() {
		
		System.out.println("Booking Tic");
		
	}

	@Override
	public void cancelTicket() {
		System.out.println("Cancel tic");
		
	}
	
	public static void A() {
		System.out.println("Own methods");
	}
	
	public void B() {
		System.out.println("Own method with non static method");
	}

}
