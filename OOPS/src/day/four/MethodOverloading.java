package day.four;

/*Method Overloading:- Writing multiple methohds in a class with samem name but different in paramters */

class Maths {
	public void sum(int x,int y) {
		System.out.println("The sum is :" + (x + y));
	}
	public void sum(int x,int y,int z) {
		System.out.println("The sum is :" + (x + y + z));
	}
	public void sum(double x,double y) {
		System.out.println("The sum is :" + (x + y));
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.sum(10, 20);
		maths.sum(10, 20, 30);
		maths.sum(1.2, 2.5);
	}
}
