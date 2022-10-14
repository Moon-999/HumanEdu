package Exercise;

public class Student_s {
	
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public String info;
	
    public Student_s(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
    public void info() {
    	System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.1f", name, ban, no, kor, eng, math, kor+eng+math, (kor+eng+math) /3. );
    }
//    public String info() {
//    	String str = this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + ",";
//    	return str;
//    }
		
	}
    
	
	


