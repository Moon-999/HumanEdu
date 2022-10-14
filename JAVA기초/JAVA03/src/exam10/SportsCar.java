package exam10;

public class SportsCar extends Car{
	public int speedUp() {
		this.currentSpeed++;  
		//currentSpeed라는 변수가 메서드 내에서 중복 사용되지 않으므로 this.생략 가능
		return this.currentSpeed;
	}
	public int getCharge() {
		return 1450;
	}
}
