/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Sach {
    private String tenSach;
    private double donGia;
    private int namXuatBan;
    private tacGia nguoiViet;

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public tacGia getNguoiViet() {
        return nguoiViet;
    }

    public void setNguoiViet(tacGia nguoiViet) {
        this.nguoiViet = nguoiViet;
    }

    public Sach(String tenSach, double donGia, int namXuatBan, tacGia nguoiViet) {
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.namXuatBan = namXuatBan;
        this.nguoiViet = nguoiViet;
    }
    
    public void xuatTenSach(){
        System.out.println("Sach co ten:"+ this.tenSach);
    }
    public double xuatGiaBanSauGiam(double x){
        return (1-x/100)*this.donGia;
    }
    public boolean xuatCungNamXuatBan(Sach s2){
        if(this.namXuatBan == s2.namXuatBan){
            return true;
        }
        return false;
    }
}
