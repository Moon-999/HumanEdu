package Exam04_1;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int a[];
	
	public Member(String id, String name, String password, int age, boolean adult, int[] a) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.a = a;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();//clone() 메소드의 리턴타입은 Object이므로 Member타입으로 캐스팅해야함.
		}catch (CloneNotSupportedException e) {}
		return cloned;
	}
}
