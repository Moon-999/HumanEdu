package EXAM_04.ClassEnum;

import java.util.Calendar;

public class ExamCalendar {
//175페이지 실습
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year = today.get(Calendar.YEAR);   //년
		int month = today.get(Calendar.MONTH) +1; //월      //Month는 0부터 시작 그래서 +1필요
		int day = today.get(Calendar.DAY_OF_MONTH); //일
		int week = today.get(Calendar.DAY_OF_WEEK); //요일(1~7)
		int hour = today.get(Calendar.HOUR);    //시간
		int minute = today.get(Calendar.MINUTE);  //분
		int second = today.get(Calendar.SECOND);  //초
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		System.out.printf("현재의 시각은 %d년 %d월 %d일 %d:%d:%d \n", year,month,day,hour,minute,second);
		System.out.printf("오늘의 요일은 %s요일입니다. \n", week);
		
		
	}

}
