import java.util.ArrayList;
import java.util.Scanner;

public class ThuVien {

    // Thông tin một cuốn sách
    static class Sach {
        String ma;
        String ten;
        int soLuong;
        double gia;

        Sach(String ma, String ten, int soLuong, double gia) {
            this.ma = ma;
            this.ten = ten;
            this.soLuong = soLuong;
            this.gia = gia;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> danhSach = new ArrayList<>();

    // ---------- Hàm hỗ trợ: đọc số nguyên, lặp đến khi nhập đúng ----------
    static int docSoNguyen(String thongBao, int min) {
        while (true) {
            System.out.print(thongBao);
            try {
                int so = Integer.parseInt(sc.nextLine().trim());
                if (so >= min) {
                    return so;
                }
                System.out.println("  Giá trị phải >= " + min + ", nhập lại!");
            } catch (NumberFormatException e) {
                System.out.println("  Vui lòng nhập một số nguyên!");
            }
        }
    }

    // ---------- Hàm hỗ trợ: đọc số thực, lặp đến khi nhập đúng ----------
    static double docSoThuc(String thongBao, double min) {
        while (true) {
            System.out.print(thongBao);
            try {
                double so = Double.parseDouble(sc.nextLine().trim());
                if (so >= min) {
                    return so;
                }
                System.out.println("  Giá trị phải >= " + min + ", nhập lại!");
            } catch (NumberFormatException e) {
                System.out.println("  Vui lòng nhập một số!");
            }
        }
    }

    // ---------- Kiểm tra mã sách đã tồn tại chưa ----------
    static boolean daTonTai(String ma) {
        for (Sach s : danhSach) {
            if (s.ma.equalsIgnoreCase(ma)) {
                return true;
            }
        }
        return false;
    }

    // ---------- BÀI 1: Nhập n sách bằng vòng lặp ----------
    static void nhapDanhSach() {
        int n = docSoNguyen("Nhập số lượng sách cần nhập (n > 0): ", 1);

        for (int i = 1; i <= n; i++) {
            System.out.println("--- Sách thứ " + i + " ---");

            String ma;
            do {
                System.out.print("Mã sách: ");
                ma = sc.nextLine().trim();
                if (ma.isEmpty()) {
                    System.out.println("  Mã sách không được để trống!");
                } else if (daTonTai(ma)) {
                    System.out.println("  Mã sách đã tồn tại, nhập mã khác!");
                }
            } while (ma.isEmpty() || daTonTai(ma));

            System.out.print("Tên sách: ");
            String ten = sc.nextLine().trim();

            int soLuong = docSoNguyen("Số lượng: ", 0);
            double gia = docSoThuc("Đơn giá: ", 0);

            danhSach.add(new Sach(ma, ten, soLuong, gia));
        }
        System.out.println("Đã nhập xong " + n + " sách.");
    }

    // ---------- Hiển thị danh sách ----------
    static void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách đang trống, hãy nhập sách trước (chọn 1).");
            return;
        }
        System.out.printf("%-4s %-10s %-25s %-10s %-12s%n",
                "STT", "Mã", "Tên sách", "Số lượng", "Đơn giá");
        for (int i = 0; i < danhSach.size(); i++) {
            Sach s = danhSach.get(i);
            System.out.printf("%-4d %-10s %-25s %-10d %-12.0f%n",
                    i + 1, s.ma, s.ten, s.soLuong, s.gia);
        }
    }

    // ---------- BÀI 2: Tổng số lượng và tổng giá trị ----------
    static void tinhTong() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách đang trống, hãy nhập sách trước (chọn 1).");
            return;
        }
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (Sach s : danhSach) {
            tongSoLuong += s.soLuong;
            tongGiaTri += s.soLuong * s.gia;   // giá trị = số lượng x đơn giá
        }
        System.out.println("Tổng số lượng sách : " + tongSoLuong);
        System.out.printf("Tổng giá trị sách  : %,.0f đồng%n", tongGiaTri);
    }

    // ---------- BÀI 4: Tìm sách theo mã ----------
    static void timTheoMa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sách đang trống, hãy nhập sách trước (chọn 1).");
            return;
        }
        System.out.print("Nhập mã sách cần tìm: ");
        String ma = sc.nextLine().trim();

        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            Sach s = danhSach.get(i);
            if (s.ma.equalsIgnoreCase(ma)) {
                System.out.println("Tìm thấy ở vị trí " + (i + 1) + ":");
                System.out.println("  Mã     : " + s.ma);
                System.out.println("  Tên    : " + s.ten);
                System.out.println("  Số lượng: " + s.soLuong);
                System.out.printf("  Đơn giá : %,.0f đồng%n", s.gia);
                timThay = true;
                break;                       // tìm thấy thì dừng vòng lặp
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy sách có mã \"" + ma + "\".");
        }
    }

    // ---------- BÀI 3: Menu lặp đến khi chọn Thoát ----------
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println();
            System.out.println("========== QUẢN LÝ THƯ VIỆN ==========");
            System.out.println("1. Nhập danh sách n sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tính tổng số lượng và tổng giá trị");
            System.out.println("4. Tìm sách theo mã");
            System.out.println("0. Thoát");
            System.out.println("======================================");
            chon = docSoNguyen("Chọn chức năng: ", 0);

            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    tinhTong();
                    break;
                case 4:
                    timTheoMa();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        } while (chon != 0);

        sc.close();
    }
}
