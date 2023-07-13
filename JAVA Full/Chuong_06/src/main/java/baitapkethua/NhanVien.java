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
public abstract class NhanVien implements Comparable<NhanVien> {
    protected String maNV;
    protected String hoTen;
    protected NgayThang.Ngay ngaySinh;
    protected int thuong;

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

    public NhanVien(String maNV, String hoTen, Ngay ngaySinh, int thuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.thuong = thuong;
    }
    public void xuatThongTin(){
        System.out.println("Thong tin: maNV: " +this.maNV +" - ho ten: "+ this.hoTen);
    }
    public abstract int tinhLuong();
    
    @Override
    public  int compareTo(NhanVien nv){
        return this.returnTen().compareTo(nv.returnTen());
    }
    public String returnTen() {
        int lastKhoangTrang = this.hoTen.lastIndexOf(" ");
        String ten = this.hoTen.substring(lastKhoangTrang + 1);
        return ten;
    }
}
