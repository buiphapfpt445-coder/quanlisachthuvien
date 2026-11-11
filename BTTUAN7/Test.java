import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng từ lớp Sach
        Sach sach1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn An", 2020, 10);
        System.out.println("Thông tin cuốn sách 1:");
        sach1.hienThiThongTin();

        // Tạo danh sách sách bằng ArrayList
        ArrayList<Sach> danhSach = new ArrayList<>();

        // Thêm sách vào danh sách
        danhSach.add(sach1);
        danhSach.add(new Sach("S02", "Cơ sở dữ liệu", "Trần Thị Bình", 2019, 5));
        danhSach.add(new Sach("S03", "Thiết kế web", "Lê Minh Cường", 2021, 8));

        // Hiển thị danh sách
        System.out.println("\nDanh sách sách trong thư viện:");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("--- Sách " + (i + 1) + " ---");
            danhSach.get(i).hienThiThongTin();
        }

        // Tìm sách theo mã
        String maCanTim = "S02";
        System.out.println("\nTìm sách có mã " + maCanTim + ":");
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).maSach.equals(maCanTim)) {
                danhSach.get(i).hienThiThongTin();
                timThay = true;
            }
        }
        if (timThay == false) {
            System.out.println("Không tìm thấy sách");
        }

        // Xóa sách theo mã
        String maCanXoa = "S03";
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).maSach.equals(maCanXoa)) {
                danhSach.remove(i);
                System.out.println("\nĐã xóa sách có mã " + maCanXoa);
                break;
            }
        }
        System.out.println("Số sách còn lại: " + danhSach.size());
    }
}
