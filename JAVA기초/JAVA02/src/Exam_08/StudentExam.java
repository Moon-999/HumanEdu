package Exam_08;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(5000, "정문희");
		Student s2 = new Student(10000, "김택선");
		Student s3 = new Student(20000, "구서연");
		Bus bus1 = new Bus(1, 10, 10000);
		Bus bus2 = new Bus(2, 5, 5000);
		Subway sw1 = new Subway(1, 50, 20000);
		Taxi taxi1 = new Taxi(5, 30000);
		
		s1.take(bus1);
		s1.showInfo();
		bus1.showInfo();
		System.out.println("------------------------");
		s1.take(bus2);
		s1.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("------------------------");
		s2.take(bus2);
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("------------------------");
		s2.take(sw1);
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		sw1.showInfo();
		System.out.println("------------------------");
		s3.take(taxi1);
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		sw1.showInfo();
		taxi1.showInfo();
		
	}

}
