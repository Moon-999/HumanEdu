package EXAM_04.ClassStudent;

public class Student {
	//멤버변수
	public String name;       //이름
	public int kor;           //국어점수
	public int math;          //수학점수
	public int eng;           //영어점수
	
	
	//생성자(class명과 동일)
	public Student () {     
		name = "정문희";
		kor = 80;
		math = 80;
		eng = 80;
	}


	public Student(String name, int kor, int math, int eng) {
		this.name = name; //this.는 나 자신
//		this.kor = kor;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
   


	
}
