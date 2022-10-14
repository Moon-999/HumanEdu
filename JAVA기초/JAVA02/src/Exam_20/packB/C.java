package Exam_20.packB;

import Exam_20.packA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		a.field1 = 11;  
		//public이므로 import를 통해 외부에서 접근하여 데이터 갱신 가능
//		a.field2 = 12;  //private은 접근 불가능
//		a.field3 = 13;
		//default이기 때문에 다른 패키지의 외부에서 접근 불가
		
		a.method1();
//		a.method2();  //private 접근 불가
//		a.method3();  //default 다른 패키지에서 접근 불가
	}

}
