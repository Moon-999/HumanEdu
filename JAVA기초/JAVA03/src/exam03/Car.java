package exam03;

public class Car extends Vehicle {
	int oil;
	public Car() {
		super(); // 생략가능
		System.out.println("Car() 생성");
	}
	public Car(int oil) {
		super(); //현재 생략된 상태.(인자가 없을경우 생략 가능, but 인자가 있을 때는 생략 불가)
		this.oil = oil;
		System.out.println("Car(Int) 생성"+this.oil);
	}
	public Car(int oil, int speed) {
		super(); //생략된 상태.
		this.oil = oil;
		System.out.println("Car(Int) 생성"+this.oil+this.speed);
	}
}
