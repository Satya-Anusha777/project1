package day.five;

import java.util.Scanner;

public class TwoDim2 {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3x3 matrix");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}	
		}
	
		for(int i=0; i<a.length; i++) {
			int max = 0;
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t"); 
				if(a[i][j] > max)
					max = a[i][j];
			}	
			System.out.print("=> "+max+"\n");
		}
	}
}