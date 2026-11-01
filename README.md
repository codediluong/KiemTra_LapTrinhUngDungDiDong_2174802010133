# BÀI KIỂM TRA THỰC HÀNH — CÂU 3

- Họ tên: **Từ Thiệu Lương**
- MSSV: **2174802010133**
- Branch: **`cau-3`**

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

## Minh chứng Câu 3
Đăng nhập hợp lệ, kiểm tra danh sách môn học trong ProfileActivity, sau đó nhấn một mục để hiện Toast.

**ListView:**

![ListView Display](screenshots/cau3_listview_display.png)

**Toast sau khi chọn một môn học:**

![Item Click Toast](screenshots/cau3_item_click_toast.png)
