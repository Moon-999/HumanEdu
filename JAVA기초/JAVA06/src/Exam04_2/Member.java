package Exam04_2;

import java.util.Arrays;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int a[];
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult, int[] a, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.a = a;
		this.car = car;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복사를 해서 name과 age를 복제한다.
		Member cloned = (Member)super.clone(); 
		//super.clone()은 Object 클래스의 clone() 메서드 실행하는 것임.
		cloned.a = Arrays.copyOf(this.a, this.a.length);//int a[]를 깊은 복제한다.
		
		cloned.car = new Car(this.car.model);//car를 깊은 복제한다.
		
		return cloned;//깊은 복제된 Member 객체를 리턴
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();  
			//기존에는 Object클래스의 Clone() 메서드 실행.
			//이번에는 Member클래스의 Clone() 메서드 실행.
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
