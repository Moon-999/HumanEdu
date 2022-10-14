package Exam15;

public class StringTrimExam {

	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "   123   ";
		//입력받은 데이터의 정합성 체크를 위해서 trim이란 메서드 사용
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
