/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapkethua;
import NgayThang.Ngay;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class xuLyNhanVien {
    public static void main(String[] args) {
        DanhSachNhanVIen dsnv = new DanhSachNhanVIen();

        dsnv.them(new NhanVienQL("003", "nguyen 3 2", new Ngay(3, 5, 1994), 1000, 100, 1000));
        dsnv.them(new NhanVienQL("004", "tran 1", new Ngay(6, 1, 1984), 1000, 90, 900));
        dsnv.them(new NhanVienNC("001", "ba 4", new Ngay(10, 7, 2000),1000, 100, 1000));
        dsnv.them(new NhanVienNC("002", "so 3", new Ngay(6, 11, 1997),1000, 99, 1100));
//
//        System.out.println("Truoc khi xoa nhan vien trong danh sach");
//        dsnv.in();
//        System.out.println("Danh sach nhan vien sau khi xoa");
//        NhanVien nvXoa = dsnv.getDanhSachNV().get(1);
//        dsnv.xoa(nvXoa);
//        dsnv.in();

        // sắp xếp theo tên
        Collections.sort(dsnv.getDanhSachNV());
        for(NhanVien hs:dsnv.getDanhSachNV()){
            System.out.println(hs.hoTen);
        }
        System.out.println("spa xep nguoc lai");
        // sắp xếp theo tên giảm dần
        Collections.sort(dsnv.getDanhSachNV(),Comparator.reverseOrder());
        for(NhanVien hs:dsnv.getDanhSachNV()){
            System.out.println(hs.hoTen);
        }        
    }
}
