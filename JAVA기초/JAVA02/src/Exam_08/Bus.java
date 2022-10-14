package Exam_08;

public class Bus {
	public int busNumber;
	public int passengerCnt;
	public int money;
	
	public Bus(int busNumber, int passengerCnt, int money) {
		this.busNumber = busNumber;
		this.passengerCnt = passengerCnt;
		this.money = money;
	}
	
	public void take(int money) {
		this.money = this.money + money;
		this.passengerCnt++;
	}
	public void showInfo() {
		System.out.printf("%d 버스는 %d명의 승객이 있고, %d의 수입이 있습니다. \n", this.busNumber, this.passengerCnt, this.money);
	}
}
