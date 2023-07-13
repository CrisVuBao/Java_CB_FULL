/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinh {
    private String MaHS;
    private String tenHocSinh;
    private LopHoc lop;
    private double diemToan;
    private double diemVan;
    private NgaySinh ngaySinh;

    public String getMaHS() {
        return MaHS;
    }

    public void setMaHS(String MaHS) {
        this.MaHS = MaHS;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
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

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public HocSinh(String MaHS, String tenHocSinh, LopHoc lop, double diemToan, double diemVan, NgaySinh ngaySinh) {
        this.MaHS = MaHS;
        this.tenHocSinh = tenHocSinh;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.ngaySinh = ngaySinh;
    }

    public  void xuatTenKhoa(){
        System.out.println("Khoa hoc sinh dang hoc la :" + this.lop.getKhoa().getTenKhoa());
    }
    private float tinhDiemTB(){
        return (float)(diemToan *2 + diemVan)/3;
    }
    private String tinhXepLoai(){
        float dem =tinhDiemTB();
        if (dem >=9) {
            return "Xuac sac";
        }if(dem >=8 ){
            return "Gioi";
        }if(dem >=6.5){
            return "Kha";
        }if(dem >=5 ){
            return "Trung binh";
        }
        return "Yeu";
    }
    public void xuatTrungBinh(){
        System.out.printf("diem trung binh cua hoc sinh %s la : %f \n",this.tenHocSinh, tinhDiemTB());
    }
    public void xuatXepLoai(){
        System.out.printf("xep loai cua hoc sinh %s la : %s \n",this.tenHocSinh, tinhXepLoai());
    }
    public boolean kiemTraNgaySinhGiongNhau(HocSinh hs2){
        return this.ngaySinh.equals(hs2.ngaySinh);
    }
}
