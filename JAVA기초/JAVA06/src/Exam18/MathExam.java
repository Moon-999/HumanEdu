package Exam18;

public class MathExam {

	public static void main(String[] args) {
		int v1 = Math.abs(-5); //abs = > 절댓값
		double v2 = Math.abs(-3.14);
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3); //=>올림 : -5
		System.out.println("v3="+v3);
		System.out.println("v4="+v4);
		
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);//=>내림 : -6
		System.out.println("v5="+v5);
		System.out.println("v6="+v6);
		
		int v7 = Math.max(5, 9); //max => 두개의 수에서 큰수
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7="+v7);
		System.out.println("v8="+v8);
		
		int v9 = Math.min(5, 9); //min => 두개의 수에서 작은수
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9="+v9);
		System.out.println("v10="+v10);
		
		double v11 = Math.random(); //=>0~1사이의 난수, 1은 미포함.
		System.out.println("v11="+v11);
		
		double v12 = Math.rint(5.3); //rint => 가까운 정수의 실수값 =>5
		double v13 = Math.rint(5.7); //=>6
		System.out.println("v12="+v12);
		System.out.println("v13="+v13);
		
		long v14 = Math.round(5.3); //=>반올림 정수형->단 리턴이 long형
		long v15 = Math.round(5.7);
		System.out.println("v14="+v14);
		System.out.println("v15="+v15);
		
		double value = 12.3456;
		double temp1 = value * 100; //1234.56
		long temp2 = Math.round(temp1); //1235(반올림)
		double v16 = temp2 / 100.0; //12.35 => 100.0(실수)로 나누어주어야 v16이 실수가 됨.
		System.out.println("v16="+v16);
		
		
	}

}
