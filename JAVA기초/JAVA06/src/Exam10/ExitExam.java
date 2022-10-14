package Exam10;

public class ExitExam {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager(){
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
				//자동적으로 checkExit이 실행됨
				//checkExit이 정상적으로 끝나면 JVM이 종료.
				//1~5까지는 throw new SecruityException(); 발생하므로 정상종료가 안됨.
			}
			catch(SecurityException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}//설명 X
