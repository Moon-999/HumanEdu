package Exam_08_Practice;

public class Bus {
	public int number;
	public int psgCnt;
	public int money;
	
	public Bus(int number, int psgCnt, int money) {
		this.number = number;
		this.psgCnt = psgCnt;
		this.money = money;
	}
	
	public void take(int money) {
		this.money = this.money + money;
		this.psgCnt++;
	}
	
	public void showInfo() {
		System.out.printf("%d번 버스는 %d명의 승객이 있고, %d의 수입이 있습니다. \n", this.number, this.psgCnt, this.money);
	}

}
