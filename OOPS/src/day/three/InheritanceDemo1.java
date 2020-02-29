package day.three;

class Parent {
	protected int x,y; //it is accessible in child classes
	
	public Parent() {
		System.out.println("This is parent constructor...");
	}
	public Parent(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void showParent() {
		System.out.println("It is parent...");
	}
}
class Child extends Parent {
	private int z;
	
	public Child() {
		super(); //it invokes super class default constructor
		System.out.println("This is Child constructor...");
	}
	
	public Child(int x,int y,int z) {
		super(x,y); //parameterized constructor
		this.z = z;
	}
	public void showChild() {
		System.out.println("It is child...");
	}
	public void sum(){
		System.out.println("The sum is :" + (x+y+z));
	}
}

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new  Child();
		child.showParent();
		child.showChild();
		
		Child child2 = new Child(10,20,30);
		child2.sum();
	}
}