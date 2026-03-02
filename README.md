## Hà Ngọc Minh - BIT230495

## BÀI THỰC HÀNH SỐ 1: Can't see
Hoạt động
Trải nghiệm trò chơi trực tuyến Can't Unsee để rèn luyện khả năng quan sát, phân tích chi tiết thiết kế giao diện phần mềm (UI) và trải nghiệm người dùng (UX). Qua đó, nhận biết các lỗi thiết kế phổ biến về khoảng cách (spacing), font chữ, căn chỉnh (alignment) và màu sắc.

Mục tiêu
- Nâng cao tư duy về chất lượng phần mềm từ góc độ giao diện.
- Biết cách phân biệt các yếu tố thiết kế chuẩn (Best practices) và lỗi thiết kế.
  
Kết quả đạt được
<img width="1892" height="972" alt="image" src="https://github.com/user-attachments/assets/2cbfde29-771f-4be0-8d25-4bcd15961743" />


## BÀI THỰC HÀNH SỐ 2: Student Analyzer – Unit Test with JUnit
Mô tả
Chương trình phân tích điểm số học sinh, bao gồm:
- Đếm số học sinh đạt loại Giỏi (>= 8.0)
- Tính điểm trung bình các điểm hợp lệ (0–10)
- Ràng buộc: Các điểm không hợp lệ (<0 hoặc >10) sẽ bị loại bỏ.

Công nghệ sử dụng
- Java
- JUnit 5

Cấu trúc thư mục    
unit-test/   
├── src/   
│ └── StudentAnalyzer.java   
└── test/   
└── StudentAnalyzerTest.java   

Các kịch bản kiểm thử (Test Cases)
Chương trình bao phủ các trường hợp sau:
- Normal Case: Danh sách có đầy đủ điểm hợp lệ và không hợp lệ.
- Boundary Case: Kiểm tra các giá trị biên như $0.0$, $8.0$, $10.0$.
- Empty Case: Xử lý danh sách rỗng (trả về 0).
- Invalid Case: Danh sách chỉ chứa toàn điểm lỗi (ngoài khoảng 0-10).

Cách chạy kiểm thử
- Mở project bằng IDE (IntelliJ / Eclipse / NetBeans)
- Chạy file `StudentAnalyzerTest`
- Hoặc dùng Maven/Gradle nếu có cấu hình
<img width="1919" height="1023" alt="image" src="https://github.com/user-attachments/assets/d2a881b2-7215-4069-b2e8-9f93e8bb3d89" />


### Bài thực hành số 3: Kiểm thử tự động bằng Cypress     
1. Mục tiêu bài thực hành      
- Làm quen với Cypress – công cụ kiểm thử tự động cho ứng dụng web.     
- Viết và thực thi các test case tự động cho website bán hàng.     
- Kiểm tra các chức năng cơ bản:      
  +	Đăng nhập hệ thống     
  +	Thêm sản phẩm vào giỏ hàng    
  +	Sắp xếp sản phẩm theo giá    
  + Xóa sản phẩm khỏi giỏ hàng    
  +	Tiến hành checkout    
    
2. Môi trường và công cụ sử dụng    
-	Website kiểm thử: https://www.saucedemo.com    
-	Ngôn ngữ: JavaScript    
-	Framework: Cypress    
-	Trình duyệt: Google Chrome    
-	Hệ điều hành: Windows     
   
3. Nội dung thực hành     
3.1. Mô tả website kiểm thử    
- Website SauceDemo là một trang web mô phỏng hệ thống bán hàng trực tuyến, cho phép người dùng:     
•	Đăng nhập    
•	Xem danh sách sản phẩm    
•	Thêm/xóa sản phẩm trong giỏ hàng   
•	Thực hiện quy trình thanh toán    
- Website thường được sử dụng để thực hành kiểm thử phần mềm.   
  
