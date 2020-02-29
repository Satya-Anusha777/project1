package day.one;

class Sample {
	private int x,y; //state
	public void read() {
		x = 100;
		y = 200;
	}
	public void show() {
		System.out.println(x);
		System.out.println(y);
	}
}
public class ClassDemo1 {

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.read();
		sample.show();
	}
}
