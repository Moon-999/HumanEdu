// window.onload = function init(){
    window.addEventListener("load", function(){let btnPrint = document.getElementById("btnInput");
    //btnPrint는 button객체를 의미함. 
    btnPrint.onclick = function (){
    let x, y;
    x=eval(prompt('x값 입력',0));
    y=eval(prompt('y값 입력',0));

    btnPrint.value = x+y;
    };
    });