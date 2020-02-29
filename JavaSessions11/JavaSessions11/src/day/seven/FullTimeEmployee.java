package day.seven;

public class FullTimeEmployee {
	private int id;
	private String firstName;
	private String lastName;
	private double basicSalary;
	private double bonusAmount;
	private String address;
	private String mobile;
	
	public FullTimeEmployee() {
		super();
		}
	public FullTimeEmployee(int id, String firstName, String lastName, double bonusAmount,double basicSalary, String address,
			String mobile) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.basicSalary = basicSalary;
		this.bonusAmount = bonusAmount;
		this.address = address;
		this.mobile = mobile;
	}
	public String getFullName() {
		return firstName +" "+lastName;
	}
	public double computeSalary() {
		return basicSalary + bonusAmount;
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
