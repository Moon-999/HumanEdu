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
		<td style='width:33%;text-align:center'><a href='/order'><h3>주문관리</h3></a></td>
		<td style='width:33%;text-align:center'><h3>실적관리</h3></td>
	</tr>
</table>
<table align=center>
	<tr>
		<td><input type=date id=start>&nbsp;~&nbsp;<input type=date id=end>
			&nbsp;<input type=button id=btnFind value='찾기'>
		</td>
	</tr>
	<tr>
		<td style='vertical-align:top;'>
		<select id=selSales size=20 style='width:350px;'></select>
		</td>
	</tr>
	<tr>
		<td>총 매출액: <input type=text id=outgo readonly></td>
	</tr>
</table>
</body>
<script src='http://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
//.ready(function(){
	//$.post('http://localhost:8083/loadOrder',{},function(rcv){
		//console.log(rcv);
		//for(i=0; i<rcv.length; i++){
			//let str='<option>'+rcv[i]['menu']+', '+rcv[i]['qty']+', '+rcv[i]['price']+', '+rcv[i]['created']+'</option>';
			//console.log(str)
			//$('#selSales').append(str);
		//}
	//	
	//},'json');
//})

.on('click','#btnFind',function(){
	let a = $('#start').val();
	let ar = a.split('-');
	let start1 = ar[0]+ar[1]+ar[2];
	let b = $('#end').val();
	let br = b.split('-');
	let end1 = br[0]+br[1]+br[2];
	console.log('btnFind')
	$('#selSales').empty();
	$.post('http://localhost:8083/getSalesList',{start:start1, end:end1 },function(rcv){
		for(i=0; i<rcv.length; i++){
			let str='<option>'+rcv[i]['mobile']+', '+rcv[i]['menu']+', '+rcv[i]['qty']+', '+rcv[i]['price']+', '+rcv[i]['created']+'</option>';
			$('#selSales').append(str);
		}
	},'json');
	$.post('http://localhost:8083/getTotal',{start:start1, end:end1},function(rcv){
		$('#outgo').val(rcv);
	},'text');
	return false;
})

</script>
</html>