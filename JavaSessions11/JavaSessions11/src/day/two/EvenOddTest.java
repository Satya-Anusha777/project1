package day.two;

import java.util.Scanner;

public class EvenOddTest {

	public static String evenOdd(int n) {
		if(n % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		String result = evenOdd(n);
		System.out.println(result);
	}
}
