<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mission1</title>
</head>
<body>
<header><h2>Grid그리드</h2></header>
<section style="border:2px solid black;">
	<div>
		<input type = "text" style="width:200px; height:35px; margin:10px 30px" id="id" name="id" placeholder="id">
		<input type = "text" style="width:200px; height:35px; margin:10px 60px" id="name" name="name" placeholder="name">
		<input type = "radio" id="gender" name="gender" value="male"><label for="male">남</label>
		<input type = "radio" id="gender" name="gender" value="female"><label for="female">여</label>  
	</div>
	<div>
		<select id="country" style="width:210px; height:40px; margin:10px 30px;" onchange="categoryChange(this)" >
			<option>나라</option>
			<option value="대한민국">대한민국</option>
			<option value="미국">미국</option>
			<option value="일본">일본</option>
		</select>

		<select id="city" style="width:210px; height:40px; margin:10px 60px;"id="city">
			<option>도시</option>
		</select>
		
		<input style="width:210px; height:40px; margin:10px 30px;" type=date id=start>
		&nbsp;~&nbsp;
		<input style="width:210px; height:40px; margin:10px 30px;" type=date id=end>
	</div>
	
</section> 
<section style="border:2px solid black;">
	<div align="right" style="margin-right:100px;">
		<input type="button" id="select" name="select" value="조회">&nbsp;&nbsp;
		<input type="button" id="add" name="add" value="저장">&nbsp;&nbsp;
		<input type="button" id="download" name="download" value="엑셀다운">&nbsp;&nbsp;
		<input type="button" id="resetbtn" name="resetbtn" value="삭제">  
	</div>
	<table align=center id="table" style="border:2px solid black; width:700px;">
		<thead>
			<tr>
				<th style='text-align:left'><input type="checkbox" id="checkbox" name="allcheck" >선택</th>
				<th style='text-align:left'>아이디</th>
				<th style='text-align:left'>이름</th>
				<th style='text-align:left'>성별</th>
				<th style='text-align:left'>나라</th>
				<th style='text-align:left'>도시</th>
			</tr>
		</thead>
		<tbody id="list">
		</tbody>
	</table>
	
	
	
</section>
</body>
<script>
function categoryChange(e) {
	var good_a = ["서울", "인천", "부산", "광주"];
	var good_b = ["뉴욕", "LA", "캘리포니아", "맨해튼"];
	var good_c = ["도쿄", "오사카", "오키나와", "후쿠오카"];
	var target = document.getElementById("city");

	if(e.value == "대한민국") var d = good_a;
	else if(e.value == "미국") var d = good_b;
	else if(e.value == "일본") var d = good_c;

	target.options.length = 0;

	for (x in d) {
		var opt = document.createElement("option");
		opt.value = d[x];
		opt.innerHTML = d[x];
		target.appendChild(opt);
	}	
}
</script>
<script src='http://code.jquery.com/jquery-3.4.1.js'></script>
<script>

$(document)

.on('click','#add',function(){
	$.post('http://localhost:8083/addlist',
			{id:$('#id').val(),name:$('#name').val(),gender:$('#gender:checked').val(), country:$('#country').val(), city:$('#city').val()},
				function(){
			
		},'text');
	
})

.on('click','#select',function(){
	$.post('http://localhost:8083/getlist',{id:$('#id').val(),name:$('#name').val(),gender:$('#gender').val(), country:$('#country').val(), city:$('#city').val()},
				function(){
		getlist();
		let str1="<tr><td><input type='checkbox' class='chkbox' name='check'></td><td>"+$('#id').val()+'</td>'+'<td>'+$('#name').val()+'</td>'+'<td>'+$('#gender').val()+'</td>'+'<td>'+$('#country').val()+'</td>'+'<td>'+$('#city').val()+'</td></tr>';
		$('#list').append(str1);
		},'json');
})
.on('click','#checkbox',function(){
	if($("#checkbox").is(":checked")) $("input[name=check]").prop("checked", true);
	else $("input[name=check]").prop("checked", false);
})
.on('click', 'input[name=check]',function(){
	$(this).prop("checked",true);
	// 체크된 체크박스의 수가 전체 수와 같을 때 헤더 체크박스가 체크됨.
	var total = $("input[name=chk]").length;
	var checked = $("input[name=chk]:checked").length;

	if(total != checked) $("#cbx_chkAll").prop("checked", false);
	else $("#cbx_chkAll").prop("checked", true); 
	
})
.on('change','input[name=check]',function(){
	// 체크박스 갯수와  체크된 체크박스 갯수 비교 후 불일치시 헤더 체크박스 해제 
	if($(this).length != $("input[name=check]:checked").length) $("#checkbox").prop("checked", false) ; 
	$(this).prop("checked",false);
})

function getlist(){
	$.post('http://localhost:8083/loadlist',{},function(rcv){
			$('#list').empty();
			for(i=0; i<rcv.length; i++){
				let str="<tr><td><input type='checkbox' class='chkbox' name='check'></td><td>"+rcv[i]['id']+'</td>'+'<td>'+rcv[i]['name']+'</td>'+'<td>'+rcv[i]['gender']+'</td>'+'<td>'+rcv[i]['country']+'</td>'+'<td>'+rcv[i]['city']+'</td></tr>';
				$('#list').append(str);
			}
			$('#id,#name').val('');
			$("input:radio[name='gender']").prop('checked', false);
		},'json');
	}
</script>

</html>