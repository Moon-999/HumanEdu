package Exam01;

public class TvExam {

	public static void main(String[] args) {
		Tv tv = new Tv();
		RemoteControl rc = tv;
		//RemoteControl rc = new Tv(); 랑 같은 의미
		//앞은  인터페이스 - 뒤는 구현클래스
		//rc는 구현객체라고 하고,
		//Tv는 구현클래스라고 합니다.
		rc.turnOn();
		rc.SetMute();
		RemoteControl.changeBatt(); //static으로 선언했기 때문에 RemoteControl로 선언.
	}

}
