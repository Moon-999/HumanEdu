package exam12;

public class ComputerExam {

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.turnOn();
		dt.typing();
		dt.display();
		dt.turnOff();
		
//		Notebook nb = new Notebook(); abstract 클래스이기 때문에 생성자 만들수 없음.
		
		MyNotebook nb = new MyNotebook();
		nb.turnOn();
		nb.typing();
		nb.display();
		nb.turnOff();
	}

}
