package exam03;

public class Vehicle {
	int speed;
	public Vehicle() {
		System.out.println("Vehicle() 생성");
	}
	public Vehicle(int speed) {
		this.speed = speed;
		System.out.println("Vehicle(Int) 생성"+this.speed);
	}
}
