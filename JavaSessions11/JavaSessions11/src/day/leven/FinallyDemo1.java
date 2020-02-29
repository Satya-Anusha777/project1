package day.leven;

class Sample {
	public void A(){
		System.out.println("A is started...");
		try {
			throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("A finally executed...");
		}
		System.out.println("A is ended...");
	}

	public void B(){
		System.out.println("B is started...");
		try {
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("B finally executed...");
		}
		System.out.println("B is ended...");
	}

	public void C(){
		System.out.println("C is started...");
		try {
			return;
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("C finally executed...");
		}
		System.out.println("C is ended...");
	}
}
public class FinallyDemo1 {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.A();
		obj.B();
		obj.C();
	}
}