function tinh_tong() {
    var n1 = parseInt(prompt("Nhap so dau tien :  "));
	var n2 = parseInt(prompt("Nhap so thu 2 :  "));
	
	if(n1 < 0 ){
		n1 = Math.abs(n1) ;
	}
	if(n2 < 0){
		n2 = Math.abs(n2);
	}
	tong =  n1 + n2;
	var text_tong = "Tong cua phan 2 so " + n1 +  " va " + n2 +  " la :  " + tong ;
	var text = "Hai so la : " + n1 + " , " + n2 ;
	document.getElementById("array").innerHTML = text;
	document.getElementById("tong").innerHTML = text_tong;
	
}