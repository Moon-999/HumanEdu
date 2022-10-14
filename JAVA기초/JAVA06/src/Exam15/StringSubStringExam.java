package Exam15;

public class StringSubStringExam {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		//0~6까지 문자열 잘라냄. -> 0:포함 6:제외 ->실질적으로 0부터 5까지 보여주는 것.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		//7에서 끝까지 문자열 잘라냄.
		System.out.println(secondNum);
	}

}
