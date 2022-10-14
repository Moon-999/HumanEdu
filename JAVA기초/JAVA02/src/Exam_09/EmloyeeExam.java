package Exam_09;

public class EmloyeeExam {

	public static void main(String[] args) {
		Employee p1 = new Employee();
		System.out.printf ("현재 직원수 %d \n", Employee.serialNum); //p1.serialNum이 아닌
		Employee p2 = new Employee();                             //Employee.serialNum(클래스 차원)
		Employee p3 = new Employee();
		Employee p4 = new Employee();
		Employee p5 = new Employee();
		System.out.printf ("현재 직원수 %d \n", Employee.serialNum);
		System.out.printf("p1.employeeId : %d \n", p1.employeeId);
		System.out.printf("p2.employeeId : %d \n", p2.employeeId);
		System.out.printf("p3.employeeId : %d \n", p3.employeeId);
		System.out.printf("p4.employeeId : %d \n", p4.employeeId);
		System.out.printf("p5.employeeId : %d \n", p5.employeeId);
	}

}
