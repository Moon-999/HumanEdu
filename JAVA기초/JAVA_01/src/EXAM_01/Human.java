package EXAM_01;

public class Human {

	public static void main(String[] args) {
		int calc;      //선언
		calc = 3+4;    //변수에 값 대입
		calc = 9;      //변수에 값 갱신
		System.out.println ("결과 = " + calc);
		
		int Human, human;  // 변수의 선언
		Human = 10;
		human = 20;
		System.out.println ("Human : " + Human);
		System.out.println ("Human : " + human);
		
		int kor = 100;
		int eng = 100;
		int sum;
		int avg;
		sum = kor + eng;
		avg = sum / 2;
		System.out.println ("Sum : " + sum);
		System.out.println ("Avg : " + avg);
		
		char human1 = 'A';   //한글자일때는 홑따옴표
		char human2 = 65;
		
		System.out.println (human1);  // A가 출력됨
		System.out.println (human2);
		//human2는 65가 저장되어있지만 ASC코드인 A가 출력됨
        System.out.println ((int)human2);  //정수형으로 형변환시 65 출력됨.
        
        
        int math = 95;
        System.out.println ("Math : " + math);
        
        System.out.println("대한민국");
        System.out.println("----------------");
        
        long human3 = 20L;  
        long human4 = 10000000000L;      //LONG의 형태로 변수 선언할 때는 끝에 L을 붙여준다.
        System.out.println("human3 : " +human3);
        System.out.println("human4 : " +human4);
        
        double human5= 3.14159;
        System.out.println("human5 : "+human5);
        //double과 float은 실수를 다루는 변수 타입임.
        int human6 = (int)3.141592;
        System.out.println("human6 : "+ human6);   //int형으로 형변환(캐스팅)을 통해서 데이터타입변환
        float human7 = 3.141592f;
        System.out.println("human7 : "+human7);  //float은 실수변환타입, 끝에 f 혹은 F를 붙임
        
        boolean human8 = true;                   //boolean type은 true/false 2가지가 있음.
        System.out.println("human8 : "+human8);
        System.out.println("----------------");
        
        //타입변환 (자동타입변환 / 강제타입변환)
        //1. 자동타입변환 : 메모리가 큰 변수에 작은 변수를 대입하는 것을 의미함.
        byte human11 = 10;  //1byte (8bit)
        int human12 = human11;  //4byte (32bit)
        System.out.println("human12 : "+human12);
        //대응하기 어려운 형태(예외)
       /* byte human13 = -10;
        char human14 = human13; //음수는 변환 안됨.
        */
        //2. 강제타입변환 : 메모리가 작은 변수에 큰 변수를 대입하는 것을 의미함.
        int human21 = 129;
        byte human22 = (byte) human21;  //형변환을 위한 처리가 필요함.(byte)삽입 = 캐스팅
        System.out.println("human22 : " +human22);
        //127이상일때는 이상현상 발생 -> 129가 아닌 -127로 결과발생
        
        System.out.println("----------------");
        
        //산술연산자 (+-*/%) ==>%:나머지
        double human23 = 7/3.;
        int human24 = 7%3;  //7을 3으로 나누면 몫은 2, 나머지는 1
        System.out.println("human23 : " +human23); // 7.0을 3.0으로 나누면 2.3333->정수/정수 =정수
        System.out.println("human24 : " +human24); //나머지 1
        System.out.println("7/3의 몫 : " +(int)human23); //강제형변환
        
        
        System.out.println("----------------");
        
        //대입연산자(+= / -=)
        
        int human31 = 6;
        human31 += 1;     //human31 = human31 + 1;
        human31 += 1;     //human31 = human31 + 1;
        human31 = human31 + 1;  
        System.out.println("human31 : " + human31);
        
        int human32 = 2;
        human32 -= 1;
        human32 -= 1;
        human32 = human32 - 1;
        human32 = human32 - 4;
        System.out.println("human32 : "+ human32);
        
        System.out.println("----------------");
        
        //증감연산자 (++ / --)
        int human41 = 1;
        human41 ++; //human41 = human41 + 1; //무조건 1씩 증가
        human41 ++;
        System.out.println("human41 : "+ human41);
        
        int human42 = 3;
        human42 --;    //human42 = human42 - 1; //무조건 1씩 감소
        human42 --;
        System.out.println("human42 : "+ human42);
        
        int human43 = 99;
        int result1= ++human43 * 10;
        int result4= ++human43 * 10;
        
        System.out.println("human43 : " + human43);
        System.out.println("result1= " + result1);
        System.out.println("result4= " + result4);
        
        int human44 = 99;
        int result2 = human44++ * 10;   //++은 *10이후에 적용-> human44 *10 
        int result3 = human44++ * 10;
        int result5 = human44++ * 10;
        System.out.println("human44 : " +human44);
        System.out.println("result2 = " +result2);
        System.out.println("result3 = " +result3);
        System.out.println("result5 = " +result5);
        System.out.println("----------------");
        
        //관계연산자 (되돌림이 true /false임)
        boolean human51 = 10> 11;
        System.out.println("human51 : " + human51);
        boolean human52 = 10 >= 10;
        System.out.println("human52 : " + human52);
        boolean human53 = 10 != 10; //10과 10이 같지 않은가?false
        System.out.println("human53 : " + human53);
        boolean human54 = 10 == 10;
        System.out.println("human54 : " + human54);
        
        System.out.println("----------------");
        //논리연산자 (&&/ ||/^/!) : 관계연산과 관계연산의 논리를 반환 (true/false)
        boolean human61 = (10 < 11) && (9 < 11);   //true and true = true 그외 모두 false
        System.out.println("human61 : "+ human61);
        boolean human62 = (10 > 11) || (9 < 11);   //false or true = true
        //false or false 만 false 나머지는 모두 true
        System.out.println("human62 : "+ human62);
        boolean human63 = (10 < 11) ^ (9 < 11); //true ^ true = false
        //->둘이 같으면 false / 다르면 true
        System.out.println("human63 : " + human63);
        boolean human64 = !(10 < 11); //!true = false -> !는 무조건 반대
        System.out.println("human64 : "+ human64);
        
        System.out.println("----------------");
        //문자열 연산자 : 문자열끼리 더함.
        String human71 = "휴먼"; 
        String human72 = "교육";
        String human73 = human71 + human72 + "센터";
        System.out.println("human73 : "+ human73);
      
       
	}
	
}
