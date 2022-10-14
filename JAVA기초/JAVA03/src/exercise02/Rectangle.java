package exercise02;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		double y = width * height;
		
		return y;//y 없이 width*height도 가능.
	}

}
