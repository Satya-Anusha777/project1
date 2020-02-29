package day.four;

import java.util.Scanner;

public class TwoDim {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}	
		}
		System.out.println("Given matrix is :");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j)
				System.out.print(a[i][j]+"\t");
				else
					System.out.print("\t");	
			}	
			System.out.println("\n");
		}
	}
}