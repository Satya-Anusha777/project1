package day.six;

/* There are 2 ways to access the members of a class 
   1) If the members are static then access by Class Name
   2) If the members are non static then access by Object
*/

class Sample {
	//instance variables
	private int x,y;
	
	/* Constructor is a special method which automatically invokes when object is created
	 Method name must be same as its class name and no return type is given.
	 Default constructor is created by compiler itself if we don't create any constructor. 
	 In case if we create a parameterized constructor you must write default also.
	 */
	
	public Sample(){} //default constructor
	
	public Sample(int x,int y){ //parameterized constructor
		this.x = x;
		this.y = y;
	}
	
	public void read(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
	public void sum() {
		System.out.println("The sum is :" + (x+ y));
	}
}

public class ClassDemo1 {
	public static void main(String[] args) {			
		Sample obj = new Sample(); //default constructor called..
		obj.read(10,20);
		obj.show();
		obj.sum();
		Sample obj2 = new Sample(100,200); //parametereized constructor
		obj2.show();
		obj2.sum();
	}
}