package Exam_19.packC;

public class Bus {
	int number;
	int psgCnt;
	int money;
	
	public Bus(int number, int psgCnt, int money) {
		this.number = number;
		this.psgCnt = psgCnt;
		this.money = money;
	}
	
	public void take(int money) {
		this.money = this.money + money;
		psgCnt++;
	}
	public void showInfo() {
		System.out.printf("%d번 버스의 현재 승객은 %d명이고, 수입은 %d입니다. \n", this.number, this.psgCnt, this.money);
	}

}
