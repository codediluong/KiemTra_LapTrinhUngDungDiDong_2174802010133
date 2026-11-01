# BÀI KIỂM TRA THỰC HÀNH — CÂU 2

- Họ tên: **Từ Thiệu Lương**
- MSSV: **2174802010133**
- Branch: **`cau-2`**

## Nội dung thực hiện
Màn hình đăng nhập viết bằng Kotlin + ConstraintLayout XML; sử dụng `findViewById`, `Patterns.EMAIL_ADDRESS`, kiểm tra trống và mật khẩu tối thiểu 6 ký tự. Không dùng ViewBinding.

## Minh chứng Câu 1 (kế thừa)
**Dữ liệu lỗi (ví dụ email `abc`, mật khẩu `123`):**

![Validation Error](screenshots/cau1_validation_error.png)

**Dữ liệu hợp lệ (ví dụ `demo@example.com` và `123456`):**

![Validation Success](screenshots/cau1_validation_success.png)

## Minh chứng Câu 2
Nhập email và mật khẩu hợp lệ, nhấn Đăng nhập để mở ProfileActivity
![Profile Intent](screenshots/cau2_profile_intent.png)
