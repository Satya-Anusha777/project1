package day.five;

public class FullTimeEmployee extends Employee {
	private double basicSalary;
	private double bonusAmount;

	public FullTimeEmployee() {}
	public FullTimeEmployee(int id, String firstName, String lastName, double basicSalary,double bonusAmount) {
		super(id, firstName, lastName);
		this.basicSalary = basicSalary;
		this.bonusAmount = bonusAmount;
	}
		public double computeSalary() {
		return basicSalary + bonusAmount;
	}
		public void showDetails() {
			System.out.println("Id :" + id);
			System.out.println("Full Name :" +showFullName());
			System.out.println("Gross Salary : " + computeSalary());
		}

	
}