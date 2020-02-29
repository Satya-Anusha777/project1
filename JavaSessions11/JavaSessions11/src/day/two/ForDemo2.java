package day.two;

public class ForDemo2 {

	public static String getTable(int n) {
		String result="";
		for(int i=1; i<=10; i++){
			result += n+" x "+ i+" = "+ (n * i)+"\n";
		}
		return result;
	}
	public static void main(String[] args) {
		String result = getTable(5);
		System.out.println(result);
	}
}

/*
1) read a number and print it is prime or not
*/