package pack.human;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet{
	//HttpServlet은 추상클래스
	//위의 추상클래스를 상속받은 First라는 자바파일은 service라는 메서드를 오버라이드 해야함.
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		System.out.println("console hello human1");
		//console창에 출력하는 것을 의미.
		
		PrintWriter out = response.getWriter();
		out.println("Browser hello human1");
		//PrintWriter는 Browser에 출력하는 것 의미.
	}
}
//first.java파일이 컴파일되어 fist.class파일이 생성되고, 톰캣과 연동하는 것은 자동으로 처리됨.
//run as> run on Server를 실행할 경우 위의 내용이 자동으로 처리됨.
