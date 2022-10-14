package Exam_22.exercise19;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	Account(){
		this.balance = 0;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
//		
//		if(balance < MIN_BALANCE) {
//			this.balance = this.balance + 0;
//		}
//		else if(balance > MAX_BALANCE) {
//			this.balance = this.balance + 0;
//		}
//		else {
//			this.balance = balance;
//		}
		if(balance >MIN_BALANCE && balance < MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}
