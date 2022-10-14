package Exercise;

public class Student_Exam {

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAvg());
		System.out.println("=============================");
		
		Student t = new Student("김택선",3, 25, 50, 40, 20);
		System.out.println("이름 : "+t.name);
		System.out.println("총점 : "+t.getTotal());
		System.out.println("평균 : "+t.getAvg());
		System.out.println("=============================");
		
		Student m = new Student("정문희", 2, 14, 100, 70, 30);
		System.out.println("이름 : "+m.name);
		System.out.println("총점 : "+m.getTotal());
		System.out.printf("평균 : %.2f ",m.getAvg());
		
		

	}

}
