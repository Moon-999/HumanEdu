package Exam15;

public class StringToLowerUpperCaseExam {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		
		System.out.println(str1.equals(str2));
		
		
		String lowerStr1 = str1.toLowerCase();
		System.out.println(lowerStr1); //->java programming
		String upperStr1 = str1.toUpperCase();
		System.out.println(upperStr1);//->JAVA PROGRAMMING
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equalsIgnoreCase(str2)); 
		//->대소문자 무시하고 비교해라. ->둘이 같으니까 true가 나옴.
		
		
	}

}
