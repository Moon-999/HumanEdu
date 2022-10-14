package Exam_22.exam1;

public class Student {
	String StudentId;     //학번
	String StudentName;
	String major;         //전공
	String[] courseName;  //수강과목
	int[] courseScore;    //과목별 점수
	
	Student(String StudentId, String StudentName, String major, String[] courseName){
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.major = major;
		this.courseName = courseName;
//		this.courseScore = courseScore;   // 아직 시험보기 전이라 넣을 수 없음
	}
	void setScores(int[] courseScore) {
		this.courseScore = courseScore;
	}
	void getScores() {
		int total = 0;
		double avg = 0.0;
		for(int i = 0; i<courseName.length; i++) {
			System.out.printf("%s과목 : %d점 \n", courseName[i], courseScore[i]);
			total = total + courseScore[i];
		}
		avg = (double) total/courseName.length;
		System.out.printf("%s님의 총점은 %d이고, 평균은 %f입니다. \n", StudentName, total, avg);
		
	}
}

