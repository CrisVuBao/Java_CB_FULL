/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class xuLyPhim {
      public static void main(String[] args) {
        nhaSanXuat nsx1 = new nhaSanXuat("Hang VTC","Phim viet nam");
        Phim p1 = new Phim("Phim hoat hinh",2009,new nhaSanXuat("Hang VTV","Phim viet nam"),10000,new Ngay(5, 8, 2015));
        Phim p2 = new Phim("Phim bộ",2011,nsx1,9000,new Ngay(5, 2, 2015));

        // xuat ten hang phim
        p1.xuatTenHangPhim();
        p1.tinhGiaBanSauKhuyenMai(10);
        
        System.out.println("phim p1 co gia re hon p2" + p1.xuatGiaReHon(p2));
        System.out.println("phim p1 co ngay chieu giong p2" + p1.kiemTraNgayChieuGiongNhau(p2));
        
        
    }
}
