
public class mobilePhone {
	// private so it cannot be modified by other classes
	// instance variables for the mobilePhone class
	private String owner;
	private String colour;
	private double screenSize;
	
	// methods that mobilePhones can do
	// should be public so other classes can access and use
	// the method
	public void ring() {
		// prints out ring
		System.out.println("ring, ring, ring");
	}
	
	// method to send an SMS to a receiver
	// takes in an input of the intended target and the 
	// sms message and prints it out
	public String sendSms(String receiver, String message) {
		// prints the message
		System.out.println(message);
		return("Successfully sent");
	}
	
	
	
	
}
