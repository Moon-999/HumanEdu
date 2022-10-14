package EXAM_02;

import java.util.Scanner;

public class HumanIf2 {

	public static void main(String[] args) {
		int kor;
		//kor = 60;
		System.out.printf("당신의 점수를 입력해주세요. \n");
		Scanner sc = new Scanner (System.in);
		kor = sc.nextInt();        //정수로 입력받음
		
		System.out.printf("당신의 국어점수는 %d입니다. \n", kor);
		
		if (kor >=60) {
			System.out.println("합격입니다.");
		}
		else {         //if문이 참이 아니라면 수행하는 블럭
			System.out.println("불합격입니다.");
		}
		
//		if (kor < 60) {
//			System.out.println("불합격입니다.");
//		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
