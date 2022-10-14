package exercise02;

public class Circle extends Shape{
	public static final double PI = 3.141592;//math.PI도 가능.
	private double r; //private과 public 상관 없음.
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calcArea() {
		double x =  this.r * this.r * PI;
		return x; //변수 x 없이 r*r*PI로 해도 가능.
	}

}
