package EXAM_02;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class HumanGugudan {

	public static void main(String[] args) {
	//구구단 계산
//		int dan = 5;
//		
//		for(int cnt = 1; cnt <= 9; cnt++) {
//			System.out.printf("%d x %d = %d \n", dan, cnt, dan*cnt);
//		}
		
		
		
//		System.out.println("================");
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.print("단을 입력하시오.");
//		int dan;
//		dan = sc.nextInt();
//		
//		System.out.printf("%d단을 출력합니다. \n", dan);
//		for(int cnt = 1; cnt <= 9; cnt++) {
//			System.out.printf("%d x %d = %d \n", dan, cnt, dan*cnt);
//		}
//		int sum = 0;
//		for(int cnt = 1; cnt <= 9; cnt++) {
//			
//			sum = sum + (dan*cnt);
//			
//		}
//		System.out.printf("%d단의 1~9까지 모든 합은 : %d \n", dan, sum);
		
		
		//구구단 while문 활용
		
//		int dan;
//		Scanner sc = new Scanner (System.in);
//		System.out.print("단을 입력하시오");
//	    dan = sc.nextInt();
//	    
//	   
//	    int cnt = 1;
//	    int x = dan*cnt;
//	    while(cnt < 11) {
//	    	
//	    	 System.out.printf("%d X %d = %d \n", dan, cnt, x);
//	    	 cnt++;  //=> cnt=으로 표현하기위해서는 cnt = cnt +1;
//	    			
//	    }
		
		
		int x = 1;
		while (x <= 9) {
			x = x + 1;
			
			int y = 1;   //초기값은 while문 바로 위에 입력하기!!
			while(y <= 9) {
				
				System.out.printf("%d x %d = %d \n", x, y, x*y);
				y = y + 1;
			}
			System.out.println("=============================");
			
		}
	   
	    
	    
	}

}
