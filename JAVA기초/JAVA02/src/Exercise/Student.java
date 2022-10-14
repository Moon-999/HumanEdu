package Exercise;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public int Total;
	public double Avg;
	
	public Student() {
		this("홍길동", 1, 1, 100, 60, 76);
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		this.Total = this.kor + this.eng + this.math;
		return this.Total;
	}
	
	public double getAvg() {
		this.Avg =(double) this.Total / 3;
		return this.Avg;
	}

}
