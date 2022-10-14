package Exam02_2;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setBox("human");
		String str1 = b1.getBox();
		System.out.println(str1);
		//제네릭을 사용하면 강제타입변환 필요 없음. => String으로 타입을 규정하였기 때문.
		
		Box<Integer> b2 = new Box<Integer>();
		b2.setBox(10);
		int intStr = b2.getBox();
		System.out.println(intStr);
		
		//Box를 Object형태로 선언하면 Object 하위인 String이든, int형이든, 그리고 모든 클래스는 사용 가능
		//단, get 시점에 Object를 강제타입변환(강제캐스팅) 필요.

	}

}