3.2. Các test case được xây dựng     
Test case 1: Đăng nhập với tài khoản hợp lệ (Valid Login)     
•	Truy cập website https://www.saucedemo.com    
•	Nhập username hợp lệ: standard_user     
•	Nhập password hợp lệ: secret_sauce     
•	Nhấn nút Login    
Kết quả mong đợi:     
•	Người dùng đăng nhập thành công     
•	Chuyển sang trang danh sách sản phẩm (/inventory.html)    
Kết quả:
<img width="1009" height="535" alt="image" src="https://github.com/user-attachments/assets/6d2e5f91-30e8-4b8c-b636-410aedd011ce" />

Test case 2: Đăng nhập với tài khoản không hợp lệ (Invalid Login)    
•	Truy cập website https://www.saucedemo.com    
•	Nhập username không hợp lệ     
•	Nhập password không hợp lệ     
•	Nhấn nút Login    
Kết quả mong đợi:        
•	Hệ thống hiển thị thông báo lỗi    
•	Người dùng không được chuyển sang trang sản phẩm    
Kết quả:
<img width="1009" height="536" alt="image" src="https://github.com/user-attachments/assets/1aa43e20-6f84-46e8-b777-b41e0eddfac2" />

Test case 3: Thêm sản phẩm vào giỏ hàng     
•	Đăng nhập với tài khoản hợp lệ    
•	Thêm sản phẩm đầu tiên vào giỏ hàng    
•	Kiểm tra số lượng sản phẩm trong giỏ    
Kết quả mong đợi:    
•	Biểu tượng giỏ hàng hiển thị số 1    
Kết quả:    
<img width="1009" height="537" alt="image" src="https://github.com/user-attachments/assets/d7e906c9-e540-471a-b487-a46500f0985b" />
   
Test case 4: Sắp xếp sản phẩm theo giá tăng dần    
•	Đăng nhập với tài khoản hợp lệ     
•	Chọn chế độ sắp xếp Price (low to high)    
•	Kiểm tra giá của sản phẩm đầu tiên    
Kết quả mong đợi:    
•	Sản phẩm có giá thấp nhất hiển thị đầu tiên    
Kết quả:
<img width="1009" height="536" alt="image" src="https://github.com/user-attachments/assets/ce89a8ab-73c5-4e1e-a60c-b813a5702af5" />

Test case 5: Xóa sản phẩm khỏi giỏ hàng      
•	Đăng nhập với tài khoản hợp lệ     
•	Thêm sản phẩm vào giỏ hàng     
•	Thực hiện xóa sản phẩm    
•	Kiểm tra biểu tượng giỏ hàng     
Kết quả mong đợi:    
•	Giỏ hàng không còn hiển thị số lượng sản phẩm    
Kết quả:
<img width="1009" height="536" alt="image" src="https://github.com/user-attachments/assets/2a4b88fd-c3ee-4472-99a7-6c2ce3b23c49" />

Test case 6: Thực hiện checkout đến bước 2    
•	Đăng nhập với tài khoản hợp lệ    
•	Thêm sản phẩm vào giỏ hàng    
•	Vào trang giỏ hàng    
•	Nhấn nút Checkout   
•	Điền đầy đủ thông tin khách hàng   
•	Chuyển sang bước thanh toán tiếp theo   
Kết quả mong đợi:   
•	URL chứa /checkout-step-two.html    
Kết quả:  
<img width="1009" height="537" alt="image" src="https://github.com/user-attachments/assets/83e8c302-1636-41ed-900e-b5cd7f06acf2" />
 
5. Kết quả thực hiện   
•	Các test case được chạy thành công bằng Cypress.   
•	Hệ thống phản hồi đúng với các hành động kiểm thử.   
•	Cypress hỗ trợ kiểm tra giao diện, hành vi người dùng và xác nhận kết quả một cách tự động.   
<img width="969" height="275" alt="image" src="https://github.com/user-attachments/assets/d519f1f0-0580-4b18-85cc-851f9d001b6d" />
<img width="959" height="439" alt="image" src="https://github.com/user-attachments/assets/142e8065-f843-4346-81bc-01780d70a81a" />

