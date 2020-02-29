package day.nine;

public class PartTimeEmployee extends Employee {

	private int hoursWorked;
	private double amountPerHour;
	
	public PartTimeEmployee() {
		super();
		}
	
	public PartTimeEmployee(int id, String firstName, String lastName, int hoursWorked, double amountPerHour,
			String address, String mobile) {
		super(id,firstName,lastName,address,mobile);
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;
	}
	
	public double computeSalary() {
		return hoursWorked * amountPerHour;
	}

}
