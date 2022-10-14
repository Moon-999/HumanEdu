package Exam07;

public class Human {

	public static void main(String[] args) {
		
		
		try {
			Human human1 = new Human();
			human1.run();
			human1 = null;
//			human1.run();
			//case1 : NULLPointException 발생 사례
			Human human2 = new Human();
			human2.run();
			
			//case2 : NumberFormatException
			//발생한 예외에 대해서 처리를 하지 않는다면 finally를 수행한 후 시스템은 강제종료됨.
			String str = "a100";
			int intStr = Integer.parseInt(str);
			System.out.println("intstr : "+intStr);
			
			
		}
		catch(NullPointerException | NumberFormatException e) {
			// |는 또는의 의미.
			System.out.println("NullPoint 또는 NumberFormat예외가 발생했습니다.");
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("finally를 실행합니다.");
		}
		System.out.println("시스템을 종료합니다.");
		
	}

	private void run() {
		System.out.println("사람이 달리다");
	}
	
	

}
