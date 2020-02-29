package day.one;

public class NextMultipleOf100 {
	public static int getNextMultipleOf100(int n) {
		return ((n / 100 )+ 1) * 100;
	}
	
	public static void main(String[] args) {
		int n = 445;
		int value = getNextMultipleOf100(n);
		System.out.println(value);
	}
}
/*
    sum of n digits
	read 3 numbers and find the biggest
 
 */