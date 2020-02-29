package day.one;

public class SumOf2Digits {
	public static int getSumOf2Digits(int n) {
		int sum = n / 10 + n % 10;
		return sum;
	}

	public static void main(String[] args) {
		int n = 45;
		int sum = getSumOf2Digits(n);
		System.out.println("The sum of digits is :" + sum);
	}
}