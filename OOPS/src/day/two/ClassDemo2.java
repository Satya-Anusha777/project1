package day.two;

class Sample {
	private int x,y; //instance variables  or object variables
	
	/*constructor:- it is used to initialize the values of object and automatically 
	  called when object is created 
	  
	  Rules:-1) method name must be same as class name
	         2) no return type (not even void) 
	  2 types: 1) default constructor:- no parameterized constructor
	           2) parameterized constructor: constructor with parameters 
	 */
	public Sample() {} //default
	
	//paramterized
	public Sample(int x,int y) {
		this.x = x;
		this.y = y; 
	}
	
	//this keyword is used when local variable and instance variable name is same
	public void read(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
}
public class ClassDemo2 {
	public static void main(String[] args) {
		Sample sample1 = new Sample();//default constructor called
		sample1.read(10,20);
		sample1.show();
		Sample sample2 = new Sample(100,200);//parameterized constructor
		sample2.show();
	}
}
