package pack.status;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcApplication2")

public class CalcApplication2 extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		
		ServletContext app = request.getServletContext();
		int result = 0;
		String strValue = request.getParameter("value");
		String operator = request.getParameter("operator");
		if(operator.equals("+")||operator.equals("-")) {
			app.setAttribute("x", strValue);
			app.setAttribute("oper", operator);
		}
		else if(operator.equals("=")) {
			int intValue = Integer.parseInt(strValue);
			String strX = (String) app.getAttribute("x");
			if(app.getAttribute("oper").equals("+")) {
				result = Integer.parseInt(strX) + intValue;
			}
			else if(app.getAttribute("oper").equals("-")) {
				result = Integer.parseInt(strX) - intValue;
			}
			PrintWriter out = response.getWriter();
			out.printf("result=%d", result);
		}
		
	}



}
