package exam02_01;

public class Child extends Parent {
	
	public Child() {
		super();  //부모생성자 호출
		          //상속을 받은 자식클래스의 생성자는 super호출을 기본으로 한다.
		System.out.println("Child 생성자 호출");
	}
	public Child(int i) {
		super(i);
		System.out.println("인자가 있는 Child생성자 호출");
	}
}
