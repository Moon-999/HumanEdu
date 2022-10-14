package EXAM_03;

import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {

		// 3번 문제: 1~100중 3의 배수의 총합을 구해라 x%3=0

//		int sum = 0;
//		for (int x = 1; x <= 100; x++) {
//			if (x % 3 == 0) {
//				sum = sum + x;
//
//				
//
//			}
//		}
//		System.out.println("3의 배수의 합: " + sum);

		
//		int sum = 0;
//		int x = 1;
//		while (x <= 100) {
//			x++;
//			if (x % 3 == 0) {
//				sum = sum + x;
//				
//			}
//		}
//		System.out.println("3의 배수의 총합은 : "+sum);
		
		
		// 4번 문제: 
		
		int x = 1;
		while (x <= 6) {
			
			int y = 1;
			while (y <= 6) {
				
				
				if(x + y == 5) {
				System.out.printf("(%d, %d) \n",x,y);
				}
				y++;
			}  //모르겟음
		
		
			x++;
	
		}
		
		double x1 = Math.random();
		int a1 = (int) (x1*6 +1);
		
		double x2 = Math.random();
		int a2 = (int) (x2*6 +1);
		
//		System.out.println(a1);
//		System.out.println(a2);
//		
		
		
		
//		boolean z = true;
//		
//		while (z) {
//			double x1,x2;
//			x1 = Math.random()*7;
//			x2 = Math.random()*6 +1;
//			
//			int a1, a2;
//			a1 = (int)x1;
//			a2 = (int)x2;
//			System.out.printf("(%d, %d) ==> %d \n", a1,a2,a1+a2);
//			
//			if((a1+a2 == 5) || (a1+a2 == 10)) {  //5 or 10이면
////				z=false;
//				break;    //z=false 대신에 break 사용가능
//			}
//		}
		
		
		// 5번 문제 : for문 활용하여 4x+5y=60의 모든 해를 구해 (x,y)형태로 출력.
		
//		for(int x = 1; x <= 10; x++) {
//			for(int y = 1; y <= 10; y++) {
//				if((4*x) + (5*y) == 60) {
//					System.out.printf("(%d, %d) \n",x,y);
//				}
//			}
//		
//		}
		
		
		
		// 6번 문제 : for문을 활용하여 *로 삼각형을 출력.
		
//		
//		for (int y=1; y<=5; y++) {         //y=5줄
//			for (int x=1; x<=y; x++) {     //x=*표시
//				System.out.print("*");     
//			}
//			
//			System.out.println();
//		}
		
//	==위에랑 같은 모양이지만 다른 식
//		for (int y=1; y<=5; y++) {
//			for (int x=1; x<=5; x++) {
//				System.out.print("*");
//				if (x==y) {
//					System.out.println();
//					break;
//				}
//			}
//		}
		
//		for (int y=5; y>=1; y--) {
//			for (int x=1; x<=y; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int y=1; y<=5; y++) {      //y=5줄
//			for(int z=4; z>=y; z--) {   //z=띄어쓰기
//				System.out.print(" "); 
//			}
//			for (int x=1; x<=y; x++) {  //x=*표시
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		
//		for (int y=5; y>=1; y--) {
//			for(int z=4; z>=y; z--) {
//				System.out.print(" ");
//			}
//			for(int x=1; x<=y; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//7번 문제: while문과 Scanner를 이용해서 예금, 출금, 조회, 종료 기능을 제공하는 코드 입력.
		
//		boolean run = true;
//		
//		int balance = 0;  
//		int result = 0;    //현재의 잔고
//		Scanner sc = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("----------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("----------------------------");
//			System.out.print("선택> ");
//			
//		    balance = sc.nextInt();
//			
//			if(balance ==1) {
//				System.out.printf("예금액>");
//				int x = sc.nextInt();
//				result = result + x;
//				
//			}
//			
//			else if(balance ==2) {
//				System.out.printf("출금액>");
//				int y = sc.nextInt();
//				result = result -y;
//				
//			}
//			else if(balance ==3) {
//				System.out.printf("잔고>%d \n", result);
//				
//			}
//			else {
//				break;  //false 대입가능
//		    
//			}
//		
//		
//		}
//		System.out.println("프로그램 종료");
	}
}