package day.three;

public class NestedForDemo1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
	}

}
/*
 
i   j   i*j
1 x 1 = 1	2 x 1 = 2
1 x 2 = 2  2 x 2 = 4

1 x 10 = 10 

*/