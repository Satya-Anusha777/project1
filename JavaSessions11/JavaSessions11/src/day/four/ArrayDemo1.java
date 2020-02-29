package day.four;

import java.util.Scanner;

public class ArrayDemo1 {

	public static int getSmall(int a[]) {
		int small = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < small)
				small = a[i];
		}
		return small;
	}
	public static void main(String[] args) {
		int a[] = new int[5];	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 nmberrs");
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		int small = getSmall(a);
		System.out.println(small);
	}
}


