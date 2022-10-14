package Exam02;

import java.util.HashMap;

public class KeyExam {

	public static void main(String[] args) {
		//Key객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key,String> hashMap = new HashMap<Key,String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		Key k1 = new Key(1);
		hashMap.put(k1, "홍길동");
		
		//식별키 "new Key(1)"로 "홍길동"을 읽어옴
		Key k2 = new Key(1);
		String value = hashMap.get(k2);
		System.out.println(value);
		
		System.out.println(k1 + "-" + k2);
	}

}
