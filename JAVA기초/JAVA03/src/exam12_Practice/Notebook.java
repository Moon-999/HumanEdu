package exam12_Practice;

public abstract class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("노트북 디스플레이 하다");
	}

	@Override
	public abstract void typing();
	
	@Override
	public void turnOn() {
		System.out.println("노트북 화면을 켜다");
	}

}
