<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width='100%' style='border:1px solid green;'>
	<tr><td style='width:33%;text-align:center'><a href='/menu'><h3>메뉴관리</h3></a></td>
		<td style='width:33%;text-align:center'><h3>주문관리</h3></td>
		<td style='width:33%;text-align:center'><a href='/sales'><h3>실적관리</h3></a></td>
	</tr>
</table>
<table align=center style='border-collapse:collapse;border:1px solid blue'>
<tr>
	<td style='border:1px solid blue'><select id=selMenu size=20 style='width:250px'></select></td>
	<td style='border:1px solid blue'><select id=selOrder size=20 style='width:250px'></select></td>
</tr>
<tr>
	<td style='border:1px solid blue;vertical-align:top'>
	<input type=hidden id=id>
	<input type=hidden id=fprice>
		<table>
		<tr><td>메뉴</td><td><input type=text id=name readonly size=20></td></tr>
		<tr><td>수량</td><td><input type=number id=qty min=1 max=99>잔</td></tr>
		<tr><td>가격</td><td><input type=text id=price size=10>원</td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnOrder value='주문'> &nbsp;
			<input type=button id=btnEmpty value='비우기'>
		</td></tr>
		</table>
	</td>
	<td style='border:1px solid blue;vertical-align:top'>
		<table>
		<tr><td>총금액</td><td><input type=text readonly id=total size=10>원</td></tr>
		<tr><td>모바일번호</td><td><input type=text id=mobile size=15></td></tr>
		<tr><td colspan=2><lable id=lblComment></lable></td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnComplete value='주문완료'>&nbsp;
			<input type=button id=btnCancel value='주문취소'>
		</td></tr>
		</table>
	</td>
</tr>
</table>
</body>
<script src='http://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	getlist();
})
.on('click','#selMenu option',function(){ //익명함수(unnamed function), call back함수(웹브라우저가 불러줌)
	let optstr=$(this).text();
	let ar=optstr.split(',');
	$('#id').val(ar[0]);
	$('#name').val($.trim(ar[1]));
	$('#qty').val(1);
	$('#price').val($.trim(ar[2]));
	$('#fprice').val($.trim(ar[2]));
	return false;
})
.on('change','#qty',function(){
	let a=parseInt($('#fprice').val());
	let b=parseInt($('#qty').val());
	//   =parseInt($(this).val());
	let c=parseInt($('#price').val());
	c=a*b;
	$('#price').val(c);
	return false;
})
.on('click','#btnEmpty',function(){
	$('#name,#qty,#price').val('');
	return false;
})
.on('click','#btnOrder',function(){
	if($('#name').val()=='' || $('#name').val()==null){
		alert('메뉴를 반드시 선택하여 주십시오.');
		
	}
	getOrder();
	total=0;
	$('#selOrder option').each(function(){
		str=$(this).text();
		ar=str.split(',');
		
		total=total+parseInt(ar[2]);
		
	})
	$('#total').val(total);
	return false;
		
})
.on('click','#btnCancel',function(){
	$('#selOrder').empty();
	$('#total,#mobile').val('');
	return false;
})
.on('click','#btnComplete',function(){
	$('#selOrder option').each(function(){
		str=$(this).text();
		ar=str.split(',');
		$.post('http://localhost:8083/addOrder',
				{mobile:$('#mobile').val(),name:ar[0],qty:$.trim(ar[1]),price:$.trim(ar[2])},function(){
			let str1='<option>'+$('#mobile').val()+', '+ar[0]+', '+$.trim(ar[1])+', '+$.trim(ar[2])+'</option>';
			$('#selSales').append(str1);
			$('#lblComment').text(str+" inserted");
			$('#btnCancel').trigger('click');
			setTimeout(function(){ //setTimeout:일정시간 후에 한번 실행/ setInterval:일정시간마다 주기적으로 반복 실행
				//clearTimeOut():setTimeout의 변수를 넣어서 setTimeout을 중지시킴 /clearInterval():
				$('#lblComment').text('');
			},3000); //3000 = 3초 의미
		},'text');
	})
})
function getlist(){
		$('#selMenu').empty();
		$.post('http://localhost:8083/loadMenu',{},function(rcv){
				$('#selMenu').empty();
				for(i=0; i<rcv.length; i++){
					let str='<option>'+rcv[i]['id']+', '+rcv[i]['name']+', '+rcv[i]['price']+'</option>';
					$('#selMenu').append(str);
				}
				$('#name,#price').val('');
				
			},'json');
		}
function getOrder(){
	let str='<option>'+$('#name').val()+', '+$('#qty').val()+', '+$('#price').val()+'</option>';
	$('#selOrder').append(str);
	$('#btnEmpty').trigger('click');
}
		

</script>
</html>