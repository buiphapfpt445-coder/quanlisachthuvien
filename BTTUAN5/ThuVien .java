import java.util.ArrayList;
import java.util.Scanner;

public class ThuVien {
    static Scanner sc = new Scanner(System.in);

    // Mỗi phần tử là một cuốn sách, dạng: mã;tên;số lượng;đơn giá
    static ArrayList<String> danhSachSach = new ArrayList<>();

    // Tìm vị trí của sách theo mã, không có thì trả về -1
    static int timViTri(String ma) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] t = danhSachSach.get(i).split(";");
            if (t[0].equals(ma)) {
                return i;
            }
        }
        return -1;
    }

    static void themSach() {
        System.out.print("Mã sách: ");
        String ma = sc.nextLine();
        if (timViTri(ma) != -1) {
            System.out.println("Mã sách đã tồn tại!");
            return;
        }
        System.out.print("Tên sách: ");
        String ten = sc.nextLine();
        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Đơn giá: ");
        double gia = Double.parseDouble(sc.nextLine());

        danhSachSach.add(ma + ";" + ten + ";" + soLuong + ";" + gia);
        System.out.println("Đã thêm sách.");
    }

    static void hienThiSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] t = danhSachSach.get(i).split(";");
            System.out.println((i + 1) + ". Mã: " + t[0] + " | Tên: " + t[1]
                    + " | Số lượng: " + t[2] + " | Giá: " + t[3]);
        }
    }

    static void timSach() {
        System.out.print("Nhập mã sách cần tìm: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Không tìm thấy sách.");
        } else {
            String[] t = danhSachSach.get(vt).split(";");
            System.out.println("Mã: " + t[0] + " | Tên: " + t[1]
                    + " | Số lượng: " + t[2] + " | Giá: " + t[3]);
        }
    }

    static void xoaSach() {
        System.out.print("Nhập mã sách cần xóa: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Không tìm thấy sách.");
        } else {
            danhSachSach.remove(vt);
            System.out.println("Đã xóa sách.");
        }
    }

    static void suaSach() {
        System.out.print("Nhập mã sách cần sửa: ");
        String ma = sc.nextLine();
        int vt = timViTri(ma);
        if (vt == -1) {
            System.out.println("Không tìm thấy sách.");
            return;
        }
        System.out.print("Tên mới: ");
        String ten = sc.nextLine();
        System.out.print("Số lượng mới: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Đơn giá mới: ");
        double gia = Double.parseDouble(sc.nextLine());

        danhSachSach.set(vt, ma + ";" + ten + ";" + soLuong + ";" + gia);
        System.out.println("Đã sửa sách.");
    }

    static void tinhTongSoLuong() {
        int tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] t = danhSachSach.get(i).split(";");
            tong += Integer.parseInt(t[2]);
        }
        System.out.println("Tổng số lượng: " + tong);
    }

    static void tinhTongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] t = danhSachSach.get(i).split(";");
            tong += Integer.parseInt(t[2]) * Double.parseDouble(t[3]);
        }
        System.out.printf("Tổng giá trị: %.0f đồng%n", tong);
    }

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: themSach(); break;
                case 2: hienThiSach(); break;
                case 3: timSach(); break;
                case 4: xoaSach(); break;
                case 5: suaSach(); break;
                case 6: tinhTongSoLuong(); break;
                case 7: tinhTongGiaTri(); break;
                case 8: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Chọn sai, nhập lại!");
            }
        } while (chon != 8);
    }
}
