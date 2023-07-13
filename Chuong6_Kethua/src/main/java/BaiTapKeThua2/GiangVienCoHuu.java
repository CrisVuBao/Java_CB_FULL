/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua2;

public class GiangVienCoHuu extends GiangVien{
    private int soGioDayTrongThang;
    private int tienLuongTT;

    public GiangVienCoHuu(String hoTen, Ngay ngaySinh, int soGio, int soGioDayTrongThang, int tienLuongTT ) {
        super(hoTen, ngaySinh, soGio);
        this.soGioDayTrongThang = soGioDayTrongThang;
        this.tienLuongTT = tienLuongTT;
    }

    public int getSoGioDayTrongThang() {
        return soGioDayTrongThang;
    }

    public void setSoGioDayTrongThang(int soGioDayTrongThang) {
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    public int getTienLuongTT() {
        return tienLuongTT;
    }

    public void setTienLuongTT(int tienLuongTT) {
        this.tienLuongTT = tienLuongTT;
    }

    @Override
    public String getHoTen() {
        return hoTen;
    }

    @Override
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public int getSoGio() {
        return soGio;
    }

    @Override
    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("thu nhap co huu: " + tinhThuNhap());
    }
    
    @Override
    public int tinhThuNhap() {
        return this.tienLuongTT + (Math.max(0,(this.soGioDayTrongThang - this.soGio) * 150000));
    }
    
    
}
