package day.six;
interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle draw...");
	}
}

class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Triangle draw..");
	}
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Shape shape = null;
		shape = new Rectangle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}
}

