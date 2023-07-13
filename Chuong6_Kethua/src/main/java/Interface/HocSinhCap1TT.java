/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import HocSinhAbstract.*;

public class HocSinhCap1TT extends HocSinhTruuTuong implements IHocSinh{
        private double diemToan;
    private double diemVan;

    public HocSinhCap1TT(double diemToan, double diemVan, String maHS, String tenHS, String phai) {
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

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }
    
    
    // Method

    @Override
    public String xepLoai() {
        return this.tinhTrungBinh() >= 5 ? "dat" : "chua dat";
    }

    @Override //tinhTrungBinh sẽ Override IHocSinh để kế thừa method tinhTrungBinh theo cách Interface
    public double tinhTrungBinh() {
        return (this.diemToan + this.diemVan) / 2;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("DiemTB: " + this.tinhTrungBinh() + "xep loai: " + this.xepLoai());
    }
    
}
