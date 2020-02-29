package day.five;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = null;
		employee = new FullTimeEmployee(100,"SACHIN","TENDULKAR",4500,2000);
		employee.showDetails();
		employee = new PartTimeEmployee(101,"DHONI","MAHI",77,100);
		employee.showDetails();
	}
}
