/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua3;
import java.util.Scanner;
/**
 *
 * @author Cris_VuBao
 */
public class NhanVien extends QLLaoDong{
    private int soGioVuot;
    private int thamNien;

    public NhanVien(int soGioVuot, int thamNien, String hoTen, Ngay ngaySinh, int thuNhap) {
        super(hoTen, ngaySinh, thuNhap);
        this.soGioVuot = soGioVuot;
        this.thamNien = thamNien;
    }

    public int getSoGioVuot() {
        return soGioVuot;
    }

    public void setSoGioVuot(int soGioVuot) {
        this.soGioVuot = soGioVuot;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    @Override
    public void NhapThongTin() {
        super.NhapThongTin();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so gio vuot: ");
        this.soGioVuot = s.nextInt();
        System.out.print("Nhap tham nien: ");
        this.thamNien = s.nextInt();
    }
    
    @Override
    public int tinhSoLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
