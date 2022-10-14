package EXAM_04.ClassExercise;

public class StudentExam {

	public static void main(String[] args) {
		Student t1 = new Student();
		t1.name = "B군";
		t1.kor = 90;
		t1.math = 80;
		t1.eng = 70;
		
		System.out.println(t1.name);
		System.out.println(t1.eng);
		
		Student t2 = new Student();
		t2.name = "c양";
		t2.kor = 10;
		t2.math = 90;
		t2.eng = 80;
		
		System.out.println(t2.name);
		System.out.println(t2.math);
	}

}
