/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapkethua;

import NgayThang.Ngay;

/**
 *
 * @author Dell
 */
public class NhanVienNC extends NhanVien{
    private int luongNgay;
    private int soNgayLV;

    public NhanVienNC(String maNV, String hoTen, Ngay ngaySinh ,int luongNgay, int soNgayLV, int thuong) {
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
    @Override
    public int tinhLuong() {
        return this.luongNgay + this.soNgayLV +this.thuong;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("Thu nhap: "+this.tinhLuong());
    }
    
}
