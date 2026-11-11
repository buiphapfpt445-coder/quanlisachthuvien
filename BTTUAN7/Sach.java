import java.time.Year;

public class Sach {
    // Yêu cầu 1: các thuộc tính khai báo private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Yêu cầu 4: constructor có đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);   // gọi setter để kiểm tra dữ liệu
        setSoLuong(soLuong);
    }

    // Yêu cầu 2: getters và setters
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    // Yêu cầu 3: năm xuất bản phải > 0 và không lớn hơn năm hiện tại
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Năm xuất bản không hợp lệ: " + namXuatBan);
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    // Yêu cầu 3: số lượng không được âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Số lượng không hợp lệ: " + soLuong);
        }
    }

    // In thông tin của một cuốn sách ra màn hình
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
    }
}
