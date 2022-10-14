package EXAM_02;

import java.util.Scanner;

public class Examinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //ctrl + shift + o
		String name;
		System.out.print("이름은?");
		name = sc.nextLine();
		System.out.printf("이름은 %s 입니다. \n", name);
		
		int age;
		System.out.print("나이는?");
		age = sc.nextInt();
		System.out.printf("나이는 %d 입니다. \n", age);
		
		double temperature;
		System.out.print("온도는?");
		temperature = sc.nextFloat();
		System.out.printf("온도는 %3.2f 입니다. \n", temperature);
		
		int humanity;
		System.out.print("습도는?");
		humanity = sc.nextInt();
		System.out.printf("습도는 %d%% 입니다.", humanity);
	
				
		
		
	}

}
