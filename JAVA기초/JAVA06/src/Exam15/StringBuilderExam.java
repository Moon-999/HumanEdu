package Exam15;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		//append는 문자열 뒤에 글자 추가(문자열 연산 +와 같음)
		
		sb.insert(4,  "2");
		System.out.println(sb.toString());
		//insert는 4번째 위치에 "2" 추가
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		//4번째 위치에 '6'으로 문자교체
		
		sb.replace(6,  13, "Book");
		System.out.println(sb.toString());
		//6~13위치의 "Program"을 "Book"으로 교체
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		//4~5위치 삭제(5는 포함x)
		
		int length = sb.length();
		System.out.println("총문자수: "+ length);
		
		String result =sb.toString();
		System.out.println(result);
	}

}
