package day.seven;

class Parent {
	protected int x,y;
	public Parent(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public Parent(){
		System.out.println("Hi! This is parent default constructor..");
	}
	public void showParent() {
		System.out.println("Hi! This is parent show..");
	}
}

class Child extends Parent{
	private int z;
	public Child(int x,int y,int z) {
		super(x,y); //it invokes super class parameterized constructor...
		this.z = z;
	}
	public Child() {
		super();//it invokes super constructor...
		System.out.println("Hi! This is child default constructor...");
	}
	public void sum() {
		System.out.println("The sum is : " + (x+y+z));
	}
	public void showChild() {
		System.out.println("Hi! This is child show..");
	}
}
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.showParent();
		child.showChild();
	Child child2 = new Child(10,20,30);
	child2.sum();
	}
}