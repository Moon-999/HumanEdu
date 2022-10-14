package Exam_19.packC;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student("정문희", 15000);
		Bus bus1 = new Bus(5, 15, 45000);
		s1.take(bus1);
		s1.showInfo();
		bus1.showInfo();
	}

}
