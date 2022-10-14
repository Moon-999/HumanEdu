package Exam15;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		//키보드에서 입력한 글자를 bytes의 배열 변수에 담는 기능을 수행.
		//엔터를 누르면 글자수를 반환. -> 엔터까지 아스키코드로 치기때문에 +2
		//엔터를 누르는 순간 캐리지리턴(\r) + 라인피드(\n)자동으로 붙음. 그래서 글자수보다 +2.
		
		//bytes배열값보다 더 많은 값을 입력할 경우 System.in.read는 배열값까지만 입력받음.
		//한글은 한 자당 3byte임.(UTF-8코드 기반. 다른 코드기반에서는 2byte처리할 수도 있음)
		System.out.println(readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2); //그래서 -2를 해줘야함.(-3이상은 글자까지 줄어듦)
		System.out.println(str);
	}

}
