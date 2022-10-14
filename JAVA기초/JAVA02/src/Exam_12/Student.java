package Exam_12;

public class Student {
	private static Student s = new Student();
	private Student() {
		
	}
	public static Student getInstance() {
		return s;
	}
}
