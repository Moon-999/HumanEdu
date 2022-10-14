package Exam_21;

public class Car {
	
	private int currentSpeed;
	private int maxSpeed;  //차량 최고 속도가 300km이상은 안되는 자동차
	
	public Car(int currentSpeed,int maxSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}
	public void speedUp() {
		this.currentSpeed++;
	}
	public void setCurrentSpeed(int currentSpeed) {
		if(currentSpeed>this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		}
		else {
			this.currentSpeed = currentSpeed;
		}
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
