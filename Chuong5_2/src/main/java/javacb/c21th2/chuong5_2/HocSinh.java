/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_2;

public class HocSinh {
    
    double diemTB;
    // Field
    private String MaHS, tenHocSinh;
    private LopHoc lop;
    private double diemToan, diemVan;
    private Ngay ngaySinh;
    
    // Constructor

    public HocSinh(String MaHS, String tenHocSinh, LopHoc lop, double diemToan, double diemVan, Ngay ngaySinh) {
        this.MaHS = MaHS;
        this.tenHocSinh = tenHocSinh;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.ngaySinh = ngaySinh;
    }
    
    //Getter, Setter

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

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public String xuatTenKhoa() {
        return this.lop.getKhoa().getTenKhoa();
    }
    
    private double tinhDiemTB() {
        diemTB = ((this.diemToan * 2)+this.diemVan) / 3;
        return diemTB;
    }
    
    private String tinhXepLoai() {
        String kq = "";
        if (diemTB <= 9) {
            kq = "Xuat sac";
        }
        else if(diemTB >= 8) {
            kq = "Gioi";
        }
        else if(diemTB >= 6.5) {
            kq = "kha";
        }
        else if(diemTB >=5) {
            kq = "trung binh";
        }
        else if(diemTB < 5) {
            kq = "yeu";
        }
        return kq;
    }
    
    public double tinhTrungBinh() {
        return tinhDiemTB();
    }
    
    public String tinhXepLoaiHS(){
        return tinhXepLoai(); 
    }
    
    public boolean kiemTraNgaySinhGiongNhau(HocSinh hs2) {
        return this.ngaySinh.equals(hs2.ngaySinh);
    }
    
}
