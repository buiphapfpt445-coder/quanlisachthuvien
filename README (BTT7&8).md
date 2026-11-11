# Quản lý sách trong thư viện (Java)

Repository nộp bài thực hành môn Lập trình Java. Chương trình xây dựng lớp `Sach` và quản lý danh sách sách bằng `ArrayList`.

## Cấu trúc thư mục

| Thư mục | Nội dung |
|---|---|
| `BTTUAN7` | Bài thực hành tuần 7: lớp `Sach`, phương thức hiển thị, lớp `Test`, `ArrayList` |
| `BTTUAN8` | Bài thực hành tuần 8: đóng gói dữ liệu (`private`, getter/setter, kiểm tra dữ liệu, constructor) |

Mỗi thư mục gồm 2 file: `Sach.java` và `Test.java`.

## Tuần 7: Xây dựng lớp Sach

- Lớp `Sach` có các thuộc tính: `maSach`, `tieuDe`, `tacGia` (String), `namXuatBan`, `soLuong` (int).
- Phương thức `hienThiThongTin()` in ra đầy đủ thông tin của một cuốn sách.
- Lớp `Test` tạo đối tượng từ lớp `Sach`.
- Tạo và quản lý danh sách sách bằng `ArrayList<Sach>`: thêm, hiển thị, tìm theo mã, xóa theo mã.

## Tuần 8: Đóng gói dữ liệu

Phát triển tiếp từ code tuần 7:

- Tất cả thuộc tính của lớp `Sach` khai báo `private`.
- Cung cấp đầy đủ `public getters` và `setters` cho các thuộc tính.
- Kiểm tra dữ liệu trong setter:
  - `setNamXuatBan`: năm phải lớn hơn 0 và không lớn hơn năm hiện tại.
  - `setSoLuong`: số lượng không được âm.
- Thêm constructor có đầy đủ tham số để khởi tạo tất cả thuộc tính khi tạo đối tượng.

## Cách chạy

Yêu cầu: đã cài JDK 17 trở lên.

```bash
cd BTTUAN8
javac -encoding UTF-8 Sach.java Test.java
java Test
```

Chạy bài tuần 7 tương tự, thay `BTTUAN8` bằng `BTTUAN7`.

## Tác giả

Bùi Tá Pháp
