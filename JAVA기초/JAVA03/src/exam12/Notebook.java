package exam12;

public abstract class Notebook extends Computer{

	@Override
	public void display() {
		System.out.println("노트북을 화면에 출력하다.");
	}
	
	public abstract void typing();  //아예 삭제해도 되지만 abstract형태로 남겨두는 것이 좋음.

	
	
}
