package Exam_06;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();

		
		System.out.println("car1 : "+car1);
		System.out.println("car1.company : "+car1.company);
		System.out.println("car1.model : "+car1.model);
		System.out.println("car1.maxSpeed : "+car1.maxSpeed);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("=================================");

		
		Car car2 = new Car("기아","K7", 350, 60);
		
		
		System.out.println("car2 : "+car2);
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.maxSpeed : "+car2.maxSpeed);
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("=================================");
		
		car2.speedUp();
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("=================================");
		
		
		System.out.println("car1 : "+car1);
		System.out.println("car1.company : "+car1.company);
		System.out.println("car1.model : "+car1.model);
		System.out.println("car1.maxSpeed : "+car1.maxSpeed);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("=================================");
		
		car2.speedUp();
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("=================================");
		
		car1.speedUp();
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("=================================");
		
		car1.speedUp(20);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("=================================");
		
		int currentSpeedCar1 = car1.speedDown();
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("currentSpeedCar1 : "+currentSpeedCar1);
		System.out.println("=================================");
		
		int currentSpeedCar2 = car2.speedDown(30);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("currentSpeedCar2 : "+currentSpeedCar2);
		System.out.println("=================================");
		
		car2.speedDown1(20);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		System.out.println("car2.currentSpeed : "+car2.currentSpeed);
		System.out.println("currentSpeedCar : "+currentSpeedCar2);
		System.out.println("=================================");
		
		car1.up();
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		
		int currentSpeedcar1 = car1.down();
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		
		car1.up(22);
		System.out.println("car1.currentSpeed : "+car1.currentSpeed);
		
		
		

	}

}
