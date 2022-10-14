package Exam18;

import java.util.Arrays;
import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		//long seed1 = System.currrentRimeMillis(); => 시간은 항상 달라지기 때문에 선택번호와 당첨번호에 
		                                            // 동일 seed1을 넣어도 다른 결과 발생
		
		//선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3); 
		//컴퓨터에서 난수를 발생시키는 기준인 seed가 있는데 seed를 3으로 설정.
		System.out.print("선택 번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			//nextInt()는 1과 45 사이의 난수를 뽑는것.(중복되지 않게)
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5); //선택번호의 난수와 다른 난수를 얻기 위해 seed를 5로 설정.(3으로 설정하면 동일난수발생)
		System.out.print("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
			
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
