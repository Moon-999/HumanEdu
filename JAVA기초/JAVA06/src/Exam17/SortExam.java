package Exam17;

import java.util.Arrays;

public class SortExam {
	public static void main(String[] args) {
		int[] scores = { 99,97,98 };
		Arrays.sort(scores); //Arrays.sort() => 오름차순으로 정렬
		//-> scores = {97,98,99};
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
			
		}
		System.out.println();
		
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		//문자열도 가나다 혹은 abc 순으로 정렬 가능
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
			
		}
		System.out.println();
		
		//객체 내의 특정 멤버변수를 기준으로 비교
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		//String, int클래스에는 compareTo라는 메서드가 있어서 바로 정렬가능
		//Member클래스는 사용자가 정의하였기 때문에 정렬기능을 수행하기 위해 compareTo라는 메서드 오버라이드 해야함.
		//왜냐하면 Comparable이란 인터페이스를 구현했기 때문에.
		//그때 비교할 인자를 정해주면 그 인자 기준으로 정렬이 됨.
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"]="+members[i].name);
		}
	}
}
