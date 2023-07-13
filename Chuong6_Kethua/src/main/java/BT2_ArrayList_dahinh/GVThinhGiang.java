/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2_ArrayList_dahinh;

import BaiTapKeThua2.*;

public class GVThinhGiang extends GiangVien{
    // Field
    private int mucLuong;

    public GVThinhGiang(String hoTen, Ngay ngaySinh, int soGio, int mucLuong) {
        super(hoTen, ngaySinh, soGio);
        this.mucLuong = mucLuong;
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public int getSoGio() {
        return soGio;
    }

    @Override
    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }
    
    
    
    // Method
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("luong NV thinh giang: " + this.tinhThuNhap());
    }
    
    @Override
    public int tinhThuNhap() {
        return this.mucLuong * this.soGio;
    }
}
