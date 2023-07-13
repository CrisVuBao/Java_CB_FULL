/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class XuLyLopTruuTuong {
    public static void main(String[] args) {
        HocSinhCap1TT hs1 = new HocSinhCap1TT(8,7,"A01", "nguyen Van A", "Nam") ;
        hs1.inThongTin();
        System.out.println("Diem trung binh: "+ hs1.tinhTrungBinh() +"-Xep loai :"+hs1.xepLoai());
    }
}
