package Exam15;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExam {

	public static void main(String[] args) {
		String str = "안녕하세요";
		//영어는 한글자당 1byte 크기를 가짐
		//그 외 언어는 언어별로 차이가 존재.
		//한글-> UTF-8은 3byte, EUC-KR은 2byte임
		
		byte[] bytes1 = str.getBytes();
		//시스템에 설정된 기본 코드체계
		System.out.println("bytes1.length: "+ bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: "+str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: "+bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: "+str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: "+bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("byes3->String: "+str3);
			
			
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
