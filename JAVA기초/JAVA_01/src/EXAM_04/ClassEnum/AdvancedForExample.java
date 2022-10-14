package EXAM_04.ClassEnum;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84,  93, 87};
		
		int sum = 0;
		
		//for(int a= 0; a<scores.length; a++)
		for(int a : scores) {
			sum = sum + a;
		}
		System.out.println("점수 총합 = "+sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = "+avg);

	}

}
