package Exam09;

public class Main {

	public static void main(String[] args) {
//		int value = 110;
		Test t = new Test();
		try {
			t.test(110);//위에서 int value 초기값 안정해줬을 때는 바로 값 넣어주기.
		}
		catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println("시스템 종료");
	}

}
