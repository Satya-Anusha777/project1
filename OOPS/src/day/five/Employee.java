package day.five;

abstract public class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	
	public Employee() {
	}
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String showFullName() {
		return firstName +" "+ lastName;
	}
	public void sendMessage() {
		System.out.println("Salary added....");
	}
	public void showDetails() {
		System.out.println("Id :" + id);
		System.out.println("Full Name :" +showFullName());
		System.out.println("Gross Salary : " + computeSalary());
	}
	abstract public double computeSalary();

}
