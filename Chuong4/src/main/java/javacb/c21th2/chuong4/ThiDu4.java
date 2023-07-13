
package javacb.c21th2.chuong4;

 /*
        TÍnh diện tích , chu vi của đường tròn
 */

public class ThiDu4 {
    
    public static void main(String[] args) {
        DuongTron dt = new DuongTron();
        System.out.println("nhap thong tin duong tron");
        dt.nhap();
        dt.xuat();
        System.out.println("chu vi cua duong tron: " + dt.tinhChuVi());
        System.out.println("dien tich cua duong tron: " + dt.tinhDienTich());
    }
}
