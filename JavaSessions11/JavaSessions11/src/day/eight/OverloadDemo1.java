package day.eight;
/* Overloading :- If we write multiple methods in a class with the  same name 
  -------------  but difference in parameters.  It is also called as compiletime
  polymorphism.  
 */

class Maths {
	public void sum(int a,int b){
		System.out.println("The sum is :" + (a + b));
	}
	public void sum(double a,double b){
		System.out.println("The sum is :" + (a + b));
	}
	public void sum(int a,int b,int c){
		System.out.println("The sum is :" + (a + b + c));
	}
}
public class OverloadDemo1 {
	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.sum(10, 20);
		maths.sum(10.25, 20.25);
		maths.sum(10, 20, 30);
	}
}

