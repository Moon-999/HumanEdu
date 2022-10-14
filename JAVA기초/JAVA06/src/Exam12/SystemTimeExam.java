package Exam12;

public class SystemTimeExam {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum+=1;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(time2 - time1);
		
		long time3 = System.currentTimeMillis();
		
		int sum1 = 0;
		for(int i=1; i<=1000000; i++) {
			sum+=1;
		}
		
		long time4 = System.currentTimeMillis();
		
		System.out.println(sum1);
		System.out.println(time4 - time3);

	}

}
