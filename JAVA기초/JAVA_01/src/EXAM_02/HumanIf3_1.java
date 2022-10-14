package EXAM_02;

import java.util.Scanner;

public class HumanIf3_1 {

	public static void main(String[] args) {
		int score;
		Scanner sc = new Scanner (System.in);
		System.out.print("점수를 입력해주세요. ==>");
		score = sc.nextInt();
		
		
		//논리연산자 %%이용해서 연산
		if (score >= 90) {
			System.out.println("당신의 점수는 A학점입니다.");     //90<=score<100
		}
		if(score >= 80 && score <90) {
			System.out.println("당신의 점수는 B학점입니다.");     //80<=score<90
		}
		if(score >=70 && score <80) {
			System.out.println("당신의 점수는 C학점입니다.");     //70<=score <80
		}
		if(score >=60 && score <70) {
			System.out.println("당신의 점수는 D학점입니다.");     //60<=score<70
		}
		if (score < 60) {
			System.out.println("당신의 점수는 F학점입니다");      //score<60
		}
	}

}
