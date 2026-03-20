package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("This is cash on delivery method.");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payment is working");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("card payment is working");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet is working");
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("payment details recorded protected");
		
	}
	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		amazon.cardPayments();
		amazon.upiPayments();
		amazon.cashOnDelivery();
		amazon.internetBanking();
		amazon.recordPaymentDetails();
	}
	

}
