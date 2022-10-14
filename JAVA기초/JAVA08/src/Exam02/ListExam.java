package Exam02;

import java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;

public class ListExam {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		//List는 인터페이스 = ArrayList는 구현클래스(Vector,LinkedList로 바꿀수있음 =>결과는 모두 동일)
		list.add("휴먼");
		list.add("교육");
		list.add("센터");
		list.add("휴먼");
		//add는 가장 뒤에 배열을 늘려서 추가.
		System.out.println(list);
		
//		String str1 = list.get(2);
		//get은 특정위치의 값을 얻어옴.
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println(list);
		System.out.println(list.get(1));
		list.remove("휴먼");
		//remove는 위치를 지정할 수도 있지만 내부값을 기반으로 삭제 가능.
		//다만, 동일한 내부값이 있다면 맨 앞에만 삭제.
		System.out.println(list);
		//검색시 정렬범위를 벗어나면 에러가 뜸.
		
	}
}
