package Exam05;

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
		catch(NullPointerException e) {
			System.out.println("NullPoint 예외가 발생했습니다.");
//			System.out.println(e);
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		catch(NumberFormatException fe) {
			System.out.println("NumberFormat 예외가 발생했습니다.");
			System.out.println(fe.getMessage());
		} //NumberFormat예외처리를 해주지 않으면 finally 수행 후 시스템 다운.
		finally {
			System.out.println("finally를 실행합니다.");
		}
		System.out.println("시스템을 종료합니다.");
		
	}

	private void run() {
		System.out.println("사람이 달리다");
	}
	
	

}
