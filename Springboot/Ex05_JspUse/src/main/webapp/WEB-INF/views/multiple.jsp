<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<form method='get' action='/checkUser2' id=frmGugu>
Dan:<input type=text name=dan id=dan />
<input type=submit value='show' name=btnSubmit id=btnSubmit/>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit','#frmGugu',function(){
	document.location='/checkUser2/'+$('#dan').val();
	                                 //여기서 dan은 input태그 안의 name=dan을 의미.
	return false; //form 태그의 실행을 '중단하라'
	//return true => /checkUser의 url을 그대로 보여줘서 그 안의 내용까지 url에 찍어서 보여줌
	//그래서 꼭 return false;를 써줘야함
})
//또다른 방법
//$(document).on('click','#btnSubmit',function(){ 버튼이 클릭만 되면 기능 실행
//	if(){
//	  $('#frmLogin').submit();
//    
//	} else{
//	  return false;
//	}
//})
</script>
</html>

