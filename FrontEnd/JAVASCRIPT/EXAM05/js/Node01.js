window.addEventListener("load", function(){
    let section = this.document.querySelector("#section1");
    let noticeList = section.querySelector(".notice-list");
    let upButton = section.querySelector(".up-button");
    let downButton = section.querySelector(".down-button");

    let tbodyNode = section.querySelector("tbody");
    let currentNode = tbodyNode.firstElementChild;
    //tr 첫번째가 선택됨.

    upButton.onclick = function(){
        let previousNode = currentNode.previousElementSibling;
        if(previousNode == null){
            alert("더이상 이동 불가");
            return;
        }
        tbodyNode.insertBefore(currentNode, previousNode);
        //insertBefore(이동대상, 기준점)
        //이는 이동대상을 기준점 앞으로 복사하고, 본인 자신은 지움.
        //이동대상을 기준점 앞으로 이동.
    };
    downButton.onclick = function(){
        let nextNode = currentNode.nextElementSibling; //현재기준의 동생을 찾는것.
        if(nextNode == null){
            //가장 마지막 위치
            alert("더이상 이동 불가");
            return;
        }
        tbodyNode.insertBefore(nextNode, currentNode);
    };
});