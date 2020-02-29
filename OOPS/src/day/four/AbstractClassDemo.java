package day.four;

abstract class Math {
	//concrete method
	public void sum(int x,int y) {
		System.out.println("The sum is :" + (x + y));
	}
	//abstract method
	abstract public void sub(int x,int y);
}
class Calculate extends Math {
	@Override
	public void sub(int x, int y) { 
		System.out.println("The subtraction is :" +(x - y));
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.sum(10, 20);
		calculate.sub(10, 20);
	}
}