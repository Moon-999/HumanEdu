package Exam01_Practice;

public class TvExam {

	public static void main(String[] args) {
		RemoteControl rc = new Tv();
		rc.turnOn();
		rc.setMute();
		RemoteControl.changeBatt();
		
		RemoteControl rc1 = new Audio();
		rc1.turnOn();
		rc1.setMute();
		RemoteControl.changeBatt();
	}

}
