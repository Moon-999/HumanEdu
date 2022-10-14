package Exam08;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.test("100", "a100");
		}
		catch(NumberFormatException e) { //Exception으로 처리해도 가능.->e.getMessage로 프린트.
			System.out.println("NumberFormatException 발생");
		}
		
		
		System.out.println("시스템을 종료합니다.");
	}

}
