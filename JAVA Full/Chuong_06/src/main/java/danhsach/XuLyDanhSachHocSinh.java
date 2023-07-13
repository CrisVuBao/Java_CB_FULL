/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danhsach;

/**
 *
 * @author Dell
 */
public class XuLyDanhSachHocSinh {
    public static void main(String[] args) {
        DanhSachHocSinh dshs = new DanhSachHocSinh();
        dshs.themHS(new HocSinhCap1TT("001", "nguyen cap 1 B", "Nam", 8, 10));
        dshs.themHS(new HocSinhCap1TT("002", "nguyen cap 1 A", "Nam", 9, 6));
        dshs.themHS(new HocSinhCap1TT("003", "nguyen cap 1 D", "Nam", 6, 8));
        dshs.themHS(new HocSinhCap1TT("004", "nguyen cap 1 E", "Nam", 8, 7));
        
        dshs.themHS(new HocSinhCap2TT("005", "nguyen cap2 P", "Nam", 10, 9, 8, 7));
        dshs.themHS(new HocSinhCap2TT("006", "nguyen cap2 O", "Nam", 7, 6, 8, 8));
        dshs.themHS(new HocSinhCap2TT("007", "nguyen cap2 U", "Nam", 8, 6, 4, 5));
        dshs.themHS(new HocSinhCap2TT("008", "nguyen cap2 Y", "Nam", 9, 5, 8, 9));
        System.out.println("Truoc khi xoa hoc sinh trong danh sach");
        dshs.inDanhSachhHS();
        System.out.println("Danh sach hoc sinh sau khi xoa");
        HocSinhTT hsXoa = dshs.getDanhSachHS().get(1);
        dshs.xoaHS(hsXoa);
        dshs.inDanhSachhHS();

    }
}
