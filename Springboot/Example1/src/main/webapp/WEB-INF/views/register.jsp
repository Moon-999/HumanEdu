<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>

성명   -   ${name }
<br>
모바일  -    ${mobile }
<br>
loginId   -   ${newId }
<br>
비밀번호    -   ${N1passcode }
<br>

<input type=button name=btn5 value='확인' onclick='document.location="/num1";' >

</body>
</html>