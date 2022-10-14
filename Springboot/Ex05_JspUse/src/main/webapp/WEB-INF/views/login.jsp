<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<!--<form method='get' action='/checkUser'>  -->
로그인 아이디:<input type=text name=Loginid id=Loginid /><br>
비밀번호:<input type=password name=passcode id=passcode /><br>
<!-- <input type=submit value='전송' name=btnSubmit id=btnSubmit/> -->
<input type=button value='전송' name=btnSubmit id=btnSubmit />
&nbsp;&nbsp;  
<input type=reset value='비우기' name=btnReset id=btnReset />
<!-- </form> -->
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnSubmit',function(){
	alert('click');
	if($('#Loginid').val()!=''&&$('#passcode').val()!=''){
		let url='/checkUser?Loginid='+$('#Loginid').val()+'&passcode='+$('#passcode').val();
		                  //input태그 안의 name으로 써야함.
		document.location=url;
	} else{
		alert('로그인 아이디 또는 비밀번호가 입력되지 않았습니다.');
		return false;
	}
})
</script>
</html>