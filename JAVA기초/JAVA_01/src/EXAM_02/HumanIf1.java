package EXAM_02;

import java.util.Scanner;

public class HumanIf1 {

	public static void main(String[] args) {
		int eng;
		System.out.println("당신의 점수를 입력해주세요.");
		Scanner sc = new Scanner (System.in);
		eng = sc.nextInt();
		
		System.out.printf("당신의 영어점수는 %d입니다. \n", eng);
		
		if (eng >= 70) {
			System.out.println("합격입니다.");
		}
		
		if (eng < 70) {
			System.out.println("불합격입니다.");
		}
		
	    System.out.println("프로그램을 종료합니다.");
	    
	}

}
