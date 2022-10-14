package Exam15;

public class StringIndexOfExam {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		//같은 문자열이 있는 위치를 반환하여 location에 대입한다. "프로그래밍"이 3번째 위치에 있음.
		System.out.println(location);
		
		
//		System.out.println(subject.indexOf("자바")); //0
//		System.out.println(subject.indexOf("자바를")); //-1
		if(subject.indexOf("자바") != -1) { //-1은 없다는 뜻
			//subject.indexOf("자바") => 0 출력됨.
			System.out.println("자바와 관련된 책이군요");
			
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}

}
