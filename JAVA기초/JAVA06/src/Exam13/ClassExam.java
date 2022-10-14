package Exam13;

import Exam04_2.Car;

public class ClassExam {

	public static void main(String[] args) {
		Car car = new Car("소나타");
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		
	}

}
