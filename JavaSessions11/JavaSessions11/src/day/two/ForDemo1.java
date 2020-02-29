package day.two;

public class ForDemo1 {

	public static String getNumbers(int n) {
		String result="";
		for(int i=1; i<=n; i++){
			result=result+i+" ";
		}
		return result;
	}
	public static void main(String[] args) {
		String result = getNumbers(15);
		System.out.println(result);
	}
}