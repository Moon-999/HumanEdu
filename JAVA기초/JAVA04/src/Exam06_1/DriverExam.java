package Exam06_1;

public class DriverExam {

	public static void main(String[] args) {
		Bus b = new Bus();
		Driver driver = new Driver();
		driver.drive(b);
		//Vehicle v = b
		//자동타입변환(실제구현클래스의 내용을 인터페이스의 구현객체로 타입변환 가능)
		//Vehicle v (인터페이스) = new Bus(); (구현객체)
		Taxi t = new Taxi();
		driver.drive(t);
	}

}
