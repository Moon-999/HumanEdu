package Exam01;

public class Human {

	public static void main(String[] args) {
		//case1 : NULLPointerException 발생 사례
//		Human human1 = new Human();
//		human1.run();
//		human1 = null;
//		human1.run();
		
//		//case2 : ArrayIndexOutOfBoundsException
//		int[] scores = {10,20,30};
//		System.out.println(scores[3]); //배열에는 0~2번째까지만 존재하기 때문.
		
		//case3 : NumberFormatException(숫자로 변경 불가.)
//		String str = "a100";
//		int intstr = Integer.parseInt(str); //str을 정수로 변환하는 메서드임. 문자가 섞여있으면 불가.
//		System.out.printf("intstr : %d \n", intstr);
		
		
		
	}

	private void run() {
		System.out.println("사람이 달리다");
	}
	
	

}
