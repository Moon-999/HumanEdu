window.addEventListener("load",function(){
    let btnPrint = document.getElementById("add");
    btnPrint.onclick = function(){
        let section = document.getElementById("section1");
        let input = section.querySelectorAll(".txt");  //class일때는 querySelectorAll로 바꾸고 한번에 설정.
        
        
        // console.log(input);
        // console.log(input[0]);

        let x,y;
        x=parseInt(input[0].value);
        y=parseInt(input[1].value);
        sum.value = x+y;
        //=> input[3].value = x+y; / 두개는 같은의미.
    };
});