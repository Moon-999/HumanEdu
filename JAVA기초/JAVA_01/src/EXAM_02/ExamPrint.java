package EXAM_02;

public class ExamPrint {

	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.print("안녕하세요.");
		System.out.print("저는 휴먼교육센터의 \n");
		System.out.print("정문희입니다.");
		System.out.print("human");
		
//		System.out.println();
//		System.out.print("\n");  두개는 같은 의미
		
		System.out.println("안녕하세요. 저희반은 "+ "8" + "명 입니다.");
		
		int studentCnt = 8;
		System.out.printf ("안녕하세요. 저희반은 %d명입니다. \n", 8);
		System.out.printf("안녕하세요. 저희반은 %d명입니다. \n", studentCnt);   //d는 정수표시
		System.out.printf ("안녕하세요. 저희반은 %3d명입니다. \n", studentCnt);  //3d는 3자리 정수표시
		
	    double temperature = 32.3;
	    int humidity = 63;
	    System.out.printf ("현재의 온도는 %f입니다. \n", temperature);
	    System.out.printf ("현재의 온도는 %4.2f입니다. \n", temperature);  
	    //4.2는 자리수를 의미함 (4는 소수점 앞자리, 2는 소수점 뒷자리)
	    System.out.printf ("현재의 온도는 %4.2f이고, 습도는 %d%% 입니다. \n", temperature, humidity);
		
	    boolean isMan = true;
	    System.out.printf ("저는 남자일까요? %b \n", isMan);
	    //%b는 boolean형태의 값을 출력한다. 
	    
	    //%c =한글자, %x =이진수, %s =한글자 이상을 표현
	    
	    System.out.printf("안녕하세요. %s \n", "정문희입니다.");
	    
	}

}
