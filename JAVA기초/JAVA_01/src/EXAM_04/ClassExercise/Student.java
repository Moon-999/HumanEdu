package EXAM_04.ClassExercise;

public class Student {
	public String name;
	public int kor;
	public int math;
	public int eng;
	
	public Student() {
		name = "정문희";
		kor = 90;
		math = 80;
		eng = 100;
				
	}

	public Student(String string, int i, int j, int k) {
		name = string;
		kor = i;
		math =j;
		eng = k;
	}

}
