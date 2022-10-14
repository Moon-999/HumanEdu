package exercise05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super("김택선");
		this.name = name;
		this.studentNo = studentNo;
		System.out.printf("Child %s,%d",this.name, this.studentNo);
	}
	
}
