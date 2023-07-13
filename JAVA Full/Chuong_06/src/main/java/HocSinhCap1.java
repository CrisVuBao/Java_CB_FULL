/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
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

    @Override
    public String xepLoai() {
        return this.tinhTrungBinh()>=5 ?"Dat":"khong dat";
    }

    @Override
    public double tinhTrungBinh() {
        return (this.diemToan+this.diemVan)/2; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Diem trung binh "+this.tinhTrungBinh()+"- Xep loai:" +this.xepLoai());
    }
    
}
