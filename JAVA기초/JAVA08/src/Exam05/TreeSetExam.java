package Exam05;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		//TreeSet을 구현하였지만, Set에만 정의된 메서드 실행 가능.
		//지금 실습할 것은 TreeSet 고유의  기능이므로, 다시 클래스로 강제타입변환 필요
		
		TreeSet<Integer> ts = (TreeSet)set;
		//= TreeSet<Integer> ts = new TreeSet<Integer>(); (같은 것)
		ts.add(new Integer(81));
		ts.add(new Integer(82));
		ts.add(new Integer(70));
		ts.add(new Integer(89));
		ts.add(new Integer(85));
		
		System.out.println("first() : "+ ts.first());
		System.out.println("Last() : "+ts.last());
		System.out.println("Lower() : "+ts.lower(new Integer(85)));
		//검색조건(85)을 포함 하지 않음.
		System.out.println("Lower() : "+ts.lower(85));
		System.out.println("Higher() : "+ts.higher(new Integer(85)));
		System.out.println("floor(new Integer(85)): "+ ts.floor(85));
		//검색 조건(85)보다 작거나 같은 수 
		System.out.println("ceiling(new Integer(85)) : "+ts.ceiling(85));
		//검색 조건(85)보다 크거나 같은수 
		
		//검색 후 제거
		System.out.println("pollFirst() : "+ts.pollFirst());
		//가장 앞에 있는 70 검색 후 삭제.
		System.out.println(ts);
		ts.add(70); //70 강제 추가
		System.out.println(ts);
		
		//정렬
		Set<Integer> s = null;
		
		NavigableSet<Integer> desc = ts.descendingSet(); //내림차순
		System.out.println("desc : "+desc);
		NavigableSet<Integer> asc = desc.descendingSet();
		//desc=내림차순 =>그것을 또 내림차순 =>궁긍적으로 오름차순이됨.
		System.out.println("asc : "+asc);
		
		NavigableSet<Integer> bet1 = ts.headSet(new Integer(82), true);
		//82를 포함한 작은 수 집합(true이면 82포함/ false이면 82 미포함
		System.out.println("bet1 : "+bet1);
		NavigableSet<Integer> bet2 = ts.headSet(new Integer(82), false);
		System.out.println("bet2 : "+bet2);
		
		NavigableSet<Integer> bet3 = ts.tailSet(new Integer(82), true);
		//82를 포함한 큰 수 집합
		NavigableSet<Integer> bet4 = ts.tailSet(new Integer(82), false);
		System.out.println("bet3 : "+bet3);
		System.out.println("bet4 : "+bet4);
		
		NavigableSet<Integer> bet5 = ts.subSet(new Integer(81), true, new Integer(85), true);
		//81~85사이의 집합. 81을 포함할  것인가?(t/f), 85를 포함할 것인가?(t/f)
		NavigableSet<Integer> bet6 = ts.subSet(new Integer(81), true, new Integer(85), false);
		System.out.println("bet5 : "+bet5);
		System.out.println("bet6 : "+bet6);
		
	}

}
