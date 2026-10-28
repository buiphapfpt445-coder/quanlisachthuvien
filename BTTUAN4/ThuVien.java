package BTTUAN4;
import java.time.Year;
import java.util.Scanner;

public class ThuVien {
    public static void main(String[] args) {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        Scanner sc = new Scanner(System.in);

        // ===== NHẬP THÔNG TIN (giống tuần 3, thêm loại sách) =====
        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhập đơn giá (VNĐ): ");
        double donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        System.out.println("Chọn loại sách:");
        System.out.println("  1. Sách giáo khoa");
        System.out.println("  2. Sách tham khảo");
        System.out.println("  3. Sách chuyên ngành");
        System.out.println("  4. Sách khác");
        System.out.print("Nhập lựa chọn (1-4): ");
        int loai = sc.nextInt();

        // ===== BÀI 1: Kiểm tra dữ liệu hợp lệ =====
        int namHienTai = Year.now().getValue();
        boolean hopLe = true;

        System.out.println("\n===== KIỂM TRA DỮ LIỆU =====");
        if (donGia <= 0) {
            System.out.println("Lỗi: Đơn giá phải lớn hơn 0.");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("Lỗi: Số lượng phải lớn hơn hoặc bằng 0.");
            hopLe = false;
        }
        if (namXuatBan < 1900 || namXuatBan > namHienTai) {
            System.out.println("Lỗi: Năm xuất bản phải từ 1900 đến " + namHienTai + ".");
            hopLe = false;
        }

        if (!hopLe) {
            System.out.println("=> Sách KHÔNG hợp lệ. Chương trình dừng.");
            sc.close();
            return;
        }
        System.out.println("=> Sách hợp lệ.");

        // ===== BÀI 2: Phân loại giá =====
        String mucGia;
        if (donGia < 50000) {
            mucGia = "Sách giá thấp";
        } else if (donGia <= 100000) {
            mucGia = "Sách giá trung bình";
        } else if (donGia <= 200000) {
            mucGia = "Sách giá cao";
        } else {
            mucGia = "Sách giá đặc biệt";
        }

        // ===== BÀI 3: Phân loại tồn kho =====
        String tonKho;
        if (soLuong == 0) {
            tonKho = "Hết sách";
        } else if (soLuong <= 5) {
            tonKho = "Sắp hết";
        } else if (soLuong <= 20) {
            tonKho = "Còn ít";
        } else {
            tonKho = "Còn nhiều";
        }

        // ===== BÀI 4: Dùng switch chọn loại sách =====
        String tenLoai;
        switch (loai) {
            case 1:
                tenLoai = "Sách giáo khoa";
                break;
            case 2:
                tenLoai = "Sách tham khảo";
                break;
            case 3:
                tenLoai = "Sách chuyên ngành";
                break;
            case 4:
                tenLoai = "Sách khác";
                break;
            default:
                tenLoai = "Không xác định (lựa chọn không hợp lệ)";
        }

        // ===== TÍNH TIỀN (tuần 3) =====
        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // ===== HIỂN THỊ KẾT QUẢ =====
        System.out.println("\n===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách       : " + maSach);
        System.out.println("Tên sách      : " + tenSach);
        System.out.println("Tác giả       : " + tacGia);
        System.out.println("Năm xuất bản  : " + namXuatBan);
        System.out.printf("Đơn giá       : %,.0f VNĐ%n", donGia);
        System.out.println("Số lượng      : " + soLuong);

        System.out.println("\n===== PHÂN LOẠI =====");
        System.out.println("Mức giá       : " + mucGia);
        System.out.println("Tồn kho       : " + tonKho);
        System.out.println("Loại sách     : " + tenLoai);

        System.out.println("\n===== GIÁ TRỊ NHẬP KHO =====");
        System.out.printf("Thành tiền    : %,.0f VNĐ%n", thanhTien);
        System.out.printf("Phí vận chuyển: %,.0f VNĐ%n", phiVanChuyen);
        System.out.printf("Tổng tiền nhập: %,.0f VNĐ%n", tongTienNhap);

        sc.close();
    }
}