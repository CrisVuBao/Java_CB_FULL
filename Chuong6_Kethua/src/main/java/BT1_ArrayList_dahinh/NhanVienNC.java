/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_ArrayList_dahinh;

import BaiTapKeThua.*;

public class NhanVienNC extends NhanVien{
    private int luongNgay;
    private int soNgayLV;

    public NhanVienNC(String maNV, String hoTen, Ngay ngaySinh, int thuong, int luongNgay, int soNgayLV) {
        super(maNV, hoTen, ngaySinh, thuong);
        this.luongNgay = luongNgay;
        this.soNgayLV = soNgayLV;
    }

    public int getLuongNgay() {
        return luongNgay;
    }

    public void setLuongNgay(int luongNgay) {
        this.luongNgay = luongNgay;
    }

    public int getSoNgayLV() {
        return soNgayLV;
    }

    public void setSoNgayLV(int soNgayLV) {
        this.soNgayLV = soNgayLV;
    }
    
    
    
    
    // Method
    
    @Override
    public void xuatThongTin() {
         super.xuatThongTin();
         System.out.println(" - Thu nhap: " + this.tinhLuong());
    }
    
    @Override
    public int tinhLuong() {
        return (this.luongNgay * this.soNgayLV) + this.thuong;
    }
    
    
}
