/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocSinhAbstract;

public class HocSinhCap2TT extends HocSinhTruuTuong{
     private double diemToan;
    private double diemVan;
    private double diemLy;
    private double diemHoa;


    public HocSinhCap2TT(double diemToan, double diemVan, double diemLy, double diemHoa, String maHS, String tenHS, String phai) {
        super(maHS, tenHS, phai);
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
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
    public void inThongTin() {
        super.inThongTin();
        System.out.println("DiemTB: " + this.tinhTrungBinh() + "xep loai: " + this.xepLoai());
    }
    
    @Override
    public String xepLoai() {
        String kq = "";
        if(this.tinhTrungBinh() <= 10) {
            kq =  "Xuat sac";
        }
        else if(this.tinhTrungBinh() > 8) {
            kq = "Gioi";
        }
        else if(this.tinhTrungBinh() > 6) {
            kq = "Kha";
        }
        else if(this.tinhTrungBinh() > 5) {
            kq = "Trung binh";
        }
        
        return kq;
    }

    @Override
    public double tinhTrungBinh() {
        return (this.diemToan + this.diemVan) / 2;
    }

    
    
}
