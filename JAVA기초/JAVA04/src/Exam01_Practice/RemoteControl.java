package Exam01_Practice;

public interface RemoteControl {
	public static int MIN_VOL = 0;
	public void turnOn();
	default void setMute() {
		System.out.println("볼륨을 0으로 설정합니다.");
	}
	static void changeBatt() {
		System.out.println("배터리를 갈아주세요.");
	}
}
