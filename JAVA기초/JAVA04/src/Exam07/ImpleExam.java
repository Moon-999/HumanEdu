package Exam07;

public class ImpleExam {

	public static void main(String[] args) {
//		ImplementC impleC = new ImplementC();
//		C interC = impleC;
		C interC = new ImplementC();
		interC.methodA();
		interC.methodB();
		interC.methodC();
//		A interA = impleC;
//		interA.methodA();
		A interA = new ImplementC();
		interA.methodA();
		
//		interA.methodB(); = 불가 -> methodB는 B의 구현체이기때문
	}

}
