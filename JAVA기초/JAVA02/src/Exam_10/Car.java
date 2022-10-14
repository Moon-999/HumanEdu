package Exam_10;

public class Car {
	static String company = "현대자동차";      //static으로 설정한 것은 this.사용 불가
	static String model = "그랜져";
	static String info;
	
	static {     //정적 멤버만 들어올 수 있음 
		info = company + "-" + model;
	}
}
