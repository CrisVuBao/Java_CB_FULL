/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong4;
import java.util.Scanner;
/**
 *
 * @author Cris_VuBao
 */
public class HocSinh {
    // Biến thành phần (field - trường) not thuộc tính
    String hoTen;
    float diemVan, diemToan;

    
    // Hàm thành phần (method - phương thức)
    public void nhapHocSinh() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap ho ten: ");
        this.hoTen = s.nextLine();
        System.out.print("nhap diem toan: ");
        this.diemToan = s.nextFloat();
        System.out.print("nhap diem van: ");
        this.diemVan = s.nextFloat();
    }
    
    private double tinhTrungBinh() {
        return (this.diemVan + this.diemToan) / 2;
    }
    
    private String tinhXepLoai() {
        String kq = "";
        double dtb = tinhTrungBinh();
        if(dtb >= 9) {
            kq = "Xuat sac";
        }
        else if(dtb >= 8) {
            kq = "Gioi";
        }
        else if(dtb >= 7) {
            kq = "Kha";
        }
        else if(dtb >= 5) {
            kq = "Trung binh";
        }
        else {
            kq = "yeu";
        }
        
        return kq;
    }
    
    public void xuatHocSinh() {
        System.out.println("Thong tin hoc sinh ");
        System.out.printf("\n hoc sinh: %s - Diem trung binh: %.2f - Xep loai: %s\n", this.hoTen, this.tinhTrungBinh(), this.tinhXepLoai()); // %s là in số kiểu double, float

    }
}
