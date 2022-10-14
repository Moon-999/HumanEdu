package Exam07;

import java.util.HashMap;
import java.util.Map;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(1,"정문희");
		Student s2 = new Student(2,"김택선");
		Student s3 = new Student(3,"정슬기");
		Student s4 = new Student(3,"정슬기");
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(s1, 100);
		map.put(s2, 90);
		map.put(s3, 80);
		map.put(s4, 70);
		//s3와 s4는 같음. 그러나 주소는 다름.
		//s4.equals(s3)
		System.out.println(map);
		
		System.out.println(map.get(new Student(1,"정문희")));
		System.out.println(map.get(new Student(2,"김택선")));
		System.out.println(map.get(new Student(3,"정슬기")));
		//만약, hashCode와 equals를 오버라이드하지 않는다면 위의 3개는 새로운 생성자가 되기 때문에 값이 null로 나온다.

	}

}
