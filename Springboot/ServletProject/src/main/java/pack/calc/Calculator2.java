package pack.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator2")
public class Calculator2 extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		
		String[] strvalues = request.getParameterValues("values");
		//getParameter는 단수의 값(즉, 변수에 값이 1개일때
		//getParameterValues는 복수의 값(즉, 변수에 값이 2개 이상일때)
		
		int intx = Integer.parseInt(strvalues[0]);
		int inty = Integer.parseInt(strvalues[1]);
		int result=0;
		String strOper = request.getParameter("operator");
		//request.getParameter를 통해서 얻는 것은 해당 Tag의 value값임.
		System.out.println("strOper ="+strOper);
		
		if(strOper.equals("더하기")) {
			result = intx+ inty;
		}
		else {
			result = intx-inty;
		}
		
		PrintWriter out = response.getWriter();
		out.printf("결과는 %d입니다.",result);
		
	}
}
