package exam07;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		car1.run();
		System.out.println("------------");
		
		//경차를 타서 그 차로 출근
		Car car2 = new MicroCar();
		car2.run();
		System.out.println("------------");
		
		//택시타고 다님.
		Car car3 = new Taxi();
		car3.run();
		
		
		

	}

}
