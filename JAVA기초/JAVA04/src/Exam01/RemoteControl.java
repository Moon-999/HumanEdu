package Exam01;

public interface RemoteControl {
	//abstract 생략 가능. 컴파일 과정에서 자동으로 붙음.
	public static int MIN_VOLUME = 0;
	public void turnOn();
	//추상메서드는 메서드를 선언상태까지만 한 것.
	//abstract는 생략 가능. 컴파일 과정에서 자동으로 붙음
	//JAVA 8 버전  이후 추가 기능.
	default void  SetMute() {
		System.out.println("볼륨을 0으로 한다.");
	}
	static void changeBatt() {
		//static은 클ㄹ스 차원의 내용
		System.out.println("배터리를 교체하세요.");
	}
	
}
