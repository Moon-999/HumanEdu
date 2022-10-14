package Exam04;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name= name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
		      //name.hashCode() =>String의 해시코드생성 방식
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			return name.equals(mem.name) && age == mem.age ;
		}
		else {
			return false;
		}
	}
}