6. Nhận xét và đánh giá   
Ưu điểm   
•	Cypress dễ cài đặt và sử dụng  
•	Cú pháp đơn giản, dễ đọc
•	Chạy test nhanh, trực quan  
Hạn chế   
•	Chỉ hỗ trợ tốt cho frontend   
•	Phụ thuộc vào trình duyệt   

7. Kết luận   
Thông qua bài thực hành, sinh viên đã:  
•	Hiểu được cách xây dựng test case tự động  
•	Biết cách sử dụng Cypress để kiểm thử các chức năng cơ bản của website  
•	Nâng cao kỹ năng kiểm thử phần mềm và tự động hóa kiểm thử    

## BÀI THỰC HÀNH SỐ 4: JMETER – KIỂM THỬ HIỆU NĂNG                        
1. Mục tiêu                
• Làm quen với công cụ Apache JMeter                  
• Xây dựng các kịch bản kiểm thử tải (Load Testing)                            
• Đo lường các chỉ số:                              
  - Response Time                        
  - Throughput                  
  - Error Rate                          
• Phân tích khả năng chịu tải của hệ thống                              

2. Cấu hình kiểm thử: HTTP Request Defaults              
<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/953630f1-8905-4e0a-adf9-5a6b60be33b5" />

3. Các kịch bản kiểm thử                                      
3.1. Thread Group 1 – Basic Load                                          
• Mục tiêu: Mô phỏng tải nhẹ để kiểm tra phản hồi cơ bản của hệ thống.                                
• Hành vi: GET  /                                                
<img width="1919" height="1020" alt="image" src="https://github.com/user-attachments/assets/cce2a27c-7cf5-44ff-b362-2a92f6b207f2" />

3.2. Thread Group 2 – Heavy Load                                                                                  
• Mục tiêu: Mô phỏng nhiều người dùng truy cập đồng thời vào trang chủ và trang đăng nhập                                                                                                          
• Hành vi: GET /    , GET /login                                                                                                
<img width="1919" height="1018" alt="image" src="https://github.com/user-attachments/assets/b5c6fc7d-4bbc-4780-b026-0e7bfadfc5c9" />

3.3. Thread Group 3 – Custom Scenario                                                                        
• Mục tiêu: Mô phỏng hành vi người dùng liên tục trong thời gian xác định                                                                          
• Hành vi: GET /vacation.html , GET /reserve.php                                            
<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/c190f338-4003-4ec9-abdb-fc0b6c8eb90d" />

4. Kết quả kiểm thử
<img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/f5f71c8d-b941-4883-bdf2-f808845a2748" />

5. Phân tích kết quả                                        
Response Time                                                                
  - Khi số lượng người dùng tăng (Thread Group 2), thời gian phản hồi tăng.                                                                              
  - Điều này cho thấy hệ thống bị ảnh hưởng bởi tải cao.                                                  
Throughput                                          
  - Throughput tăng khi số lượng thread tăng.                                          
  - Hệ thống xử lý được nhiều request/giây hơn khi có nhiều người dùng.                                  
Error Rate                                          
  - Error % = 0%                                    
  - Không phát sinh lỗi 404 hoặc 500.                          
  - Hệ thống hoạt động ổn định trong phạm vi kiểm thử.                                

6. Nhận xét                        
• Website hoạt động ổn định dưới tải nhẹ và trung bình.                          
• Khi tải tăng cao, thời gian phản hồi tăng nhưng vẫn trong mức chấp nhận được.                            
• Không ghi nhận lỗi hệ thống.                                      

7. Kết luận                          
Qua bài thực hành, sinh viên đã:                          
• Hiểu cách xây dựng kịch bản kiểm thử tải bằng JMeter                                      
• Biết cấu hình Thread Group và HTTP Request                                      
• Biết thu thập và phân tích các chỉ số hiệu năng                                
• Đánh giá được khả năng chịu tải của hệ thống                                                  









