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
public class GVThinhGiang extends GiangVien{
    private int tienLuongGioThoaThuan;

    public int getTienLuongGioThoaThuan() {
        return tienLuongGioThoaThuan;
    }

    public void setTienLuongGioThoaThuan(int tienLuongGioThoaThuan) {
        this.tienLuongGioThoaThuan = tienLuongGioThoaThuan;
    }

    public GVThinhGiang(int tienLuongGioThoaThuan, String hoTen, Ngay ngaySinh, int soGioGiangDayTrongThang) {
        super(hoTen, ngaySinh, soGioGiangDayTrongThang);
        this.tienLuongGioThoaThuan = tienLuongGioThoaThuan;
    }
    public GVThinhGiang() {

    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("thu nhap :"+thunhap());
    }
    @Override
    public int thunhap() {
        return this.soGioGiangDayTrongThang *this.tienLuongGioThoaThuan;
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner s = new Scanner(System.in);
        System.out.print("nhap tien Luong Gio Thoa Thuan ");
        this.tienLuongGioThoaThuan = s.nextInt();
    }


}
