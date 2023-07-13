/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua2;

public abstract class GiangVien {
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int soGio;

    public GiangVien() {
    }
    
    public GiangVien(String hoTen, Ngay ngaySinh, int soGio) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soGio = soGio;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
    
    
    
    public void xuatThongTin() {
        System.out.println("ho ten: " + this.hoTen + "Ngay sinh: " + this.ngaySinh + "so gio: " + this.soGio);
    };
    public abstract int tinhThuNhap();
}
