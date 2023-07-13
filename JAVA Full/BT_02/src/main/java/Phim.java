/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Phim {
    private String tenPhim;
    private int namSanXuat;
    private nhaSanXuat nhaSX;
    private int giaVe;
    private Ngay ngayChieu;

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public nhaSanXuat getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(nhaSanXuat nhaSX) {
        this.nhaSX = nhaSX;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public Phim(String tenPhim, int namSanXuat, nhaSanXuat nhaSX,int giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.nhaSX = nhaSX;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }
    
    public void xuatTenHangPhim(){
        System.out.println("Ten hang phim san xuat:"+ this.nhaSX.getTenHangPhim());
    }
    public double tinhGiaBanSauKhuyenMai(double x){
        return (1-x/100)*this.giaVe;
    }
    public boolean xuatGiaReHon(Phim p2){
        if(this.giaVe < p2.giaVe){
            return true;
        }
        return false;
    }
    public boolean kiemTraNgayChieuGiongNhau(Phim p2){
        
        return this.ngayChieu.equals(p2.ngayChieu);
    }
}
