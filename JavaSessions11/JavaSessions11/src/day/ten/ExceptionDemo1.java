package day.ten;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		try {
		int c = a / 0;
		System.out.println("The div is : " + c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends successfully...");
	}
}