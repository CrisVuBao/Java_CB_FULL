/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsach;

import HocSinhAbstract.*;

public class HocSinhCap1TT extends HocSinhTruuTuong{
        private double diemToan;
    private double diemVan;

    public HocSinhCap1TT(String maHS, String tenHS, String phai,double diemToan, double diemVan) {
        super(maHS, tenHS, phai);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }


    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }
    
    
    // Method

    @Override
    public String xepLoai() {
        return this.tinhTrungBinh() >= 5 ? "dat" : "chua dat";
    }

    @Override
    public double tinhTrungBinh() {
        return (this.diemToan + this.diemVan) / 2;
    }

    @Override
    public void inHocSinh() {
        super.inHocSinh();
        System.out.println("DiemTB: " + this.tinhTrungBinh() + "xep loai: " + this.xepLoai());
    }
    
}
