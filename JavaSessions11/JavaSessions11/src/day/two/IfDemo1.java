package day.two;

public class IfDemo1 {

	public static int getBig(int a,int b,int c){
		int big = a;
		if(b > big)
			big = b;
		if(c > big)
			big = c;
		return big;
	}
	public static void main(String[] args) {
		int big  = getBig(10,20,30);
		System.out.println("The biggest is :" + big); 
	}
}
