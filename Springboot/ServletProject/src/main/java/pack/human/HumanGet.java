package pack.human;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/humanGet")
public class HumanGet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		int cnt = 0;
		String strCnt = request.getParameter("cnt");
		// url로 요청시 cnt라는 변수에 담겨있는 것을 추출.(추출시에는 무조건 문자열로 추출됨)
		PrintWriter out = response.getWriter();
		
		
		//만약에 null이면 아래동작을 할 수 없음.
		if(strCnt !=null && strCnt !="") {
			cnt = Integer.parseInt(strCnt);
		}
		
		
		for(int i=1; i<=cnt; i++) {
//			out.println("<h1>Hi~~~~Human</h1>");
			out.println("<h"+i+">Hi~~~~Human</h"+i+">");
			//문자열 연산은 더하기로 붙일 수 있음
			//첫번째는 h1태그 두번째는 h2태그
		}
	}

}
