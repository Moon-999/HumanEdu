package PracticeExercise;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public double getDistance(int m, int t) {
		double result;
		result = Math.sqrt((this.x-m)*(this.x-m) + (this.y-t)*(this.y-t));
		return result;
	}

}
