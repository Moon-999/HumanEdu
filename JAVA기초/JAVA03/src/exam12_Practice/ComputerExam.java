package exam12_Practice;

public class ComputerExam {

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.turnOn();
		dt.display();
		dt.typing();
		dt.turnOff();
		
		MyNotebook mn = new MyNotebook();
		mn.turnOn();
		mn.display();
		mn.typing();
		mn.turnOff();
	}

}
