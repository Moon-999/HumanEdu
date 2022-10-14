package Exam_19.packA;

import Exam_19.packB.D;

public class B {
	A a = new A();  //A가 default생성자이기때문에 같은 패키지 안에서는 접근 가능
	B b = new B();
//	C c = new C();
	D d = new D();

}
