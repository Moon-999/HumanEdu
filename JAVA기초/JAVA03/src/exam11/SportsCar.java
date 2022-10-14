package exam11;

public class SportsCar extends Car{

	@Override
	public int speedUp() {
		this.currentSpeed = currentSpeed + 10;
		return this.currentSpeed;
	}

	@Override
	public int getCharge() {
		return 1450;
	}
	//부모인 Car에서 추상메서드가 있으니 꼭 구현바람.
}
