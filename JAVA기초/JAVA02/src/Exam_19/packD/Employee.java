package Exam_19.packD;

public class Employee {
	public int EmployeeID;
	public static int serialNumber = 5000;
	
	public Employee() {
		serialNumber++;
		this.EmployeeID = serialNumber;
	}

}
