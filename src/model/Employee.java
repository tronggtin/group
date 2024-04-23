package model;

public class Employee {
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private int identity;
	

	public Employee(String firstName, String lastName, int dateOfBirth, int identity) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.identity = identity;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getIdentity() {
		return identity;
	}


	public void setIdentity(int identity) {
		this.identity = identity;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
