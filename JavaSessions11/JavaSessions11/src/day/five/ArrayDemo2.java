package day.five;

import java.util.Scanner;

public class ArrayDemo2 {

	public static int zeroCountInArray(int a[]) {
		int count = 0;
		for(int i=0; i < a.length; i++) {
			count += zeroCountInNumber(a[i]);
		}
		return count;
	}
	public static int zeroCountInNumber(int n){
		int count = 0;
		while(n > 0) {
			int r = n % 10;
			if(r == 0)
				count++;
			n = n / 10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int a[] = new int[5];	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 nmbers");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int count = zeroCountInArray(a);
	System.out.println(count);
	}
}


