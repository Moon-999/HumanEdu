package Exam09;

public class Test {
//	int value;
//	public Test(int value) {
//		this.value = value;
//	} =>new Test(숫자)로 바꾸고 싶을때.
	public void test(int value) throws Exception{
		//호출한 부분으로 예외를 던짐.
		if(value > 100) {
			System.out.println("예외 Value : "+value);
			throw new Exception();
			//Exception을 만들어서 메서드에 있는 예외로 처리.
		}
		System.out.println("Value : "+value);
	}
}
