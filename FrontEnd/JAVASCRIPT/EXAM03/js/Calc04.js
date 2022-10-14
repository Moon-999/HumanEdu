window.addEventListener("load",function(){
    let btnPrint = document.getElementById("add");
    btnPrint.onclick = function(){
        let section = document.getElementById("section1");
        let input_x = section.querySelector("#txt1");  //id로 설정했을 때는 x,y 따로 설정해줌.
        let input_y = section.querySelector("#txt2");
        
        // console.log(input);
        // console.log(input[0]);

        let x,y;
        x=parseInt(input_x.value);
        y=parseInt(input_y.value);
        sum.value = x+y;
        //=> input[3].value = x+y; / 두개는 같은의미.
    };
});