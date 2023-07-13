/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocSinh_thuoc_tinh_override;


public class HocSinhCap1 extends HocSinh{
    private double diemToan;
    private double diemVan;

    public HocSinhCap1(double diemToan, double diemVan, String maHS, String tenHS, String phai) {
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

    @Override
    public double tinhTrungBinh() {
        return (this.diemToan + this.diemVan) / 2;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("DiemTB: " + this.tinhTrungBinh() + "xep loai: " + this.xepLoai());
    }
    
    
}
