package day.five;

import java.util.Scanner;

public class StringDemo2 {

	public static int vowelCount(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.toUpperCase().charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' ||c=='U')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.nextLine();
		int count = vowelCount(str);
		System.out.println(count);
	}
}