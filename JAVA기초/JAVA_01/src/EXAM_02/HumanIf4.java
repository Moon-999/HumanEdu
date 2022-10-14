package EXAM_02;

import java.util.Scanner;

public class HumanIf4 {

	public static void main(String[] args) {
		//60점 이상이면 합격,
		   //근데 그중에섣 90점 이상이면 장학생임
		     //60점 미만이면 불합격
		
		
		int score;
		Scanner sc = new Scanner (System.in);
		System.out.print("점수를 입력하시오==>");
		score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
			if(score >= 90) {
				System.out.println("당신은 장학생입니다.");
			}
		}
		else {
			System.out.println("불합격입니다.");
		}
		
	}

}
