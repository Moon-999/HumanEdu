package exam12_Practice;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("화면을 켜다");
	}
	public void turnOff() {
		System.out.println("화면을 끄다");
	}
	
}
