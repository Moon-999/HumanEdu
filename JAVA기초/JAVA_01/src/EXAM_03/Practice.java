package EXAM_03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
//		//3번 문제
//		
//		int sum = 0;
//		for(int x=1; x <=100; x++) {
//			
//			if(x%3 == 0) {
//				sum = sum + x;
//			}
//			
//		}
//		System.out.printf("3의 배수의 총합은 : %d", sum);
//			
		
		
		
//		//4번 문제
//		boolean a = true;
//		
//		while (a) {
//		double x1 = Math.random()*7;
//		double x2 = Math.random()*7;
//		int a1 = (int)x1;
//		int a2 = (int)x2;
//		System.out.printf("(%d, %d) \n", a1,a2);
//		
//			if(a1 + a2 == 5) {
//				a = false;
//		
//			}
//
//		}
		
		
//		//5번 문제
//		for (int x = 1; x<=10; x++) {
//			for(int y=1; y<=10; y++) {
//				if((4*x)+(5*y)==60) {
//					System.out.printf("(%d, %d) \n",x,y);
//				}
//			}
//		}
		
		
		//6번 문제
		for (int x = 1; x<=5; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
		
//		for (int x = 1; x <=5; x++) {
//			for(int y = 4; y>=x; y--) {
//				System.out.print(" ");
//				}
//			for(int z = 1; z<=x; z++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		//7번 문제
//		boolean run = true;
//		
//		int a = 0;
//		int result = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("------------------------");
//			System.out.print("선택> ");
//			a = sc.nextInt();
//			
//			if(a ==1) {
//				System.out.print("예금액> ");
//				int x = sc.nextInt();
//				result = result + x;
//				
//			}
//			else if(a==2) {
//				System.out.print("출금액> ");
//				int y = sc.nextInt();
//				result = result - y;
//			}
//			else if(a==3) {
//				System.out.printf("잔고> %d \n", result);
//			}
//			else  {
//				break;
//			}
//		}
//		
//		System.out.println("프로그램 종료");
		
		//참조타입
//		printTest("정문희", 24);
//	    System.out.println("----------------------");
//	    
//	    int a, b;
//	    Scanner sc = new Scanner(System.in);
//	    System.out.print("a의 값을 입력하시오> ");
//	    a = sc.nextInt();
//	    System.out.print("b의 값을 입력하시오> ");
//	    b = sc.nextInt();
//	    
//	    int result1,result2,result3;
//	    double result4;
//	    
//	    result1 = add(a,b);
//	    result2 = minus(a,b);
//	    result3 = multiple(a,b);
//	    result4 = division(a,b);
//	    
//	    
//		System.out.printf("a + b = %d \n", result1);
//		System.out.printf("a - b = %d \n", result2);
//		System.out.printf("a x b = %d \n", result3);
//		System.out.printf("a / b = %f \n", result4);
//		
//		
//	}
//	private static int add (int a, int b) {
//		return  a + b;
//	}
//	private static int minus (int a, int b) {
//		return  a - b;
//	}
//	private static int multiple (int a, int b) {
//		return  a*b;
//	}
//	private static double division (int a, int b) {
//		return  a/b;
//	}
//	
//
//	private static void printTest(String string, int i) {
//		System.out.printf("제 이름은 %s이고, 나이는 %d입니다.", string,i);
//	}
//}