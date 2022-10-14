package exam04;
//자식객체
public class SportsCar extends Car{ //extends = Car라는 부모객체에게 상속받음을 의미 
	public SportsCar(int currentSpeed){
		super(currentSpeed);  //부모클래스의 생성자 호출
		this.currentSpeed = currentSpeed;
	}
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
	}
	@Override  //annotation을 통해 오류를 사전에 확인가능.
	public void speedUp() { 
		//오버라이딩
		//부모의 메서드를 자식의 입장에서 재정의
		this.currentSpeed = this.currentSpeed + 5;
	}
}
