package Exam15;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVar1 = new String("정문희");
		String strVar2 = "정문희";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else {
			System.out.println("다른 String 객체를 참조");
			
		}
		if(strVar1.equals(strVar2)) {
			//equals는 Object클래스의 객체=> 주소값을 비교.
			//String에서 오버라이드한 equals는 파라미터(인자,멤버변수)의 값을 비교함.
			System.out.println("같은 문자열을 가짐");
			
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
