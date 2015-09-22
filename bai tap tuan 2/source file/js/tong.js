
	function tinh_tong() {
		var x, text;
		var tong = 0;
		x = document.getElementById("input").value;
		if (isNaN(x) || x < 1 ) {
			text = "nhap khong hop le ! ";
		} else {
			for(var i = 0 ; i <= x ; i ++){
			   tong += i;
			}
			text = "Tong la : " + tong;
		}
		document.getElementById("output").innerHTML = text;
	}