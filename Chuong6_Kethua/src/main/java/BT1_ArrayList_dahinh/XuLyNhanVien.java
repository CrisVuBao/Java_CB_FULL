/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_ArrayList_dahinh;

import BaiTapKeThua.*;

public class XuLyNhanVien {
    public static void main(String[] args) {
        DSNhanVien dsnv = new DSNhanVien();
        dsnv.themNV(new NhanVienNC("01","a1", new Ngay(10,10,2010),10,10,10));
        dsnv.themNV(new NhanVienQL("02","a2",new Ngay(10,20,2023),10,10,10));
        
        System.out.println("xuat thong tin: ");
        dsnv.inDanhSach();
        System.out.println("==========xoa danh sach==============");
        NhanVien nv = dsnv.getDanhSachNV().get(1);
        dsnv.xoaNV(nv);
        dsnv.inDanhSach();
    }
   
}
