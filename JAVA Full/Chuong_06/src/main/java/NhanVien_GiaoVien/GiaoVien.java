/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;

import NgayThang.Ngay;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class GiaoVien extends NguoiLaoDong{
    private int tien1GioVuot;
    private int soGioVuot;

    public GiaoVien() {
    }

    public GiaoVien(int tien1GioVuot, int soGioVuot, LocalDate ngayVaoLam,  String hoTen, LocalDate ngaySinh, int heSoLuong) {
        super(hoTen, ngaySinh, heSoLuong,ngayVaoLam);
        this.tien1GioVuot = tien1GioVuot;
        this.soGioVuot = soGioVuot;
    }

    public int getTien1GioVuot() {
        return tien1GioVuot;
    }

    public void setTien1GioVuot(int tien1GioVuot) {
        this.tien1GioVuot = tien1GioVuot;
    }

    public int getSoGioVuot() {
        return soGioVuot;
    }

    public void setSoGioVuot(int soGioVuot) {
        this.soGioVuot = soGioVuot;
    }


    @Override
    public void XuatThongTin() {
        super.XuatThongTin(); 
        LocalDate date = LocalDate.now();
        int thamnien =date.getYear() - this.ngayVaoLam.getYear();
        System.out.println("tham nien:"+thamnien+"thu nhap :"+thunhap());
    }

    @Override
    public float thunhap() {
        int thunhap = this.luongCoSo * this.heSoLuong + this.soGioVuot * this.tien1GioVuot;
        LocalDate date = LocalDate.now();
        int thamnien =(int)(this.ngayVaoLam.until(date,ChronoUnit.YEARS));
        thunhap += (this.luongCoSo * this.heSoLuong)*(thamnien/100);
        return thunhap;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner s = new Scanner(System.in);
        System.out.print("nhap so gio vuot");
        this.soGioVuot = s.nextInt();
        System.out.print("nhap tien vuot trong 1 gio:");
        this.tien1GioVuot = s.nextInt();
    }
}
