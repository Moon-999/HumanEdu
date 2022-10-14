package EXAM_02;

import java.util.Scanner;

public class HumanIf1_4 {

	public static void main(String[] args) {
		//득표수에 따라 반장/부반장/환경부장/체육부장/학습부장으로 나뉨
		
		
//    	int vote;
//		Scanner sc = new Scanner (System.in);
//		System.out.print("득표수를 입력해주세요 =>");
//	    vote = sc.nextInt();
//	    
//	    if (vote >= 80) {
//	    	System.out.println("당신은 학생회입니다.");
//	    	if(vote >=90) {
//	    		System.out.println("당신은 반장입니다.");
//	    	}
//	    	else {
//	    		System.out.println("당신은 부반장입니다.");
//	    	}
//	    }
//	    else if (vote >= 50) {
//	    	System.out.println("당신은 집행부입니다.");
//	    	if(vote >=70) {
//	    		System.out.println("당신은 학습부장입니다.");
//	    	}
//	    	else if(vote >= 60) {
//	    		System.out.println("당신은 환경부장입니다.");
//	    	}
//	    	else {
//	    		System.out.println("당신은 체육부장입니다.");
//	    	}
//	    }
//	    else {
//	    	System.out.println("수고하셨습니다.");
//	    }
	    
		
		//개인별 점수로 최우수상과 우수상 그리고 장려상을 수여함
        // 그외 인기상도 점수별로 우승상품을 달리함
        
//		int score;
//		Scanner sc = new Scanner (System.in);
//		System.out.print("점수를 입력하세요=>");
//		score = sc.nextInt();
//		
//		if (score >= 70) {
//			System.out.println("축하합니다.");
//			if(score >= 90) {
//				System.out.println("최우수상입니다.");
//			}
//			else if(score >= 80) {
//				System.out.println("우수상입니다.");
//			}
//			else {
//				System.out.println("장려상입니다.");
//			}
//		}
//		else if (score >= 50) {
//			System.out.println("인기상입니다.");
//			if(score >=60) {
//				System.out.println("상품은 소고기입니다.");
//			}
//			else {
//				System.out.println("상품은 문화상품권입니다.");
//			}
//		}
//		else {
//			System.out.println("아쉽지만 수고하셨습니다.");
//		}
		
		
		Scanner sc = new Scanner (System.in);
		int name;
		System.out.print("당신의 암호는 무엇입니까?");
		name = sc.nextInt();
		System.out.printf("당신의 암호는 %c입니다.", name);
		if (name == 65) {
			System.out.println("통과입니다.");
		}
		else {
			System.out.println("통과하실 수 없습니다.");
		}
			
		
	}

}
