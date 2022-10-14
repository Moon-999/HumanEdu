package Exam_18.packA;

public class B {
	public static void main(String[] args) {
		
		A a1 = new A(true); 
		//public은 동일 Package이므로 OK.
//		A a2 = new A(10); 
		//private은 동일 Package라도 생성자 접근 불가.
		//private은 동일 클래스 내에서만 접근 가능
		A a3 = new A(1.1, 5); 
		//default인 경우는 동일 Package에서 접근 가능
	}

}
