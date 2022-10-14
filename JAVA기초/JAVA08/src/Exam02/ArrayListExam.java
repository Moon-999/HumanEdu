package Exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		//default로 초기용량을 10으로 설정.
		List<String> list2 = new ArrayList<String>(100);
		//초기용량을 100으로 설정.
		List<String> list3 = Arrays.asList("a","b","c","d");
		//컬렉션을 포함해서 초기화 가능.
		//수정불가. 고정적으로 사용할 때 이용.(검색만 가능)
		System.out.println(list3.get(0)); //=>검색기능.
//		list3.add("e"); => list3은 고정되어있기에 추가도 할 수 없음.
//		System.out.println(list3);
		
		List<String> list4 = new ArrayList<String>();
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		System.out.println(list4); //default값이 10이지만 알아서 add로 늘려서 모두 결과도출.
		
		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		list1.add("휴먼");
		System.out.println(list1);
		list1.add(1,"영등포");  //정해진 위치에 추가하려면 add(int index, "String")
		System.out.println(list1);
		
		list1.set(1, "수원"); //정해진 위치에 변경 set(int index, "String")
		System.out.println(list1);
		System.out.println(list1.isEmpty());  //비어있는지? false
		System.out.println(list2.isEmpty());  //list2는 비어있음(true)
		System.out.println(list4.size()); //collection의 길이
		System.out.println(list1.add("학원")); //=>boolean값으로 결과 도출(성공여부)
		System.out.println(list1); //현재의 list1값을 도출.
		System.out.println(list1.remove(4));  //4번째의  휴먼  삭제 ->4번째 자리 "휴먼" 결과 도출
		System.out.println(list1.remove("수원")); //1번째의 수원 삭제의 성공여부 결과 도출(boolean)
		System.out.println(list1);
		System.out.println(list1.remove("영등포")); //없는 값을 지우라고 명령한 결과 -> 실패(false)
		
		list1.clear();  //컬렉션을 모두 지움.(System.out.println(lis1.clear())=>void의 형태라 출력불가.)
		System.out.println(list1);
		
	}

}
