package exam07;

public class MicroCar extends Car{
	public MicroCar() {
		super();
		System.out.println("MicroCar 객체 생성");
	}
	@Override
	public void run() {
		System.out.println("MicroCar가 달립니다.");
	}
}
