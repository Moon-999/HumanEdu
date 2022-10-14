package pack.status;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CalcSession2")

public class CalcSession2 extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		
		HttpSession sess = request.getSession();
		int result = 0;
		String strValue = request.getParameter("value");
		String operator = request.getParameter("operator");
		if(operator.equals("+")||operator.equals("-")) {
			sess.setAttribute("x", strValue);
			sess.setAttribute("oper", operator);
		}
		else if(operator.equals("=")) {
			int intValue = Integer.parseInt(strValue);
			String strX = (String) sess.getAttribute("x");
			if(sess.getAttribute("oper").equals("+")) {
				result = Integer.parseInt(strX) + intValue;
			}
			else if(sess.getAttribute("oper").equals("-")) {
				result = Integer.parseInt(strX) - intValue;
			}
			PrintWriter out = response.getWriter();
			out.printf("result=%d", result);
		}
	}



}
