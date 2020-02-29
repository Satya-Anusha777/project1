package day.eight;
/* Overriding:- If a method declared in super class and re defined in the sub class is called
   ------------  as overriding. It is also called as dynamic polymorhism.
 */
class Parent {
	public void show() {
		System.out.println("Hi! This is parent show...");
	}
}
class Child extends Parent {
	public void show() {
		System.out.println("Hi! This is child show...");
	}
}

public class OverridingDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}
}
