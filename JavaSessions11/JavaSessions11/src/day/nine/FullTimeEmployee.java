package day.nine;

public class FullTimeEmployee extends Employee {
	private double basicSalary;
	private double bonusAmount;
	
	public FullTimeEmployee() {
		super();
		}
	public FullTimeEmployee(int id, String firstName, String lastName, double bonusAmount,double basicSalary, String address,
			String mobile) {
		super(id,firstName,lastName,address,mobile);
		this.basicSalary = basicSalary;
		this.bonusAmount = bonusAmount;
	}

	public double computeSalary() {
		return basicSalary + bonusAmount;
	}
}
