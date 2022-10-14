package exam09;

public class Car {
	public int money;
	public Car() {
		System.out.println("Car객체 생성");
	}
	public int getCharge() {
		money = 1600;
		System.out.println("일반적인 교통요금: "+money);
		return money;
	}
}
