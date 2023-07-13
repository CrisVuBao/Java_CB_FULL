/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua3;
import java.util.Scanner;
public abstract class QLLaoDong {
    // Field
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int thuNhap;

    // Constructor

    public QLLaoDong() {
    }
    
    public QLLaoDong(String hoTen, Ngay ngaySinh, int thuNhap) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thuNhap = thuNhap;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(int thuNhap) {
        this.thuNhap = thuNhap;
    }
    
    // Method
    public void NhapThongTin() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: " + this.hoTen);
        this.hoTen = s.next();
        System.out.print("Nhap ngay: ");
        this.ngaySinh.setDay(s.nextInt());
        System.out.print("Nhap thang: ");
        this.ngaySinh.setMonth(s.nextInt());
        System.out.print("Nhap nam: ");
        this.ngaySinh.setYear(s.nextInt());
    }
    
    public abstract int tinhSoLuong();
}
