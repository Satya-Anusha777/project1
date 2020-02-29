package day.seven;

class InvalildAgeException extends Exception {
	public String toString() {
		return "Invalid age engtered...";
	}
}

class Person {
	private int age;
	private String name;
	
	public Person() {}
	
    public Person(int age,String name) throws InvalildAgeException {
		if(age > 130){
				throw new InvalildAgeException();
			}
		else {
			this.age = age;
			this.name = name;	
		}
	}
	public void show() {
		System.out.println("Age :" + age);
		System.out.println("Name :" + name);
	}
}

public class ExceptionDemo3 {
	public static void main(String[] args) throws InvalildAgeException {
	Person p1 = new Person(25,"SACHIN");
	p1.show();
	Person p2 = new Person(250,"dhoni");
	p2.show();
	}
}
