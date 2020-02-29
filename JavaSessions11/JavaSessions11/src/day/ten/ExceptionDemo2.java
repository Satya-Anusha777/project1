package day.ten;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			a[5] = 10/2;
			System.out.println("The div is : " + a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program ends successfully...");
	}
}