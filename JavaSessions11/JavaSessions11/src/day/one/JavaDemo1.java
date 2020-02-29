package day.one;

public class JavaDemo1 {
	public static int sum(int x,int y) {
		int sum = x + y; //business logic 
		return sum;
	}
	
	public static void main(String[] args) {
	int x = 10, y = 20; //reading - input
	int sum = sum(x,y);
	System.out.println("The sum is :" + sum);  //printing - output
	}
}

/*
How to call methods in Java
----------------------------
1) if a method is static then we can call using class name
2) if a method is non static we can using object
*/