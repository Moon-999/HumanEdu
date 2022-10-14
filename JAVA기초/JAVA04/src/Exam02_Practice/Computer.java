package Exam02_Practice;

public class Computer implements Calc, Internet{

	@Override
	public void search() {
		System.out.println("인터넷 검색");
	}

	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}

}
