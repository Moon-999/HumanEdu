package Exam18;

public class MathRandomExam {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6)+1;
		//0 <= Math.random() < 1
		//0 <= Math.random()*6 < 6 =>실수를 가짐
		//1 <= (Math.random()*6)+1 <7 =>실수
		//(int)로 바꿔주면 1~6 사이의 정수를 갖게됨.(int는 소수점 버림)
		System.out.println("주사위 눈:" + num);
		
		
	}

}
