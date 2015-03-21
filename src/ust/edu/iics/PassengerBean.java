package ust.edu.iics;

public class PassengerBean {
	private String lastName;
	private String firstName;
	private String destination;
	private String creditCardNumber;  
	private String stopNumber;

	public PassengerBean() {
	}
	
	public PassengerBean(String lastName, String firstName, String destination,
			String creditCardNumber, String stopNumber) {
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getStopNumber() {
		return stopNumber;
	}

	public void setStopNumber(String stopNumber) {
		this.stopNumber = stopNumber;
	}
	
}