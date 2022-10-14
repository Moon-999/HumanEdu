window.addEventListener("load", function(){
    let section = document.querySelector("#section1");
   
    let imgList = section.querySelector(".src-input");  //datalist는 독립적이지 않아서 #img-list대입 불가.
    let changeButton = section.querySelector(".change-button");
    let img = section.querySelector(".img");

    changeButton.onclick = function(){
        
        img.src="./img/" +imgList.value + ".jpg";
      
    }
});