package Exam_08_Practice;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student("정문희", 14000);
		Bus bus1 = new Bus(5, 20, 30000);
		
		s1.takeBus(bus1);
		s1.showInfo();
		bus1.showInfo();
		
	}

}
