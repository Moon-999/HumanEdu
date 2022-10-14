package Exam01;

import java.util.ArrayList;
import java.util.List;

public class Human {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		//List는 인터페이스 / ArrayList는 구현클래스.
		list1.add("Human1");
		list1.add("Human2");
		list1.add(10);
//		System.out.println(list1.get(0));
		
		
		String str1 = (String) list1.get(0);
		//list1.get(0)는 Object 타입.
		//Object는 상위, String은 하위 => 상위에서 하위로 변환할때는 강제타입변환 필요.
		//1. 강제타입의 변환이 꼭 필요함
		//2. String을 Object타입 클래스로 변환
		System.out.println(str1);
		
		int intStr = (int)list1.get(2);  //정수인 10을 가져올 수 있음
		System.out.println(intStr);
		
		//처음부터 String만 담겠다고 규정하면 강제타입변환 필요 없음.
		List<String> list2 = new ArrayList<String>();
		//<String>만 담겠다는 정의 => 제네릭 문법.
		//list2에는 String만 담길 수 있으며 다른 것은 에러처리.
		list2.add("Human1");
		list2.add("Human2");
//		list2.add(10); => String이 아니라서 에러처리.(사전에 에러체크 가능)
		list2.add("Human3");
		
		String str2 = list2.get(0); //강제타입변환 없어도 에러 없음.
		System.out.println(str2);
		
	}
}
