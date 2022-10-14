package Exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("휴먼");
		boolean setResult1 = set.add("교육");
		set.add("센터");
		System.out.println(setResult1);
		System.out.println(set);
		
		boolean setResult2 = set.add("휴먼"); 
		//중복으로 추가가 안됨.
		System.out.println(setResult2); //=>false
		System.out.println(set);
		
		Iterator<String> iter = set.iterator();
		//set컬렉션에 있는 내용을 순차적으로 처리할 수 있는 지시자.
		
		//set은 index가 없기 때문에 일반적인 for문(int i=0; i<length; i++)으로 처리할 수 없음. 
		//방법1
		while(iter.hasNext()) {// 다음의 내용이 있는지 true/false
			String str = iter.next();
			System.out.println(str);
		}
		
//		//방법2
//		for(String str : set){ //이런 형태는 가능.
//			System.out.println(str);
//		}
		
		set.clear(); //set컬렉션 삭제.
		System.out.println(set);

	}

}
