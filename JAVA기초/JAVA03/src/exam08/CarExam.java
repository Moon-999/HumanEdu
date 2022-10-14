package exam08;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		int money = car1.getCharge();
		System.out.println("요금 :"+money);
		
		Car car2 = new Taxi();
		money = car2.getCharge();
		System.out.println("요금 :"+money);
	}

}
