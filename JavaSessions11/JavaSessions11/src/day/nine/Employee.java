package day.nine;

abstract public class Employee {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	protected String mobile;

	public Employee() {
		super();
	}
	public Employee(int id, String firstName, String lastName, String address, String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
	}
	public String getFullName() {
		return firstName +" "+lastName;
	}
	
	public void showDetails() {
		System.out.println("Id :" + id);
		System.out.println("Full Name :" + getFullName());
		System.out.println("Gross Salary :" + computeSalary());
		System.out.println("Address  : " + address);
		System.out.println("Mobile :" + mobile);
	}
	
	abstract public double computeSalary();
	
	public void sendMessage() {
		System.out.println("Salary added successfully...");
	}
}
