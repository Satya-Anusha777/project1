package day.nine;

public class EmployeeDemo {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(100,"SACHIN","TENDULKAR",9999.99,2000.00,"20-20,EAST,MUMBAI","989898988");
		fullTimeEmployee.showDetails();
		
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(101,"VIRAT","KOHLI",120,150.00,"50-50,WEST,MUMBAI","888888888");
		partTimeEmployee.showDetails();
	}
}