/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_2;

public class QLHS {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("a01","tran a",new LopHoc("12a",new Khoa("CNTT","HCM")),10,10,new Ngay(10,10,2021));
        HocSinh hs2 = new HocSinh("a01","tran b",new LopHoc("12a",new Khoa("CNTT","HCM")),8,8,new Ngay(10,10,2021));
        System.out.println("ten khoa: " + hs1.xuatTenKhoa());
        System.out.println("diem trung binh: " + hs1.tinhTrungBinh()); 
        System.out.println("xep loai: " + hs1.tinhXepLoaiHS());
        System.out.println("" + hs1.kiemTraNgaySinhGiongNhau(hs2));
        if(hs1.kiemTraNgaySinhGiongNhau(hs2) == true) {
            System.out.println("trung ngay sinh");
        }
        else {
            System.out.println("khong trung ngay");
        }
    }
}
