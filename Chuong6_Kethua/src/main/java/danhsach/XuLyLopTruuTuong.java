/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsach;

import HocSinhAbstract.*;

public class XuLyLopTruuTuong {
    public static void main(String[] args) {
        DanhSachHocSinh dshs = new DanhSachHocSinh();
        dshs.themHS(new HocSinhCap1TT("01","wow","nam",8,10));
        dshs.themHS(new HocSinhCap1TT("02","wow2","nam",10,10));
        dshs.themHS(new HocSinhCap1TT("03","wow3","nam",10,10));
        dshs.themHS(new HocSinhCap2TT("03","wow10","nam",10,10,10,10));
        
        System.out.println("Truoc khi xoa: ");
        dshs.inDanhSachHS();
        System.out.println("=================sau khi xoa hoc sinh: ==================");
        HocSinhTruuTuong hsXoa = dshs.getDanhSachHS().get(1);
        dshs.xoaHS(hsXoa);
        dshs.inDanhSachHS();
    }
}
