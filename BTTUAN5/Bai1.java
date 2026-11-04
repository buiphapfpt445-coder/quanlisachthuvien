import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] soLuong = new int[5];

        // Nhập số lượng 5 cuốn sách
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập số lượng cuốn sách thứ " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        // Hiển thị số lượng
        System.out.println("Số lượng các cuốn sách:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cuốn " + (i + 1) + ": " + soLuong[i]);
        }

        // Tính tổng
        int tong = 0;
        for (int i = 0; i < 5; i++) {
            tong += soLuong[i];
        }
        System.out.println("Tổng số lượng: " + tong);

        // Tìm số lượng lớn nhất
        int max = soLuong[0];
        for (int i = 1; i < 5; i++) {
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Số lượng lớn nhất: " + max);
    }
}
