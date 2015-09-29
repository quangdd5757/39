
1. Group 39 gồm các thành viên:
----------------------------

  - Lê Văn Nguyên
  - Đỗ Hoàng Phúc
  - Nguyễn Như Phúc
  - Đỗ Đức Quang
  - Đặng Văn Sướng

2. Kết quả bài làm:
-------------

>   tính tổng trị tuyệt đối của 2 số bất kì

#### a. Mã chương trình
```js
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
```
#### b. Đồ thị
![dothi](<dothi.png?raw=true>)

3.Tìm một công cụ tạo đồ thị chương trình cho ngôn ngữ Javascript
-----------------------------------------------------------------

### a. Công cụ sử dụng:

visustin v7.10 [link](<http://www.aivosto.com/visustin.html>)

### b. Cách sử dụng:

-   Cài đặt visustin v7.10 rồi chạy

-   coppy code của hàm trên vào vùng code của phần mềm rồi nhấn Draw

-   đồ thị tương ứng hiện ra ở cùng bên phải

-   Hình minh họa
![dothi](<minhhoa.png?raw=true>)

4.Tạo ca kiểm thử theo tiêu chuẩn C1P
-------------------------------------

>Tương tự C1 nhưng các ca kiểm thử của C1P phải thực hiện mọi cặp điều kiện T, F
(True, False) cho các điểm điều kiện P1 và P2,...

#### Ta có các test case:

VD: Với code ở trên ta gọi:

 
Điểm  | Câu lệnh
------------- | -------------
P1  | ( n1 < 0 )
P2  | ( n2 < 0 )
 
#### Vậy ta có các ca kiểm thử:

Ca kiểm thử | Giá trị tương ứng
------------|--------
(P1, P2) | (T, T)
(P1, P2) | (T, F)
(P1, P2) | (F, T)
(P1, P2) | (F, F)

#### Cụ thể đầu vào lần lượt như sau:

Đầu vào | Đầu ra
--------|-------
(1, 2) | Expect value : 3
(1, -3) | Expect value : 4
(-2, 3) | Expect value :  5
(-2, -4) | Expect value: 6
(1.5, 1)| Expect value : 2
(a, 1) | Expect value : NaN ( không có kết quả)
