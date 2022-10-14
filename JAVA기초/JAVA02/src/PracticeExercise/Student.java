package PracticeExercise;

public class Student {
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	
	
	public Student() {
		this("정문희",80,90,70);
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getTotal() {
		int total;
		total = this.kor + this.eng + this.math;
		return total;
	}
	public double getAvg() {
		double avg;
		avg = getTotal()/3.;
		return avg;
	}
	public String info() {
		
		return  name + "," + kor + ","+ eng + "," + math + "," + getTotal() + ","+ getAvg();
	}
	public void getinfo() {
		System.out.printf("%s,%d,%d,%d,%d,%f",name,kor,eng,math,getTotal(),getAvg());
	}

}
