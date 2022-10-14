<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signOn</title>
</head>
<body>
<form method='post' action='/register'>
실명 <input type=text name=name id=name value="${name}" required/><br>
모바일 <input type=text name=mobile id=mobile value="${mobile}" required/><br>
아이디 <input type=text name=newId id=newId value="${newId}" required/><br>
비밀번호 <input type=password name=Npasscode id=Npasscode required/><br>
비밀번호 확인<input type=password name=N1passcode id=N1passcode required/><br>
<br>
<br>
<input type=submit value='가입' name=btn3 id=btn3 />
<input type=reset value='취소' name=cancel id=cancel />

</form>
</body>
</html>