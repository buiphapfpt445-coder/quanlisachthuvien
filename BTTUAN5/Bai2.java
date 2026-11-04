import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> dsMaSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n1. Thêm mã sách");
            System.out.println("2. Hiển thị mã sách");
            System.out.println("3. Tìm mã sách");
            System.out.println("4. Xóa mã sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            if (chon == 1) {
                System.out.print("Nhập mã sách: ");
                String ma = sc.nextLine();
                dsMaSach.add(ma);
                System.out.println("Đã thêm.");
            } else if (chon == 2) {
                if (dsMaSach.isEmpty()) {
                    System.out.println("Danh sách trống.");
                }
                for (int i = 0; i < dsMaSach.size(); i++) {
                    System.out.println((i + 1) + ". " + dsMaSach.get(i));
                }
            } else if (chon == 3) {
                System.out.print("Nhập mã cần tìm: ");
                String ma = sc.nextLine();
                if (dsMaSach.contains(ma)) {
                    System.out.println("Tìm thấy ở vị trí " + (dsMaSach.indexOf(ma) + 1));
                } else {
                    System.out.println("Không tìm thấy.");
                }
            } else if (chon == 4) {
                System.out.print("Nhập mã cần xóa: ");
                String ma = sc.nextLine();
                if (dsMaSach.remove(ma)) {
                    System.out.println("Đã xóa.");
                } else {
                    System.out.println("Không tìm thấy.");
                }
            }
        } while (chon != 0);
    }
}
