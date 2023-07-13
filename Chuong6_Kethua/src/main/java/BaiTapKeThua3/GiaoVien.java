/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua3;
import java.util.Scanner;

public class GiaoVien extends QLLaoDong{
    private String xepLoai;

    public GiaoVien(String xepLoai, String hoTen, Ngay ngaySinh, int thuNhap) {
        super(hoTen, ngaySinh, thuNhap);
        this.xepLoai = xepLoai;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
    
    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap xep loai");
        this.xepLoai = s.next();
    }

    @Override
    public int tinhSoLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
