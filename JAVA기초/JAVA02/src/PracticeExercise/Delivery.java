package PracticeExercise;

public class Delivery {
	public String receiptNumber;
	public String call;
	public String address;
	public String receiptDate;
	public String receiptTime;
	public int price;
	public int menuNumber;
	

	
	public Delivery(String receiptNumber, String call, String address, String receiptDate, String receiptTime, int price, int menuNumber) {
		this.receiptNumber = receiptNumber;
		this.call = call;
		this.address = address;
		this.receiptDate = receiptDate;
		this.receiptTime = receiptTime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showInfo() {
		System.out.println("receiptNumber: "+this.receiptNumber);
		System.out.println("call : "+this.call);
		System.out.println("address : "+this.address);
		System.out.println("receiptDate : "+this.receiptDate);
		System.out.println("receiptTime : "+this.receiptTime);
		System.out.println("price : "+this.price);
		System.out.println("menuNumber : "+this.menuNumber);
	}
	

}
