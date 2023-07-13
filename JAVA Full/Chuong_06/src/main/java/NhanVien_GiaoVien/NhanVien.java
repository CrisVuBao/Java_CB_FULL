/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;

import NgayThang.Ngay;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhanVien extends NguoiLaoDong{
    private String chuVu;
    private String loaiNhanVien;

    public NhanVien() {
    }

    public NhanVien(String chuVu, String loaiNhanVien, String hoTen, LocalDate ngaySinh,LocalDate ngayVaoLam, int heSoLuong) {
        super(hoTen, ngaySinh, heSoLuong,ngayVaoLam);
        this.chuVu = chuVu;
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getChuVu() {
        return chuVu;
    }

    public void setChuVu(String chuVu) {
        this.chuVu = chuVu;
    }

    public String getLoaiNhanVien() {
        return loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }
    @Override
    public void XuatThongTin() {
        super.XuatThongTin();
        System.out.println("xep loai:"+this.loaiNhanVien+"thu nhap :"+thunhap());
    }
    @Override
    public float thunhap() {
        int thunhap = this.luongCoSo * this.heSoLuong;
        if (this.loaiNhanVien.equalsIgnoreCase("A")) {
            return thunhap*2;
        }
        else if(this.loaiNhanVien.equalsIgnoreCase("B"))
        {
            return (float)(thunhap + thunhap*0.8);
        }
        return (float)(thunhap + thunhap*0.5);
    }
    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); 
        Scanner s = new Scanner(System.in);
        System.out.print("nhap loai nhan vien");
        this.loaiNhanVien = s.nextLine();
        System.out.print("nhap chuc vu nhan vien");
        this.chuVu = s.nextLine();
    }
}
