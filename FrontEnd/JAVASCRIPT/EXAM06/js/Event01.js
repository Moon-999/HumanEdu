window.addEventListener("load", function(){
    let section = this.document.querySelector("#section1");
    let imgs = section.querySelectorAll(".imgs");
    let currentImg = section.querySelector(".current-img");

    imgs[0].onclick = function(e){   //e(event)라는 기능을 가져오는것.
        currentImg.src=e.target.src;
    };
    imgs[1].onclick = function(e){   //e라는 기능을 가져오는것.
        currentImg.src=e.target.src;
    };
    imgs[2].onclick = function(e){   //e라는 기능을 가져오는것.
        currentImg.src=e.target.src;
    };
    // for(let i=0; i<imgs.length; i++){
    //     imgs[i].onclick=function(e){
    //         currentImg.src=e.target.src;
    //     }
        
    // }  => 위에 메서드랑 같은 의미.

    
});