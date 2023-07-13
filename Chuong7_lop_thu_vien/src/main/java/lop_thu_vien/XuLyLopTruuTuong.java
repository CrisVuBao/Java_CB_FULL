/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_thu_vien;

public class XuLyLopTruuTuong {
    public static void main(String[] args) {
        HocSinhCap1TT hs1 = new HocSinhCap1TT(10,10,"wow","wow","wow");
        HocSinhTruuTuong hs2 = new HocSinhCap2(10,10,10,10,"super","wow","wow");
        hs2.inThongTin();
        System.out.println("" + hs2.tinhTrungBinh());
        System.out.println("" + hs2.xepLoai());
        
        DanhSachHocSinhInterface dshs = new DanhSachHocSinhInterface();
    }
}
