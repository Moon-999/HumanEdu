package EXAM_03;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
//		int x1,x2;
//		int result1, result2, result3; 
//		double result4;
//		Scanner sc = new Scanner (System.in);
//		System.out.print("x1입력 : ");
//		x1 = sc.nextInt();
//		System.out.print("x2입력 : ");
//		x2 = sc.nextInt();
//		result1= add(x1,x2);
//		result2=minus(x1,x2);
//		result3=multiple(x1,x2);
//		result4=division(x1,x2);
//		
//		System.out.printf("x1 + x2 = %d \n", result1);
//		System.out.printf("x1 - x2 = %d \n", result2);
//		System.out.printf("x1 x x2 = %d \n", result3);
//		System.out.printf("x1 / x2 = %f \n", result4);
//		
//		}
//
//	
//
//	private static double division(int x1, int x2) {
//		double z = (double)x1/ (double)x2;
//		return z;
//	}
//
//
//    private static int multiple(int x1, int x2) {
//		int z = x1*x2;
//		return z;
//	}
//
//	private static int minus(int x1, int x2) {
//		int z = x1-x2;
//		return z;
//	}
//
//	private static int add(int x1, int x2) {
//		int z = x1 + x2;
//		return z;
		
		int x, y;
		Scanner sc = new Scanner (System.in);
		System.out.print("x값 입력> ");
		x = sc.nextInt();
		System.out.print("y값 입력> ");
		y = sc.nextInt();
		
		int result1,result2,result3;
		double result4;
		result1 = add(x,y);
		result2 = minus(x,y);
		result3 = multiple(x,y);
		result4 = division(x,y);
		
		System.out.printf("x + y = %d \n", result1); 
		System.out.printf("x - y = %d \n", result2);
		System.out.printf("x x y = %d \n", result3);
		System.out.printf("x / y = %f \n", result4);
		
	}

	private static double division(int x, int y) {
		
		return (double)x / (double)y;
	}

	private static int multiple(int x, int y) {
		
		return x*y;
	}

	private static int minus(int x, int y) {
		
		return x-y;
	}

	private static int add(int x, int y) {
		
		return x+y;
	}

}
