package Exam_19.packC;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void take(Bus bus) {
		bus.take(1250);
		this.money = this.money - 1250;
	}
	public void showInfo() {
		System.out.printf("%s의 현재 잔액은 %d입니다. \n", this.name, this.money);
	}
}
