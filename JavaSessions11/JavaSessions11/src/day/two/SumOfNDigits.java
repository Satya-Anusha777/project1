package day.two;

public class SumOfNDigits {
	public static int getSumOfNDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 4561;
		int sum = getSumOfNDigits(n);
		System.out.println("The sum of digits is :" + sum);
	}
}



