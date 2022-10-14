package Exam04;

import java.util.HashSet;
import java.util.Set;

public class MemberExam {

	public static void main(String[] args) {
		Member m1 = new Member("정문희",24);
		Member m2 = new Member("김택선",28);
		Member m3 = new Member("정문희",24);
		
		Set<Member> set = new HashSet<Member>();
		set.add(m1);
		set.add(m2);
		System.out.println(set);
		
		boolean result = set.add(m3);
		//hashCode와 equals를 오버라이드하여야만 중복 제거됨.
		//set.add를 하면 2가지를 체크하여 중복여부 확인함
		//1. hashCode가 같은지
		//2. m3.equals(m1)가 true인지
		//모두 만족하면 같은 객체 => set에 추가 X.
		System.out.println(result); //=>false -> 중복으로 추가 할 수 없음.
		System.out.println(set);
		
	}

}
