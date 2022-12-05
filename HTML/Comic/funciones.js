function anterior(){
    var i = document.getElementById("imagen");
    var inum= i.src.toString().replace(".jpeg", "").slice(-1);
    
    if(inum>1){
        i.src=i.src.toString().replace(inum+".jpeg", parseInt(inum)-1+".jpeg");
    }
    console.log(i.src);
}

function siguiente(anime){
    var i = document.getElementById("imagen");
    var inum= i.src.toString().replace(".jpeg", "").slice(-1);
    
    if(inum<9){
        i.src=i.src.toString().replace(inum+".jpeg", parseInt(inum)+1+".jpeg");
    }
    console.log(i.src);
}