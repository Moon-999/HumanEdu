package EXAM_04.ClassEnum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		//오늘의 요일 순서적으로 반환합니다.(1~7)
		//week이란 변수에는 오늘의 요일을 일요일부터 순서대로 반환
		
		System.out.println(week);
		switch (week) {
		case 1 : 
			today = Week.SUN;
			break;
		case 2 : 
			today = Week.MON;
			break;
		case 3 : 
			today = Week.TUE;
			break;
		case 4 : 
			today = Week.WED;
			break;
		case 5 : 
			today = Week.THU;
			break;
		case 6 : 
			today = Week.FRI;
			break;
		case 7 : 
			today = Week.SAT;
			break;
		}
		System.out.println("today : "+today);
		System.out.println("today : "+today.name());
		System.out.println("today : "+today.ordinal());
		
		Week day1 = Week.MON; //day1 = 월(2)
	    Week day2 = Week.THU; //day2 = 목(5)
	    System.out.println("day1.compareTo(day1) : "+day1.compareTo(day2));
	    System.out.println("day2.compareTo(day1) : "+day2.compareTo(day1));
	    System.out.println("day1.compareTo(day1) : "+day1.compareTo(day1));
	    
	    
	    System.out.println(Week.valueOf("SUN"));
	    System.out.println(Week.FRI);
	    
	    System.out.println(Week.values());
	    
	    Week[] days = Week.values();
	    //1개의 값이 아닌 여러개의 값이 넘어옵니다.
	    //days라는 것 안에는 Week Enum type의 값이 배열의 형태로 관리되고 있습니다.
	    //days = {SUN, MON, TUE, WED, THU, FRI, SAT}
	    for (Week a : days) {
	    	System.out.println(a);
	    }

	}

}
