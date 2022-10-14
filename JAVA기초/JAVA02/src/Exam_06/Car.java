package Exam_06;

public class Car {
	
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;
	
	//생성자
	public Car() {
		this.company = "BMW";
		this.model = "BMW500";
		this.maxSpeed = 350;
		this.currentSpeed = 100;
	}
	//오버로딩된 생성자.
	public Car(String company, String model, int maxSpeed, int currentSpeed) {
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	//메서드
	public void speedUp() {
		this.currentSpeed = this.currentSpeed + 1;
	}
	//오버로딩된 메서드
	public void speedUp(int speed) {
		this.currentSpeed = this.currentSpeed + speed;
	}
	public int speedDown () {
		this.currentSpeed = this.currentSpeed - 1;
		return currentSpeed;
	}
	//오버로딩된 메서드
	public int speedDown (int speed) {
		this.currentSpeed = this.currentSpeed - speed;
		return currentSpeed;
	}
	public void speedDown1 (int speed) {
		this.currentSpeed = this.currentSpeed - speed;
	}
	
	public void up() {
		this.currentSpeed = this.currentSpeed +2;
	}
	
	public int down () {
		this.currentSpeed = this.currentSpeed -3;
		return this.currentSpeed;
	}
	public void up(int speed) {
		this.currentSpeed = this.currentSpeed + speed;
	}

}
