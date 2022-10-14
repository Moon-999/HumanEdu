package exam10;

public class CarExam {

	public static void main(String[] args) {
//		Car car1 = new Car(); 
		//추상클래스는 생성자 만들지 못함.
		SportsCar sc1 = new SportsCar();
		sc1.driving();
		int speed = sc1.speedUp();
		int charge = sc1.getCharge();
		System.out.printf("속도: %d \t 요금: %d \n",speed,charge);
		sc1.stop();
	}

}
