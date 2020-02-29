package day.six;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a = 10,b=0;
		int n[] = new int[5];
		try {
			//System.out.println(n[5]); throws arrayIndex
		int c = a / b;
		System.out.println("The div is :" + c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Program ends successfully...");		
	}
}
