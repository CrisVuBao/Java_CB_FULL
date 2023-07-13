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
public class NhanVienQL extends NhanVien{

    private int luongCoBan;
    private int phuCapCV;

    public NhanVienQL(String maNV, String hoTen, Ngay ngaySinh,int luongCoBan, int phuCapCV,  int thuong) {
        super(maNV, hoTen, ngaySinh, thuong);
        this.luongCoBan = luongCoBan;
        this.phuCapCV = phuCapCV;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(int phuCapCV) {
        this.phuCapCV = phuCapCV;
    }
    @Override
    public int tinhLuong() {
        return this.luongCoBan + this.phuCapCV +this.thuong;
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("-Thu nhap: "+ this.tinhLuong());
    }
    
    
}
