/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT3_ArrayListt_dahinh;
import java.util.Scanner;

public class NhanVien extends NguoiLaoDong{
    private String chucVu;
    private String loaiNV;

    public NhanVien() {
    }

    public NhanVien(String chucVu, String loaiNV, String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, float heSoLong) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLong);
        this.chucVu = chucVu;
        this.loaiNV = loaiNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner S = new Scanner(System.in);
        System.out.print("\t+ Chuc vu: ");
        this.chucVu = S.nextLine();
        System.out.print("\t+ Loai nhan vien: ");
        this.loaiNV = S.nextLine();
        
    }

    @Override
    public double tinhThuNhap() {
        double loaiPC = 0;
        if(this.loaiNV.equalsIgnoreCase("a")){
            loaiPC = 100/100;
        }else if(this.loaiNV.equalsIgnoreCase("b")){
            loaiPC = 80/100;
        }else if(this.loaiNV.equalsIgnoreCase("c")){
            loaiPC = 50/100;
        }
        double lcb = 1490000 * this.heSoLong;
        
        return lcb + lcb * loaiPC;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" - Thu nhap: " + this.tinhThuNhap());
    }
    
    
}