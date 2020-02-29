package day.six;

public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private double balance;
	private String mobile;
	
	public Customer(){}
	public Customer(int id, String firstName, String lastName, double balance, String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance
				+ ", mobile=" + mobile + "]";
	}
}