<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm</title>
</head>
<body>
<form method='post' action='/dologin'>
아이디 <input type=text name=Id id=Id /><br>
비밀번호 <input type=password name=passcode id=passcode /><br>
<br>
<input type=submit value='Login' name=btn2 id=btn2 />
<input type=reset value='비우기' name=btnReset id=btnReset />
<br>
<br>
<br>
<a href='/signOn' >회원가입</a>
</form>
</body>
</html>