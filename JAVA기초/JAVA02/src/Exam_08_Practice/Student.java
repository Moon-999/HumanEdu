package Exam_08_Practice;

public class Student {
	public String name;
	public int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money = this.money - 1200;
	}
	
	public void showInfo() {
		System.out.printf("%s님의 잔고는 %d입니다. \n", this.name, this.money);
	
	}

}
