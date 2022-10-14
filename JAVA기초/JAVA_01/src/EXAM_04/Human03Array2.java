package EXAM_04;

public class Human03Array2 {

	public static void main(String[] args) {
		int [][] score = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		
		System.out.println("score : "+ score);
		System.out.println("score[0][0] : "+ score[0][0]);
		System.out.println("score[0][1] : "+ score[0][1]);
		System.out.println("score[0][2] : "+ score[0][2]);
		System.out.println("score[1][0] : "+ score[1][0]);
		System.out.println("score[1][1] : "+ score[1][1]);
		System.out.println("score[1][2] : "+ score[1][2]);
		System.out.println("score[2][3] : "+ score[2][3]); //마지막 위치.
		
		System.out.println("score[0] : "+ score[0]);
		System.out.println("score[1] : "+ score[1]);
		System.out.println("score[2] : "+ score[2]);
		
		System.out.println("score.length : "+ score.length);
		System.out.println("score[0].length : "+ score[0].length);
		System.out.println("score[1].length : "+ score[1].length);
		System.out.println("score[2].length : "+ score[2].length);
		
		
//		int total =0;
//		for (int x = 0; x<3; x++) {
//			for(int y=0; y<4; y++) {
//				total = total + score[x][y];
//			}
//		}
//		System.out.printf("total : %d \n",total);
		
		int total = 0;
		for (int x=0; x<score.length; x++) {
			for (int y=0; y<score[x].length; y++) {
				total = total + score[x][y];
			}
		}
		System.out.printf("total : %d \n", total);

	}

}
