package day.three;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee(100,"SACHIN","TENDULKAR",9898.98);
		System.out.println(employee1); //it calls toString()
		employee1.setLastName("RAMESH TENDULKAR");
		System.out.println(employee1); 
		Employee employee2 = new Employee(101,"DHONI","MAHENDER",7777.77);
		System.out.println(employee2);
		System.out.println("Salary is :" + employee2.getSalary()); 
	}
}