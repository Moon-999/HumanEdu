<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=2; i<=9; i++){
	for(int j=1; j<=9; j++){
		out.println("<br>");
		out.println(i+"x"+j+"="+(i*j));
		out.println("<br>");
		
		
	}
	out.println("------------------------");
}
%>
</body>
</html>