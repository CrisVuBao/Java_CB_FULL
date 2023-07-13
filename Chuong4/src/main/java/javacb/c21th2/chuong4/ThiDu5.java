
package javacb.c21th2.chuong4;

/*
    Nhập thông tin học sinh; hoTen, diemVan, diemToan
    * Tính và xuất thoogn tin học sinh với diemTB và xepLoai
*/
public class ThiDu5 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        System.out.println("'Nhap thong tin");
        hs.nhapHocSinh();
        hs.xuatHocSinh();
    }
}
