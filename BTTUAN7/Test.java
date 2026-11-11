import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng bằng constructor đầy đủ tham số
        Sach sach1 = new Sach("S01", "Lập trình Java", "Nguyễn Văn An", 2020, 10);
        System.out.println("Thông tin cuốn sách 1:");
        sach1.hienThiThongTin();

        // Dùng getter để lấy thông tin
        System.out.println("\nTiêu đề lấy bằng getter: " + sach1.getTieuDe());

        // Dùng setter với giá trị hợp lệ
        sach1.setSoLuong(15);
        sach1.setNamXuatBan(2021);
        System.out.println("Sau khi sửa: số lượng = " + sach1.getSoLuong()
                + ", năm xuất bản = " + sach1.getNamXuatBan());

        // Dùng setter với giá trị không hợp lệ (bị từ chối, giữ nguyên giá trị cũ)
        System.out.println("\nThử nhập dữ liệu sai:");
        sach1.setSoLuong(-5);
        sach1.setNamXuatBan(3000);
        System.out.println("Giá trị vẫn là: số lượng = " + sach1.getSoLuong()
                + ", năm xuất bản = " + sach1.getNamXuatBan());

        // Tạo danh sách sách bằng ArrayList
        ArrayList<Sach> danhSach = new ArrayList<>();
        danhSach.add(sach1);
        danhSach.add(new Sach("S02", "Cơ sở dữ liệu", "Trần Thị Bình", 2019, 5));
        danhSach.add(new Sach("S03", "Thiết kế web", "Lê Minh Cường", 2022, 8));

        // Hiển thị danh sách
        System.out.println("\nDanh sách sách trong thư viện:");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("--- Sách " + (i + 1) + " ---");
            danhSach.get(i).hienThiThongTin();
        }

        // Tìm sách theo mã (dùng getter vì thuộc tính đã là private)
        String maCanTim = "S02";
        System.out.println("\nTìm sách có mã " + maCanTim + ":");
        boolean timThay = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equals(maCanTim)) {
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
            if (danhSach.get(i).getMaSach().equals(maCanXoa)) {
                danhSach.remove(i);
                System.out.println("\nĐã xóa sách có mã " + maCanXoa);
                break;
            }
        }
        System.out.println("Số sách còn lại: " + danhSach.size());
    }
}
