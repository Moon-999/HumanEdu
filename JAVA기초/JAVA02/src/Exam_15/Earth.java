package Exam_15;

public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;  //이렇게 처음에 초기값을 정해주지 않았다면,
	
	static {   //static 생성자 안에서 초기화 한번 가능
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
