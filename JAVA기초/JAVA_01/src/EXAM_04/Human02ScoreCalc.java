package EXAM_04;

public class Human02ScoreCalc {

	public static void main(String[] args) {
		int [] score = {100,90,80,70,60,50,40,30,20,10,10,20,30,40,50,60,70,80,90,100};
		int total = 0;
		System.out.println(score);
		System.out.println("score : "+ score);
		System.out.println("score[0] : "+ score[0]); //첫번째는 0부터 시작.
		System.out.println("score[10] : "+ score[10]);
		System.out.println("score[19] : "+ score[19]);
//		System.out.println("score[20] : "+ score[20]); //에러남
		System.out.println("length : " + score.length);  //배열의 총길이
		
		
//		for (int cnt=0; cnt <score.length; cnt++) {
//			total = total + score[cnt];
//		}
//		System.out.printf("total : %d \n", total);
//		System.out.printf("AVG : %f \n", (double) total/score.length);
//		
		
//		int [] score = {100,300,500,700,900,1100}; //정의한 int형의 데이터만 가능
//		int total = 0;
//		for(int cnt = 0; cnt < score.length; cnt++) {
//			total = total + score[cnt];
//		}
//		System.out.printf("total : %d \n", total);
//		System.out.printf("AVG : %d \n", total/score.length);
		
		score[0] = 20;
		System.out.printf("score[0] : %d \n", score[0]);
		for (int cnt=0; cnt <score.length; cnt++) {  //score.length를 활용하는 것이 오류를 줄일수있음
			total = total + score[cnt];
		}
		System.out.printf("total : %d \n", total);
	}

}
