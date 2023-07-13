/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_ArrayList_dahinh;

import BaiTapKeThua.*;

public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int thuong;

    public NhanVien(String maNV, String hoTen, Ngay ngaySinh, int thuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thuong = thuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
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

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }
    
    // Method
    public void xuatThongTin() {
        System.out.println("Thong tin: MaNV: " + this.maNV + " - Hoten: " + this.hoTen);
    }
    
    public abstract int tinhLuong();
}
