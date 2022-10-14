package EXAM_02;

public class HumanWhile {

	public static void main(String[] args) {
		//1~10까지 반복하면서 총합을 구하는 프로그램
		
		int cnt = 1;   //현재의 위치 표현
		int sum = 0;   //누적합을 가지고 있는 변수
		
		while (cnt <= 10) {
			
			sum = sum + cnt;   //sum += cnt;
			
			    
			cnt = cnt + 1;        //cnt += 1;  or cnt++
			
			System.out.printf ("1~%d까지의 누적 합 : %d \n", cnt-1, sum);
			System.out.printf ("현재의 count : %d \n", cnt);
		}
		System.out.printf ("1~10까지의 누적 합 : %d \n", sum);
		System.out.printf ("현재의 count : %d \n", cnt);
		
		System.out.println("-----------------------------");
	
		
//		int cnt1 = 0;
//		int sum1 = 0;
//		
//		while (cnt1 <=20) {
//			sum1 = sum1 + cnt1;
//			cnt1 = cnt1 + 2;
//		}
//		
//		System.out.printf("0부터 20까지 짝수의 합 : %d \n",sum1);
//		System.out.printf("현재 count : %d \n", cnt1);
		
	}

}
