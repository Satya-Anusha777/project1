package day.ten;

class AgeException extends Exception {
	public String toString() {
		return "Invalid Age entered...";
	}
}

class Person {
	private int age;
	private String name;

	public Person(int age, String name) {
		super();
		if(!(age >= 1 && age<= 150)) {
			try {
				throw new AgeException();
			} catch (AgeException e) {
				e.printStackTrace();
			}
		} else {
			this.age = age;
			this.name = name;
		}
	}
	public void show() {
		System.out.println("Age :" + age);
		System.out.println("Name :" + name);
	}
}

public class ThrowDemo1 {
	public static void main(String[] args) {
		Person p1 = new Person(24,"SACHIN");
		p1.show();
		Person p2 = new Person(-24,"SACHIN");
		p2.show();

	}
}