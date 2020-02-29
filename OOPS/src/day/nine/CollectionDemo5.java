package day.nine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionDemo5 {
	public static void main(String[] args) {
		ArrayList <Employee> arrayList = new ArrayList<Employee>();
		Employee employee1 = new Employee(100,"SACHIN","TENDULKAR",9999.99);
		arrayList.add(employee1);
		Employee employee2 = new Employee(102,"KOHLI","VIRAT",8998.88);
		arrayList.add(employee2);
		Employee employee3 = new Employee(103,"DHONI","MAHENDER",7887.77);
		arrayList.add(employee3);
		Employee employee4 = new Employee(105,"DRAVID","RAHUL",9999.99);
		arrayList.add(employee4);
		System.out.println(arrayList);
		for(Employee emp : arrayList) {
			System.out.println("Fist Name : " + emp.getFirstName());
			System.out.println("Last Name : " + emp.getLastName());
			System.out.println("Salary :" + emp.getSalary());
		}
	}
}