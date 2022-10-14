package Exam_07;

public class Car {
	
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	//생성자
	public Car() {
//		this.company = "BMW";
//		this.model = "BMW500";
//		this.maxSpeed = 350;
//		this.currentSpeed = 100;
		
		this("BMW", "BMW500", 350, 100);
		//=Car car2 = new Car("기아","K7", 350, 60);
		//생성자 내에서 this는 오버로딩된 생성자 중 인자의 갯수 및 타입이 동일한 생성자로 처리됨.
		
	}
	//오버로딩된 생성자.
	public Car(String company, String model, int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	

}
