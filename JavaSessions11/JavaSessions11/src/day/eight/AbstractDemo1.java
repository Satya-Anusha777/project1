package day.eight;
/*Abstract Class:- A class which contains atleast 1 abstract method.  An abstract
  ----------------  method means without body. 
  1) An abstract method and class must be declared by using the keyword abstract
  2) An abstract class may also contains concrete methods
  3) If a class inherits abstract class then it must override all abstract
  4) We cannot create object for abstract class but we can create reference
  */

abstract class NewMaths{
	abstract public void sum(int x,int y);
	public void sub(int x,int y) {
		System.out.println("The subtraction is :" + (x - y));
	}
	abstract public void mul(int x,int y);
}
class Calculate extends NewMaths {

	public void sum(int x, int y) {
		System.out.println("The subtraction is :" + (x + y));
	}
	public void mul(int x,int y){
		System.out.println("The multiplication is :" + ( x * y));
	}
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.sum(10, 20);
		calculate.sub(10, 20);
		calculate.mul(10, 5);
		NewMaths maths = new Calculate();
		maths.sum(10, 20);
		maths.sub(10, 20);
		maths.mul(10, 5);
	}
}