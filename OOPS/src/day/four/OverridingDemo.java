package day.four;

/* Ovverriding:- if super class method and sub class method names are same and parameters are same 
   ----------- */

class Parent {
	public void show(){
		System.out.println("Hi! It is parent class show...");
	}
}
class Child extends Parent {
	public void show(){
		System.out.println("Hi! It is child class show...");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}
}
