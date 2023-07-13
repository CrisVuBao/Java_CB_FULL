
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinhCap1TT extends HocSinhTT{
    private double diemToan;
    private double diemVan;

    public HocSinhCap1TT( String maHS, String tenHS, String phai,double diemToan, double diemVan,int tuoi) {
        super(maHS, tenHS, phai,tuoi);
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

 
    @Override
    public double tinhTrungBinh() {
        return (this.diemToan+this.diemVan)/2;
    }

    @Override
    public String xepLoai() {
        return this.tinhTrungBinh()>=5 ?"Dat":"khong dat";
    }
    @Override
    public void inHocSinh() {
        super.inHocSinh(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Diem trung binh "+this.tinhTrungBinh()+"- Xep loai:" +this.xepLoai());
    }
   
}
