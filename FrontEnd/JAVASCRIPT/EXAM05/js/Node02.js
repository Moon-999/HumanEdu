window.addEventListener("load", function(){
    let section = this.document.querySelector("#section1");
    let noticeList = section.querySelector(".notice-list");
    let delButton = section.querySelector(".del-button");
    let swapButton = section.querySelector(".swap-button");
    let tbodyNode = section.querySelector("tbody");

    let allCheckBox = section.querySelector(".overall-checkbox");

    allCheckBox.onchange = function(){   //onchange => 내용변경 감지.
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']");
        //inputs[0]~[2] => 하단의 체크박스
        console.log(inputs);
        console.log(allCheckBox.checked);
        for(let i=0; i<inputs.length; i++){
            inputs[i].checked = allCheckBox.checked; //allCheckBox의 checked는 true,false값을 갖는다.
            //allCheckBox.checked가 true이면 input[i].checked도 true로 결과가 대입됨.

        }
    };

    delButton.onclick = function(){
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']:checked");
        //체크가 된 input태그 
        for(let i=0; i<inputs.length; i++){
            inputs[i].parentElement.parentElement.remove();
            //input 태그의 부모<td>의 부모<tr>을 전체 지우는 것.
        }
    };

    swapButton.onclick = function(){
        let inputs = tbodyNode.querySelectorAll("input[type='checkbox']:checked");
        //체크가 된 input태그
        if(inputs.length != 2){
            alert("2개만 선택해주세요");
            return;
        }
        let trs=[];
        for(let i=0; i<inputs.length; i++){
            trs.push(inputs[i].parentElement.parentElement);
            //inputs => input 태그
            //inputs[i].parentElement => td태그
            //inputs[i].parentElement.parentElement => tr태그
            //trs.push함수는 tr 태그를 자손까지 모두 카페해서 trs에 반영.
        }
        let cloneNode = trs[0].cloneNode(true); //true는 자손까지 모두 선택 후 카피
        trs[1].replaceWith(cloneNode);
        trs[0].replaceWith(trs[1]);
        
    }

    
});