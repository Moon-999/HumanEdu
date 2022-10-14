<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
<style>
        header{
            display: flex;
            flex-direction: row;
            margin-left: 100px;
            margin-top: 50px;
        }
        .img{
            position: relative;
            margin-left: 700px;
        }
        #section{
            border: 2px solid black;
            padding: 20px;
            margin: 20px 70px;
            width: 80%;
        }
        .section1{
            display:flex;
            flex-direction: row;
            margin-bottom: 20px;
        }
        
        .combo-Box{
            margin-left: 50px;
            margin-right: 50px;
        }
        .combo1{
            margin-right: 50px;
        }
        
        #section_1{
           border: 2px solid black;
           padding: 20px;
           margin: 0px 70px;
           width: 80%;
           display: flex;
           flex-direction: column;
        }
        .check-box{
            border: 2px solid black;
            padding:20px;
            margin:50px 100px;
        }
        
        
</style>
</head>
<body>
<header>
	<h1>Grid 화면</h1>
</header>
<section id="section">
        <section class="section1">
            <div>
                <input class="input-Box" type="button" style="width:200px; height: 35px;" value="input Box" />
            </div>
            
            <select class="combo-Box" style="width:200px; height:35px">
                <option value="combo-Box" >combo_box</option>
                <option value="1">1</option>
                <option value="1">1</option>
                <option value="1">1</option>
            </select>
            <div>
                <input class="radio-Button" type="radio" style="font:15px;width:15px;height:15px;margin-left:50;" value="Radio Button1"/>Radio Button1
                <input class="radio-Button" type="radio" style="font:15px;width:15px;height:15px;margin-left:50;" value="Radio Button2"/>Radio Button2
            </div>
        </section>
        <section class="section2">
            <select class="combo1" style="width:200px; height:35px" value="combo1">
                <option value="combo1">comboBox1</option>
                <option value="Korea">Korea</option>
                <option value="America">America</option>
                <option value="Japan">Japan</option>
            </select>
            <select class="combo2" style="width:200px; height:35px" value="combo2">
                <option value="combo2">comboBox2</option>
                <option value="Seoul">Seoul</option>
                <option value="Busan">Busan</option>
                <option value="Incheon">Incheon</option>
            </select>
            
        </section>
</section>
    <section id="section_1">
        <section class="buttons" style="text-align:right">
            <input class="select" type="button" value="조회">
            <input class="save" type="button" value="저장">
            <input class="down" type="button" value="엑셀다운">
            <input class="del" type="button" value="삭제">
        </section>
        <seciton class="check-box">
            <p><input id="checks" type="checkbox" value="Check Box">Check Box</p>
            <p><input id="check1" type="checkbox" value="1."></p>
            <p><input id="check2" type="checkbox" value="2."></p>
            <p><input id="check3" type="checkbox" value="3."></p>
            <p><input id="check4" type="checkbox" value="4."></p>
            
        </seciton>
    </section>
</body>
<script src='http://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','.select',function(){
	$.post('http://localhost:8083/loadView',{},function(rcv){
		$('.check1').empty();
		for(i=0; i<rcv.length; i++){
			let str='<option>'+rcv[i]['id']+', '+rcv[i]['content']+'</option>';
			$('.check1').append(str);
		}
		//$('#name,#price').val('');
		$('#btnEmpty').trigger('click');
	},'json');
},'text')

</script>
</html>