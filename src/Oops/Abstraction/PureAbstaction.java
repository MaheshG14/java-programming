package Oops.Abstraction;

public class PureAbstaction
{
	  public static void main(String[] args)
	  {
		
		  PaymentGateway request1= new  PayPal();
		  request1.initiatePayment(10000);
		  request1.verifyPayment("TNX006");
		  
	  }

}

interface PaymentGateway

{
	void initiatePayment(double amount);
	void verifyPayment(String transactionId);
	
}
class PayPal implements PaymentGateway
{

	@Override
	public void initiatePayment(double amount) {
		System.out.println("Pay  initiate amount : "+amount);		
	}

	@Override
	public void verifyPayment(String transactionId) {
		System.out.println("Pay  initiate amount  od Transcation id : "+transactionId);		
	}
		
	}
	
class Razorpay implements PaymentGateway
{

	@Override
	public void initiatePayment(double amount) {
		System.out.println("Razorpay  initiate amount : "+amount);		
	}

	@Override
	public void verifyPayment(String transactionId) {
		System.out.println("Razorpay  initiate amount  od Transcation id : "+transactionId);		
	}
	
}
