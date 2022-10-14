package exam01;
//자식객체
public class SportsCar extends Car{ //extends = Car라는 부모객체에게 상속받음을 의미 
	public SportsCar(int currentSpeed){
		super(currentSpeed);  //부모클래스의 생성자 호출
		this.currentSpeed = currentSpeed;
	}
	public void turboSpeedUp() {
		this.currentSpeed = this.currentSpeed + 10;
	}
}
