/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public abstract class NguoiLaoDong  implements Comparable<NguoiLaoDong>{
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected int heSoLuong;
    protected int luongCoSo = 1500000;
    protected LocalDate ngayVaoLam;

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public NguoiLaoDong() {
    }

    public int getLuongCoSo() {
        return luongCoSo;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public NguoiLaoDong(String hoTen, LocalDate ngaySinh, int heSoLuong,LocalDate ngayVaoLam) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
    }
    public  void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("nhap ho ten:");
        this.hoTen = s.nextLine();
        System.out.print("nhap ngay sinh:");
        String ns = s.nextLine();
        this.ngaySinh = LocalDate.parse(ns);
        System.out.print("nhap he so luong:");
        this.heSoLuong = s.nextInt();
        System.out.print("nhap ngay vao lam:");
        int ngaylam = s.nextInt();
        System.out.print("nhap thang vao lam:");
        int thanglam = s.nextInt();   
        System.out.print("nhap nam vao lam:");
        int namlam = s.nextInt();
        this.ngayVaoLam = LocalDate.of(namlam, thanglam, ngaylam);
    }
    public void XuatThongTin(){
        System.out.println("Thong tin nguoi lao dong - Ho ten :"+this.hoTen +" - ngay sinh: "+ this.ngaySinh);
    }
    public abstract float thunhap(); 
    @Override
    public  int compareTo(NguoiLaoDong LD){
        return this.returnTen().compareTo(LD.returnTen());
    }
    public static Comparator<NguoiLaoDong> comparaByHeSoLuong(){
        return Comparator.comparing(NguoiLaoDong::getHeSoLuong);
    }    
    public String returnTen() {
        int lastKhoangTrang = this.hoTen.lastIndexOf(" ");
        String ten = this.hoTen.substring(lastKhoangTrang + 1);
        return ten;
    }
}
