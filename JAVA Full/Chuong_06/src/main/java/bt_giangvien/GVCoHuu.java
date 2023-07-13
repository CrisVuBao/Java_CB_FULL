/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_giangvien;

import NgayThang.Ngay;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class GVCoHuu extends GiangVien{
    private int mucLuongThoaThua;
    private int soGioQuyDinhTrongThang;

    public GVCoHuu() {
    }

    public int getMucLuongThoaThua() {
        return mucLuongThoaThua;
    }

    public void setMucLuongThoaThua(int mucLuongThoaThua) {
        this.mucLuongThoaThua = mucLuongThoaThua;
    }

    public int getSoGioQuyDinhTrongThang() {
        return soGioQuyDinhTrongThang;
    }

    public void setSoGioQuyDinhTrongThang(int soGioQuyDinhTrongThang) {
        this.soGioQuyDinhTrongThang = soGioQuyDinhTrongThang;
    }
    public GVCoHuu(int mucLuongThoaThua, int soGioQuyDinhTrongThang, String hoTen, Ngay ngaySinh, int soGioGiangDayTrongThang) {
        super(hoTen, ngaySinh, soGioGiangDayTrongThang);
        this.mucLuongThoaThua = mucLuongThoaThua;
        this.soGioQuyDinhTrongThang = soGioQuyDinhTrongThang;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("thu nhap :"+this.thunhap());
    }
    @Override
    public int thunhap() {
        return this.mucLuongThoaThua + Math.max(0,(this.soGioGiangDayTrongThang - this.soGioQuyDinhTrongThang)*150000);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner s = new Scanner(System.in);
        System.out.print("nhap muc Luong Thoa Thuan ");
        this.mucLuongThoaThua = s.nextInt();
        System.out.print("nhap so gio quy dinh:");
        this.soGioQuyDinhTrongThang = s.nextInt();
    }


}
