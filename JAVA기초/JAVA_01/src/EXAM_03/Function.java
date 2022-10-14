package EXAM_03;

public class Function {

	public static void main(String[] args) {
		printTest();
		System.out.println("---------------------");
		printTest();
		System.out.println("---------------------");
		printTest("정문희");
		printTest("김택선");
		printTest("정문희", 24);
		System.out.println("---------------------");
		printTest(24, 28);
		System.out.println("---------------------");
		printTest("복실이","라미");
		printTest("무니", "택이");
		int x1,x2;
		System.out.println("---------------------");
		x1 = add(10,20);
		System.out.printf("z : %d \n", x1);
		System.out.println("---------------------");
		System.out.printf("x2: %d \n", add(10,20));
		x2 = add(10,20,30);
		System.out.printf("x2 = %d \n", x2);
		double z1= add(5.5, 4.5);
		System.out.printf("z1 = %f \n", z1);
		
		
		//함수가 void가 아니라면 return값이 필요하며,
		//이 return값은 함수앞에 정의된 값의 타입과 통일해야 함.
		//return값이 int형이면, void==>int로 바꾸어야 함.
	}

	private static double add(double d, double e) {
		System.out.println(d);
		System.out.println(e);
		return d+e;
	}

	private static int add(int i, int j, int k) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		return i+j+k;
	}

	private static int add(int i, int j) {
		System.out.printf("i : %d \n", i);
		System.out.printf("j : %d \n", j);
		int z = i+j;
		return z;
	}

	private static void printTest(String string, String string2) {
		System.out.printf("%s와 %s는 친구입니다. \n", string, string2);
		
	}

	private static void printTest(int i, int i2) {
		System.out.printf("제 나이는 %d이고, 오빠 나이는 %d입니다. \n", i,i2);
		
	}

	private static void printTest(String string, int i) {
		System.out.printf("제 이름은 %s입니다. 그리고 제 나이는 %d입니다. \n", string, i);
	   
		
	}

	private static void printTest(String string) {
		System.out.printf("제 이름은 %s입니다,\n", string);
	}		

	private static void printTest() {
		System.out.println("print함수 TEST");
		System.out.println("print함수 TEST");
		System.out.println("print함수 TEST");
		System.out.println("print함수 TEST");
	}

}
