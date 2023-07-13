/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collections;

/**
 *
 * @author Dell
 */
public class XuLyNguoiLaoDong {
    public static void main(String[] args) {

        // nhap thong tin
        DanhSachLaoDong dshs = new DanhSachLaoDong();
        dshs.them(new GiaoVien(10000, 21,LocalDate.of(2011,4, 14), "giao vien 05", LocalDate.of(1988,4, 14), 1000));
        dshs.them(new GiaoVien(11000, 11,LocalDate.of(2000,5, 14), "giao vien 02", LocalDate.of(1984,8, 19), 1000));
        
        dshs.them(new NhanVien("A", "giam doc", "nhan vien 03", LocalDate.of(1994,1, 19), LocalDate.of(2017,2, 22), 900));
        dshs.them(new NhanVien("B", "pho giam doc", "nhan vien 01", LocalDate.of(1984,1, 19), LocalDate.of(2007,4, 12), 800));
        System.out.println("sap xep theo ten");
        Collections.sort(dshs.getDanhSachlD());
        for(NguoiLaoDong ld:dshs.getDanhSachlD()){
            System.out.println(ld.hoTen);
        }
        System.out.println("sap xep theo he so luong");
        Collections.sort(dshs.getDanhSachlD(),NguoiLaoDong.comparaByHeSoLuong());
        for(NguoiLaoDong ld:dshs.getDanhSachlD()){
            System.out.println("ten:"+ld.hoTen +"he so luong" +ld.heSoLuong);
        }
        System.out.println("///////////////////////");        
        
        
//        System.out.println("Truoc khi xoa lao dong trong danh sach");
//        dshs.in();
//        System.out.println("tong thu nhap lao dong la "+dshs.TinhTongThuNhap());
//        System.out.println("so nguoi lao dong la "+dshs.TongLaoDong());
//        
//        System.out.println("Danh sach lap dong sau khi xoa");
//        NguoiLaoDong ldXoa = dshs.getDanhSachlD().get(1);
//        dshs.xoa(ldXoa);
//        dshs.in();
//        System.out.println("tong thu nhap lao dong la "+dshs.TinhTongThuNhap());
//        System.out.println("so nguoi lao dong la "+dshs.TongLaoDong());
//        dshs.ThongTinNguoiThuNhapLonNhat();
    }
}
