package Exam17;

public class Member implements Comparable<Member>{
	String name;
	Member(String name){
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		//return name.compareTo(o.name)*-1 =>내림차순 (*1혹은 안쓰면 오름차순)
		return name.compareTo(o.name);
	}
	
}
