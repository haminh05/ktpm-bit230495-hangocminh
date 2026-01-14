Hà Ngọc Minh - BIT230495

BÀI THỰC HÀNH SỐ 1: 
<img width="1892" height="972" alt="image" src="https://github.com/user-attachments/assets/2cbfde29-771f-4be0-8d25-4bcd15961743" />


BÀI THỰC HÀNH SỐ 2: Student Analyzer – Unit Test with JUnit
## Mô tả
Chương trình phân tích điểm số học sinh, bao gồm:
- Đếm số học sinh đạt loại Giỏi (>= 8.0)
- Tính điểm trung bình các điểm hợp lệ (0–10)
- Ràng buộc: Các điểm không hợp lệ (<0 hoặc >10) sẽ bị loại bỏ.

## Công nghệ sử dụng
- Java
- JUnit 5

## Cấu trúc thư mục
unit-test/
├── src/
│ └── StudentAnalyzer.java
└── test/
└── StudentAnalyzerTest.java

## Các kịch bản kiểm thử (Test Cases)
Chương trình bao phủ các trường hợp sau:
- Normal Case: Danh sách có đầy đủ điểm hợp lệ và không hợp lệ.
- Boundary Case: Kiểm tra các giá trị biên như $0.0$, $8.0$, $10.0$.
- Empty Case: Xử lý danh sách rỗng (trả về 0).
- Invalid Case: Danh sách chỉ chứa toàn điểm lỗi (ngoài khoảng 0-10).

## Cách chạy kiểm thử
- Mở project bằng IDE (IntelliJ / Eclipse / NetBeans)
- Chạy file `StudentAnalyzerTest`
- Hoặc dùng Maven/Gradle nếu có cấu hình
<img width="1919" height="1023" alt="image" src="https://github.com/user-attachments/assets/d2a881b2-7215-4069-b2e8-9f93e8bb3d89" />



