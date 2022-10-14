package exam02_01;

public class Parent {
	
	public Parent() {
		this(10); //밑에 인자가 있는 생성자 먼저 호출됨.
		System.out.println("Parent 생성자 호출");
	}
	public Parent(int i) {
		System.out.println("인자가 있는 Parent 생성자 호출");
	}
}
