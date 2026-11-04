# Quản lý sách thư viện (Java)

Repository nộp bài thực hành môn Lập trình Java. Chương trình quản lý sách của một thư viện bằng dòng lệnh (console).

## Nội dung

Thư mục `BTTUAN5` chứa bài thực hành tuần 5. Sau đó bài được chỉnh sửa theo yêu cầu tuần 6 (xem lịch sử commit: **"Bài thực hành tuần 5"** và **"Bài thực hành tuần 6"**).

### Tuần 5: Câu lệnh lặp
- Nhập `n` cuốn sách bằng vòng lặp.
- Tính tổng số lượng và tổng giá trị sách.
- Menu lặp liên tục đến khi chọn **Thoát**.
- Tìm sách theo mã.

### Tuần 6: ArrayList
- `Bai1.java`: mảng `int[] soLuong` cho 5 cuốn sách; hiển thị, tính tổng, tìm số lượng lớn nhất.
- `Bai2.java`: `ArrayList<String>` lưu mã sách; thêm, hiển thị, tìm, xóa mã sách.
- `ThuVien.java`: `ArrayList<String> danhSachSach`, mỗi phần tử là thông tin một cuốn sách
  (định dạng `mã;tên;số lượng;đơn giá`), kèm menu hoàn chỉnh:
  1. Thêm sách
  2. Hiển thị sách
  3. Tìm sách
  4. Xóa sách
  5. Sửa sách
  6. Tính tổng số lượng
  7. Tính tổng giá trị
  8. Thoát

## Cách chạy

Yêu cầu: đã cài JDK 17 trở lên.

```bash
cd BTTUAN5
javac -encoding UTF-8 ThuVien.java
java ThuVien
```

Chạy các bài lẻ của tuần 6 tương tự:

```bash
javac -encoding UTF-8 Bai1.java
java Bai1
```

## Tác giả

Bùi Tá Pháp
