window.addEventListener("load", function(){  //addEventListener : 여러개 이벤트등록하는 방법
    notices = [
        {"id":5, "title":"가입인사2", "content":"안녕하세요1", "writer":"김택선"},
        {"id":6, "title":"가입인사3", "content":"안녕하세요2", "writer":"정슬기"}
    ];




    let section = document.querySelector("#section1");
    let noticeList = section.querySelector(".notice-list")
    // let cloneButton = section.querySelector(".clone-button");
    // let inputButton = section.querySelector(".input-button");
    let temButton = section.querySelector(".temp-button");
    let tbodyNode = section.querySelector("tbody");


    temButton.onclick = function(){
        let tempNode = section.querySelector("template");
        let cloneNode = document.importNode(tempNode.content, true);
        //importNode는 tempNode를 활성화하는 역할을 함.
        //tempNode의 content만 활성화하므로 첫인자에 tempNode.content가 필요함. 
        //true이므로 하위 모두 복제
        let tdsNode = cloneNode.querySelectorAll("td");
        console.log(tdsNode);

        tdsNode[0].textContent = notices[0].id;
        tdsNode[1].textContent = notices[0].title;
        tdsNode[2].textContent = notices[0].content;
        tdsNode[3].textContent = notices[0].writer;

        tbodyNode.appendChild(cloneNode);
    };

    // cloneButton.onclick = function(){
    //     let trNode = noticeList.querySelector("tbody tr");
    //     //tbody tr을 포함하는 자손 모두 가져옴.
    //     let cloneNode = trNode.cloneNode(true);
    //     //cloneNode(true)이면 자손 모두 카피(tr이하 모두 카피), false이면 최상위노드만 카피
    //     //false이면 tbody>tr만 카피될 것 같음(td생략됨.)
    //     // console.log(cloneNode);
    //     // console.log(trNode);

    //     tbodyNode.appendChild(cloneNode);
    // };

    // inputButton.onclick = function(){
    //     let trNode = noticeList.querySelector("tbody tr");
    //     let cloneNode = trNode.cloneNode(true);
    //     tbodyNode.appendChild(cloneNode);
    //     //copy해서 붙여넣음.

    //     let tdsNode = cloneNode.querySelectorAll("td");
    //     console.log(tdsNode);

    //     tdsNode[0].textContent = notices[0].id;
    //     tdsNode[1].textContent = notices[0].title;
    //     tdsNode[2].textContent = notices[0].content;
    //     tdsNode[3].textContent = notices[0].writer;
    // };

});