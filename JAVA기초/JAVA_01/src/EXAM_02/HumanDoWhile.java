package EXAM_02;

public class HumanDoWhile {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		
		do {
			sum = sum + cnt;
			cnt++;    //cnt=cnt+1; 또는 cnt +=1;
			System.out.printf("1~%d까지의 합 : %d \n",cnt-1, sum);
			System.out.printf("cnt : %d \n", cnt);
			
		}while (cnt<=10);
		
		System.out.println("--------------------------");
		System.out.printf("1~10까지의 합 : %d \n", sum);
		System.out.printf("cnt : %d \n", cnt);
			
//		int cnt = 1;
//		int sum = 0;
//		
//		do {
//			
//			sum = sum + cnt;
//			cnt++;
//			System.out.printf("1~%d까지의 합 : %d \n", cnt-1, sum);
//			
//		}
//		while(cnt < 10);
//		
//		System.out.printf("1~9까지의 합 : %d \n", sum);
		

	}

}
