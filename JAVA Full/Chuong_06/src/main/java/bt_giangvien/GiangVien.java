/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_giangvien;

import NgayThang.Ngay;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public abstract class GiangVien implements Comparable<GiangVien>{
    protected String hoTen;
    protected NgayThang.Ngay ngaySinh;
    protected int soGioGiangDayTrongThang;

    public GiangVien() {
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

    public int getSoGioGiangDayTrongThang() {
        return soGioGiangDayTrongThang;
    }

    public void setSoGioGiangDayTrongThang(int soGioGiangDayTrongThang) {
        this.soGioGiangDayTrongThang = soGioGiangDayTrongThang;
    }

    public GiangVien(String hoTen, Ngay ngaySinh, int soGioGiangDayTrongThang) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soGioGiangDayTrongThang = soGioGiangDayTrongThang;
    }
    public  void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("nha ho ten:");
        this.hoTen = s.nextLine();
        System.out.print("nha ngay sinh:");
        int ngay = s.nextInt();
        System.out.print("nha thang sinh:");
        int thang = s.nextInt();   
        System.out.print("nha nam sinh:");
        int nam = s.nextInt(); 
        this.ngaySinh = new Ngay(ngay, thang, nam);
        System.out.print("nhap so gio day trong thang:");
        this.soGioGiangDayTrongThang = s.nextInt();
    }
    public void xuatThongTin(){
        System.out.println("Thong tin: Ho ten: " +this.hoTen +" - ngay sinh: "+ this.ngaySinh.getDay() +"/" + this.ngaySinh.getMonth() +"/"+this.ngaySinh.getYear() );
    }
    public abstract int thunhap();
    @Override
    public  int compareTo(GiangVien nv){
        return this.getHoTen().compareTo(nv.getHoTen());
    }
}
