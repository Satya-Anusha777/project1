package day.seven;

public class PartTimeEmployee {
	private int id;
	private String firstName;
	private String lastName;
	private int hoursWorked;
	private double amountPerHour;
	private String address;
	private String mobile;
	
	public PartTimeEmployee() {
		super();
		}
	
	public PartTimeEmployee(int id, String firstName, String lastName, int hoursWorked, double amountPerHour,
			String address, String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;
		this.address = address;
		this.mobile = mobile;
	}

	public String getFullName() {
		return firstName +" "+lastName;
	}
	public double computeSalary() {
		return hoursWorked * amountPerHour;
	}
	public void showDetails() {
		System.out.println("Id :" + id);
		System.out.println("Full Name :" + getFullName());
		System.out.println("Gross Salary :" + computeSalary());
		System.out.println("Address  : " + address);
		System.out.println("Mobile :" + mobile);
	}
	public void sendMessage() {
		System.out.println("Salary added successfully...");
	}
}
