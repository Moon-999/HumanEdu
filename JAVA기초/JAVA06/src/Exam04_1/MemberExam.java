package Exam04_1;

public class MemberExam {

	public static void main(String[] args) {
		//원본 객체 생성
		int[] a = {10,20,30};
		Member original = new Member("blue", "홍길동", "12345", 25, true, a);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		cloned.a[0] = 100;
		
		System.out.println(original.password); //패스워드에서는 상관없지만
		System.out.println(cloned.password);
		System.out.println(original.a[0]);     //배열에서는 얕은 복제의 문제점이 나타난다.
		System.out.println(cloned.a[0]);
	}

}
