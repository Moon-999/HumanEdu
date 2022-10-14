package PracticeExercise;

public class Car {
	public String name;
	public int maxSpeed;
	public int crtSpeed;
	
	public Car() {
		this("현대",250,80);
	}
	public Car(String name, int maxSpeed, int crtSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.crtSpeed = crtSpeed;
	}
	public void Up() {
		this.crtSpeed = this.crtSpeed +1;
	}

}
