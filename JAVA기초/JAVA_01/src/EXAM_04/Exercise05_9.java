package EXAM_04;

import java.util.Scanner;

public class Exercise05_9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
    	int[] scores = null;
//		int[] scores = new int[5];
//		int[] scores = {0,0,0,0,0,0,0,0,0,0,0};
		Scanner sc = new Scanner (System.in);
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];  //학생수만큼 배열의 크기가 지정된다.
				
			}
			else if(selectNo == 2) {
				for (int x=0; x<studentNum; x++) {
				System.out.printf("scores[%d]> \n", x);
				scores[x] = sc.nextInt();
				}
				
			}
			else if(selectNo == 3) {
				for(int y=0; y<studentNum; y++) {
				System.out.printf("scores[%d]: %d \n",y,scores[y]);
				}
			}
			else if(selectNo == 4) {
				int max=0;
				int sum=0;
				
				for(int x = 0; x < scores.length; x++) {
					
					if(max<scores[x]) {
						max = scores[x];
					}
					sum = sum + scores[x];
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+((double)sum/scores.length));
			}
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
			}

		}
	

