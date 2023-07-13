/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3_ArrayListt_dahinh;
import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String hoTen;
    protected Ngay ngaySinh;
    protected Ngay ngayVaoLam;
    protected double heSoLong;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, float heSoLong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.heSoLong = heSoLong;
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

    public Ngay getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Ngay ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public double getHeSoLong() {
        return heSoLong;
    }

    public void setHeSoLong(double heSoLong) {
        this.heSoLong = heSoLong;
    }
    
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.println("*Moi ban nhap thong tin sau: ");
        System.out.print("\t+ Ho ten: ");
        this.hoTen = s.nextLine();
        
        System.out.print("\t+ Nhap ngay sinh: ");
        int ngayS = s.nextInt();
        System.out.print("\t+ Nhap thang sinh: ");
        int thangS = s.nextInt();
        System.out.print("\t+ Nhap nam sinh: ");
        int namS = s.nextInt();
        this.ngaySinh = new Ngay(ngayS, thangS, namS);
        
        System.out.print("\t+ Nhap ngay vao lam: ");
        int ngayVL = s.nextInt();
        System.out.print("\t+ Nhap thang vao lam: ");
        int thangVL = s.nextInt();
        System.out.print("\t+ Nhap nam vao lam: ");
        int namVL = s.nextInt();
        this.ngaySinh = new Ngay(ngayVL, thangVL, namVL);
        
        System.out.print("\t+ He so luong: ");
        this.heSoLong = s.nextDouble();
    }
    
    public void xuatThongTin(){
        System.out.print("Ho ten: " + this.hoTen + " - Ngay sinh: " + this.ngaySinh);
    }
    
    public abstract double tinhThuNhap();
    
    
}
