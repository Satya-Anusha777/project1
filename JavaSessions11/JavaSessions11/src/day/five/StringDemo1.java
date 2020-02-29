package day.five;

public class StringDemo1 {

	public static void main(String[] args) {
		String str = "Hi";
		System.out.println(str.length());
		System.out.println(str.equals("hi"));
		System.out.println(str.equalsIgnoreCase("hi"));
		String str2="Hello World";
		System.out.println(str2.substring(6,11));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase()); 
		System.out.println(str2.charAt(4));
		System.out.println(str2.indexOf('o')); 
		String words[] = str2.split(" ");
		System.out.println(words[0]);
		System.out.println(words[1]);
		String doj="21-10-2019";
		String dates[] = doj.split("-");
		System.out.println("Day:"+dates[0]);
		System.out.println("Month:"+dates[1]);
		System.out.println("Year:"+dates[2]);
	}
}
