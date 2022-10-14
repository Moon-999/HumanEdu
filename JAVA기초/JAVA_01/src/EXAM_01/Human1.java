package EXAM_01;

public class Human1 {

	public static void main(String[] args) {
		System.out.println("Hello Human Computer1");
		//System.out.println("Hello Human Computer2");
		System.out.println("Hello human Computer3");
		
		System.out.println("----------------------");
		
		int kor = 90;
		int eng = 79;
		int math = 21;
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println(kor + eng + math);
		System.out.println("Sum : "+ sum);
		System.out.println("Avg : "+ avg);
		System.out.println("----------------------");
		
		int human = 100;
		System.out.println(human);
		System.out.println(human+10);
		int result = human+10;
		System.out.println(result);
		System.out.println(result+10);
		System.out.println("---------------------");
		
		char human1 = 'A';
		char human2 = 65;
		int human4 = 65;
		System.out.println("human1 : "+ human1);
		System.out.println("human2 : "+ human2);
		System.out.println("human3 : "+ (int)human2);
		System.out.println("human4 : "+ (char)human4);
		System.out.println("---------------------");
		
		long human5 = 55;
		//long human6 = 1000000000000;
		long human7 = 1000000000000L;
		System.out.println("human5 : "+ human5);
		//System.out.println("human6 : "+ human6);
		System.out.println("human7 : "+ human7);
		System.out.println("---------------------");
		
		//float human8 = 3.141592;
		float human9 = 3.141592f;
		//System.out.println("human8 : "+ human8);
		System.out.println("human9 : "+ human9);
		System.out.println("---------------------");
		
		byte human10 = 20;
		int human11 = human10;
		System.out.println("human11 : "+ human11);
		byte human12 = -5;
		//char human13 = human12;
		//System.out.println("human13 : "+ human12);
		
		int human14 = 200;
		//byte human15 = human14;
		//System.out.println("human15 : "+ human15);
		int human16 = 200;
		byte human17 = (byte)human16;
		System.out.println("human17 : "+ human17); //이상한 값으로 대치됨.
		System.out.println("---------------------");
		
		int human20 = 100+359;
		System.out.println("human20 : "+ human20);
		int human21 = 349-49;
		System.out.println("human21 : "+ human21);
		int human22 = 25*25;
		System.out.println("human22 : "+ human22);
		int human23 = 600/3;
		System.out.println("human23 : "+ human23);
		int human24 = 70%5;
		System.out.println("human24 : "+ human24);
		int human25 = 6/5;
		System.out.println("human25 : "+ human25);
		float human26 = 6/5.f;
		System.out.println("human26 : "+ human26);
		double human27 = 6/5.;
		System.out.println("human27 : "+ human27);
		int human28 = 6%5;
		System.out.println("human28 : "+ human28);
		System.out.print("6나누기5의 몫 : "+ human25);
		System.out.println(" 나머지 : "+ human28);
		System.out.println("---------------------");
		
		int human30 = 100*100/5;
		System.out.println("human30 : "+ human30);
		System.out.println("---------------------");
		
		int human31 = 999;
		human31 += 1;
		human31 += 3;
		System.out.println("human31 : "+ human31);
		int human32 = 209;
		human32 -= 9;
		human32 -= 300;
		System.out.println("human32 : "+ human32);
		System.out.println("---------------------");
		
		int human33 = 666;
		human33 ++;
		System.out.println("human33 : "+ human33);
		int human34 = 1000;
		human34 --;
		System.out.println("human34 : "+ human34);
		System.out.println("---------------------");
		
		int human35 = 99;
		int result1 = ++human35 * 10;
		int result3 = ++human35 * 10;
		int result5 = ++human35 * 10;
		System.out.println("human35 : "+ human35);
		System.out.println("result1 : "+ result1);
		System.out.println("result3 : "+ result3);
		System.out.println("result5 : "+ result5);
		
		int human36 = 99;
		int result2 = human36++ * 10;
		int result4 = human36++ * 10;
		int result6 = human36++ * 10;
		System.out.println("human36 : "+ human36);
		System.out.println("result2 : "+ result2);
		System.out.println("result4 : "+ result4);
		System.out.println("result6 : "+ result6);
		System.out.println("---------------------");
		
		boolean human40 = 10 > 15;
		System.out.println("human40 : "+ human40);
		boolean human41 = 50 >= 50;
		System.out.println("human41 : "+ human41);
		boolean human42 = 49 != 50;
		System.out.println("human42 : "+ human42);
		System.out.println("---------------------");
		
		boolean human43 = (100 > 99) && (98<97);
		System.out.println("human43 : "+ human43);
		boolean human44 = (100 != 50) || (100 < 50);
		System.out.println("human44 : "+ human44);
		boolean human45 = (5<6)^(6<7);  //true^true=false
		System.out.println("human45 : "+ human45);
		boolean human46 = (9<5)^(5>3);  //false^true=true
		System.out.println("human46 : "+ human46);
		System.out.println("human46 : "+ !human46);
		System.out.println("---------------------");
		
		String human50 = "안녕하세요";  //String의 S는 대문자!!
	    String human51 = "반갑습니다";
	    String human52 = human50+human51;
	    System.out.println("human52 : "+ human52);
	    System.out.println("---------------------");
	    
	    int value = 20;
	    System.out.println(value);
	    int result10 = value+50;
	    System.out.println(result10);
	    
	    int calc1 = 4+4;
	    calc1 = calc1++;
	    calc1++;
	    System.out.println(calc1);
	    
	    int calc2 = 4+4;
	    calc2 = ++calc2;
	    System.out.println(calc2);
				
	    
		
	
		

		
		
	
		
		
		
		
		
	
	}

}
