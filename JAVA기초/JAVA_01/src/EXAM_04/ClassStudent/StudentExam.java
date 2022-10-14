package EXAM_04.ClassStudent;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student();       //s1이란 학생을 생성함
		s1.name = "A군";                  //각각의 멤버변수에 등록함.
		s1.kor = 100;
		s1.math = 90;
		s1.eng = 30;
		
		Student s2 = new Student();
		s2.name = "B양";
		s2.kor = 90;
		s2.math = 80;
		s2.eng = 70;
		
		System.out.println("s1 : "+ s1);
		System.out.println("s2 : "+ s2);
		System.out.printf("s1.name : %s \n", s1.name);
		System.out.printf("s2.math : %s \n", s2.math);
	}

}
