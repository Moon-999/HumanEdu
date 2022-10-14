package Exam_22.exercise19_practice2;

public class Account {
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	Account() {
		this.balance = 0;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if((balance >= MIN_BALANCE) && (balance <= MAX_BALANCE)) {
			this.balance = balance;
		}
	}
}
