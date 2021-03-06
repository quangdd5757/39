﻿##Bài tập tuần 9
﻿(link dowload báo cáo: https://onedrive.live.com/redir?resid=B844D2C243CCF096!12346&authkey=!APLOeRsDxSBcq54&ithint=folder%2cdocx )
### 1. Giới thiệu kỹ thuật inspection trong kiểm thử phần mềm
Inspection mã nguồn là một dạng của kiểm tra/kiểm thử phần mềm. Đó là tiến trình dò tìm lỗi tiềm ẩn bên trong mã nguồn phần mềm sau khi mã nguồn đã hết lỗi cú pháp và trước khi mã nguồn được biên dịch thành chương trình thực thi. Tiến trình thanh tra được các công ty phần mềm áp dụng và linh động tùy theo điều kiện của mình. Trong thực tế, mỗi nhóm thanh tra mã nguồn khoảng 4 – 6 người. Thời gian cho mỗi lần họp nhóm không quá 2 giờ. Thông thường, báo cáo lỗi của nhóm thanh tra được xem là tốt nếu có trên 70% mà tác giả của nó bắt buộc phải sửa (tức là lỗi thực sự mà tác giả của mã nguồn phải công nhận). Nếu đọc mã nguồn thủ công thì trung bình mỗi thanh tra viên có thể đọc khoảng 120 dòng mã nguồn mỗi giờ. Mỗi buổi họp nhóm (khoảng 2 giờ) có thể duyệt qua được tối đa khoảng 1200 dòng mã nguồn.
### 2. Các loại lỗi cần thanh tra
Lỗi trong mã nguồn rất đa dạng, năng suất phát hiện lỗi tùy thuộc nhiều vào kỹ năng phân tích mã nguồn của các thanh tra viên. Lỗi cần thanh tra được phân chia thành từng nhóm tương ứng với đặc điểm của đối tượng lập trình. Gồm các nhóm lỗi cơ bản sau:
#### 2.1. Lỗi cấu trúc:
Các lỗi liên quan đến cấu trúc code, các thành phần có đúng như convention, có dúng như design.
•	Code có thực thực hiên hoàn toàn và chính xác theo thiết kế?
•	Code có tuân theo chuẩn đã đặt ra hay không?
•	Code có phần nào gọi các thủ tục không cần thiết hay những đoạn unreachable code?
•	Tất cả các đoạn code lặp có được đưa vào cùng một thủ tục hay chưa? 
#### 2.2. Lỗi tài liệu:
•	Code có rõ ràng và đầy đủ comment, cùng một cấu trúc đễ dàng để maintain
•	Tất cả các comment có phù hợp với code?
#### 2.3. Lỗi dữ liệu:
Các lỗi liên quan đến xử lý dữ liệu và kiểu dữ liệu.
•	Tính toán trên các biến không phải kiểu số?
•	Tính toán kiểu dữ liệu hỗn hợp?
•	Tính toán trên các biến có độ dài khác nhau?
•	Vùng nhớ có kích thước nhỏ hơn giá trị gán?
•	Kết quả tức thời tràn bộ nhớ?
•	Lỗi chia 0?
•	Trình biên dịch ngầm hiểu các biểu thức logic không?
#### 2.4. Lỗi cấu trúc điều khiển:
Các lỗi liên quan đến các lệnh cấu trúc điều khiển
•	Rẽ nhiều nhánh có vượt qua?
•	Mỗi vòng lặp dừng hay không?
•	Chương trình dừng hay không?
•	Vòng lặp có bị bỏ qua vì điều kiện đầu vào?
•	Vòng lặp có thể bỏ qua có chính xác không?
#### 2.5. Lỗi nhập xuất:
Các lỗi liên quan đến các xử lý tệp, nhập, xuất dữ liệu
•	Các thuộc tính tệp tin chính xác không?
•	Các câu lệnh mở tệp tin chính xác không?
•	Các chỉ định định dạng phù hợp với câu lệnh nhập, xuất?
•	Các điều kiện kết thúc tệp tin được xử lý?
•	Kiểm tra tính hợp lệ cho các đầu vào?
#### 2.6. Lỗi giao tiếp giữa các hàm, thủ tục:
Các lỗi liên quan đến định nghĩa và sử dụng hàm
•	Số các đối số được truyền tới mô-đun gọi bằng số tham số?
•	Hệ thống đơn vị của các đối số được truyền tới các mô-đun gọi bằng hệ thống đơn vị của các tham số?
•	Thuộc tính, thứ tự và số các tham số trong các hàm xây dựng sẵn là chính xác?
•	Tham chiếu tới các tham số không phù hợp với điểm vào hiện tại?
•	Các định nghĩa biến toàn cục phù hợp khi dùng trong các mô-đun?
•	Các hằng số truyền như các đối số?
#### 2.7. Lỗi sử dụng bộ nhớ:
Các lỗi liên quan đến xử lý bộ nhớ
•	Lỗi tham chiếu rỗng?
•	Các thuộc tính lưu trữ chính xác?
•	Các biến đã được khai báo?
•	Sự khởi tạo phù hợp với các lớp lưu trữ?
•	Các biến có tên giống nhau?

### 3. Thực hành trên mã nguồn thật.
Review trên hai source code: 
#### 3.1.

Mã nguồn: https://github.com/quangdd5757/39/blob/master/source%20code/Password.java

Lỗi cấu trúc:
•	Nên đặt một hàm có chức năng cụ thể chứ không nên đặt code trong hàm main()
•	Tên biến chưa đặt theo chuẩn, vừa tiếng Anh vừa tiếng Việt.
Lỗi tài liệu:
•	Comment còn thiếu.
Lỗi dữ liệu:
Lỗi cấu trúc điều khiển:
Lỗi nhập xuất:
•	Chưa có kiểm tra dữ liệu khi nhập vào.
Lỗi giao tiếp giữa các hàm, thủ tục:
Lỗi sử dụng bộ nhớ:
#### 3.2.

Mã nguồn: https://github.com/quangdd5757/39/blob/master/up%20code%2011-11/kt%20so%20nguyen%20to.cpp

Lỗi cấu trúc: 
•	Dòng 16 còn có code thừa
•	Nên để hàm main() gọi một phương thức kiểm tra và in ra số nguyên tố chứ không nên để trong hàm main()
Lỗi tài liệu:
•	Trong code còn thiếu comment.
Lỗi dữ liệu:
Lỗi cấu trúc điều khiển:
Lỗi nhập xuất:
Lỗi giao tiếp giữa các hàm, thủ tục:
Lỗi sử dụng bộ nhớ:
