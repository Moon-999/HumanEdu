package PracticeExercise;

public class CarExam {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.maxSpeed);
		c.Up();
		System.out.println(c.crtSpeed);
	}
}
