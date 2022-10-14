package Exam04_2;

public class MemberExam {

	public static void main(String[] args) {
		//원본 객체 생성
		int[] a = {10,20,30};
		Member original = new Member("blue", "홍길동", "12345", 25, true, a, new Car("소나타"));
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		cloned.a[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println(original.password); 
		System.out.println(cloned.password);
		
		System.out.println(original.a[0]);    
		System.out.println(cloned.a[0]);
		
		System.out.println(original.car.model);
		System.out.println(cloned.car.model);
	}

}
