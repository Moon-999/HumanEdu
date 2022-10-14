package Exam15;

public class StringValueOfExam {

	public static void main(String[] args) {
		String str1 = String.valueOf(10); //int 10 => String "10"
		String str2 = String.valueOf(10.5); //double 10.5 => String "10.5"
		String str3 = String.valueOf(false); //boolean false => String "false"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
