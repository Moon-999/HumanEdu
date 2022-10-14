package exam09;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		int money = car1.getCharge();
		System.out.println("요금 :"+money);
		
		Car car2 = new Taxi();
		money = car2.getCharge();
		System.out.println("요금 :"+money);
		
		Car car3 = new Car();
		
	
		System.out.println("car3 instanceof Bus: "+ (car3 instanceof Bus));
		if(car3 instanceof Bus) {
			Bus bus3 = (Bus)car3;
			bus3.run();
		}
		else {
			System.out.println("car3는 Bus로 강제변환 불가");
		}
		System.out.println("car1 instanceof Bus: "+ (car1 instanceof Bus));
		if(car1 instanceof Bus) {
			Bus bus1 = (Bus)car1;
			bus1.run();
		}
				
				
	
		
	}

}
