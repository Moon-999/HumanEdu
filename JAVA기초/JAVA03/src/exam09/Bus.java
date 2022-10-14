package exam09;

public class Bus extends Car{
	public Bus() {
		System.out.println("Bus객체 생성");
	}
	@Override  //버스요금에 대해 오버라이드
	public int getCharge() {
		money = 1450;
		System.out.println("버스의 교통요금: "+money);
		return money;
	}
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
