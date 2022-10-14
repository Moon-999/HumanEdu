<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페주문관리-메뉴관리</title>
</head>
<body>
<table  style='width:100%; border:1px solid green;'>
	<tr><td style='width:33%;text-align:center'><h3>메뉴관리</h3></td>
		<td style='width:33%;text-align:center'><a href='/order'><h3>주문관리</h3></a></td>
		<td style='width:33%;text-align:center'><a href='/sales'><h3>실적관리</h3></a></td>
	</tr>
</table>
<table align=center>
<tr><td>
		<select id=selMenu style='width:200px' size=20></select>
	</td>
	<td>
		<input type=hidden id=id>
		<table> 
			<tr><td align=right>메뉴명</td><td><input type=text id=name></td></tr>
			<tr><td align=right>가격</td><td><input type=number id=price>원</td></tr>
			<tr><td colspan=2 align=center>
				<input type=button id=btnAdd value='등록'> &nbsp;
				<input type=button id=btnEmpty value='비우기'> &nbsp;
				<input type=button id=btnDelete value='삭제'>
			</td></tr>
		</table>
	</td></tr>
</table>
</body>
<script src='http://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	$.post('http://localhost:8083/loadMenu',{},function(rcv){
	<!--아작스 호출 코드 => $.post( url(RequestMapping, 서버에 보내는 입력, function(서버로부터 받은 출력), 'json or text or xml'(수신데이터포맷)    -->
	<!--get방식 => $.get( url(RequestMapping, 서버에 보내는 입력, function(서버로부터 받은 출력), 'json or text or xml'(수신데이터포맷)    -->
		console.log(rcv);
		for(i=0; i<rcv.length; i++){
			let str='<option>'+rcv[i]['id']+', '+rcv[i]['name']+', '+rcv[i]['price']+'</option>';
			$('#selMenu').append(str);
		}
	},'json');
})
.on('click','#btnAdd',function(){
	if($('#name').val()=='' || $('#name').val()==null){
		alert('메뉴명은 반드시 입력해야 합니다.');
		return false;
	}
	if($('#price').val()=='' || $('#price').val()==null || isNaN($('#price').val())){
		alert('가격은 반드시 숫자로 입력해야 합니다.');
		return false;
	}
	if($('#id').val()==''){ //insert
		$.post('http://localhost:8083/addMenu',{name:$('#name').val(),price:$('#price').val()},
				function(rcv){
					getlist();
					
		},'text');
	}
	else{ //update
		$.post('http://localhost:8083/updateMenu',{id:$('#id').val(),name:$('#name').val(),price:$('#price').val()},
				function(rcv){
					getlist();		
		},'text');
	}
	
})
.on('click','#selMenu option',function(){
	let optstr=$(this).text();
	let ar=optstr.split(',');
	$('#id').val(ar[0]);
	$('#name').val($.trim(ar[1]));
	$('#price').val($.trim(ar[2]));
	return false;
})
.on('click','#btnEmpty',function(){
	$('#id,#name,#price').val('');
	return false;
})
.on('click','#btnDelete',function(){
	if($('#id').val()==''){
		alert('삭제할 메뉴를 선택하십시오');
		return false;
	}
	//if(confirm('정말 삭제하시겠습니까?')==false) return false;
	if(!confirm('정말 삭제하시겠습니까?')) return false;
	$.post('http://localhost:8083/deleteMenu',{id:$('#id').val()},function(rcv){
		getlist();
	},'text');
})

function getlist(){
	$.post('http://localhost:8083/loadMenu',{},function(rcv){
			$('#selMenu').empty();
			for(i=0; i<rcv.length; i++){
				let str='<option>'+rcv[i]['id']+', '+rcv[i]['name']+', '+rcv[i]['price']+'</option>';
				$('#selMenu').append(str);
			}
			//$('#name,#price').val('');
			$('#btnEmpty').trigger('click');
		},'json');
	}
</script>

</html>