package day.five;

public class PartTimeEmployee extends Employee {
	private int workedHours;
	private double amountPerHour;

	public PartTimeEmployee() {
		super();
	}
		
	public PartTimeEmployee(int id, String firstName, String lastName, int workedHours, double amountPerHour) {
		super(id, firstName, lastName);
		this.workedHours = workedHours;
		this.amountPerHour = amountPerHour;
	}
	
	public double computeSalary() {
		return workedHours * amountPerHour;
	}
	
}