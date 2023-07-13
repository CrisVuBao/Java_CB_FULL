
package javacb.c21th2.chuong4;
import java.util.Scanner;
public class DuongTron {
    // Biến thành phần
    double bk;
    Diem tam;
    
    // Hàm thành phần
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        this.bk = s.nextDouble();
        System.out.println("nhap toa do cho tam: ");
        this.tam = new Diem();
        this.tam.nhap();
    }
    public void xuat() {
        System.out.printf("\n duong tron co tam O(%.2f, %.2f) \n", this.tam.x, this.tam.y);
    }
    
    public double tinhChuVi() {
        return 2 * 3.14 * this.bk;
    }
    
    public double tinhDienTich() {
        return 3.14 * this.bk * this.bk;
    }
}
