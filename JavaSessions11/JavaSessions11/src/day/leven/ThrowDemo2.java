package day.leven;

class AgeException extends Exception {
	public String toString() {
		return "Invalid Age entered...";
	}
}

class Person {
	private int age;
	private String name;

	public Person(int age, String name) throws AgeException {
		super();
		if(!(age >= 1 && age<= 150)) {
				throw new AgeException();			
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

public class ThrowDemo2 {
	public static void main(String[] args) {
		Person p1;
		try {
			p1 = new Person(24,"SACHIN");
			p1.show();
			Person p2 = new Person(-24,"SACHIN");
			p2.show();
		} catch (AgeException e) {
			e.printStackTrace();
		}
	}
}