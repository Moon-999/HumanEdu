package Exam11;

public class GcExam {

	public static void main(String[] args) {
		Employee emp;
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호 : "+ emp.eno);
		
		System.gc(); //쓰레기 수집기 실행 요청
	}

}
