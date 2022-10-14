package Exam06_3;

public class VehicleExam {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.run();
//		Bus bus1 = (Bus)v;
//		bus1.checkFare();
		
		//강제타입변환을 위해서는 자동타입변환이 되었던 객체만 대상이 됨.
		//instanceof를 통해 대상 확인가능
		boolean isBus = (v instanceof Bus);
		System.out.println(isBus);
		//true가 나온다면 자동타입변환이 된 관계임.
		//위의 내용처럼 바로 하기 보다는 확인 후 강제타입변환을 해야함.
		
		if(v instanceof Bus) {
			Bus bus1 = (Bus)v;
			bus1.run();
			bus1.checkFare();
			//Bus만의 메서드를 수행하기 위해서 강제타입변환(Vehicle => Bus)을 하고,
			//CheckFare 메서드 수행 가능함.
		}
	}

}
