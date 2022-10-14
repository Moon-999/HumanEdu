package Exercise;

public class MyPoint {
	int x;
	int y;
	double x1y1;
	
	
	
	MyPoint (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x, int y) {
		this.x1y1 = Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
		
		return this.x1y1;
	}
	public void drawLine (int m, int t) {
		//화면에 선을 그리는 무언가를 코딩
	}
	public void drawRect (int m, int t) {
		//화면에 상자를 만드는 무언가를 코딩
	}

}
