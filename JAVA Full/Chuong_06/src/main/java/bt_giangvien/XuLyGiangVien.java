/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_giangvien;

import java.util.Collections;

/**
 *
 * @author Dell
 */
public class XuLyGiangVien {
        public static void main(String[] args) {
        DanhSachGiangVien dsgv = new DanhSachGiangVien();
        dsgv.them(new GVCoHuu(10000,100,"Nguyen co huu", new NgayThang.Ngay(3,4,2019),90));
        dsgv.them(new GVCoHuu(11000,90,"Nguyen co huu so2", new NgayThang.Ngay(4,7,2015),91));
        dsgv.them(new GVThinhGiang(90000,"nguyen thinh giang", new NgayThang.Ngay(3,6,2010),90));
        dsgv.them(new GVThinhGiang(94000,"nguyen thinh giang so2", new NgayThang.Ngay(3,9,1017),100));

//        System.out.println("Truoc khi xoa nhan vien trong danh sach");
//        dsgv.in();
//        System.out.println("Danh sach nhan vien sau khi xoa");
//        GiangVien gvXoa = dsgv.getDanhSachGV().get(1);
//        dsgv.xoa(gvXoa);
//        dsgv.in();
        Collections.sort(dsgv.getDanhSachGV());
        for(GiangVien hs:dsgv.getDanhSachGV()){
            System.out.println(hs.soGioGiangDayTrongThang + "ten giang vien" +hs.hoTen);
        }
    }
}
