package PracticeExercise;

public class StudentExam {

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println("이름 : "+s.name);
		System.out.println("국어점수 :"+s.kor);
		System.out.println("총합 : "+s.getTotal());
		System.out.println("평균 : "+s.getAvg());
		System.out.println(s.info());
		s.getinfo();
			
		
	}

}
