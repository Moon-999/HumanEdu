package exam09;

public class Taxi extends Car{
	public Taxi() {
		System.out.println("Taxi객체 생성");
	}
	@Override  //택시요금에 대해 오버라이드
	public int getCharge() {
		money = 8000;
		System.out.println("택시의 교통요금: "+money);
		return money;
	}
}
