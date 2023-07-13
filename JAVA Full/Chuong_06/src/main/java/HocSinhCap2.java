/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinhCap2 extends HocSinh{

    public HocSinhCap2(double diemToan, double diemVan, double diemLy, double dieHoa, String maHS, String tenHS, String phai) {
        super(maHS, tenHS, phai);
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemLy = diemLy;
        this.dieHoa = dieHoa;
    }
    private double diemToan;
    private double diemVan;
    private double diemLy;
    private double dieHoa;

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

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDieHoa() {
        return dieHoa;
    }

    public void setDieHoa(double dieHoa) {
        this.dieHoa = dieHoa;
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
        return (this.diemToan+this.diemVan +this.diemLy +this.dieHoa)/4; 
    }

    @Override
    public void inThongTin() {
        System.out.println("- Diem trung binh "+this.tinhTrungBinh()+"- Xep loai:" +this.xepLoai());
    }

}
