/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class xuLyHocSinh {
      public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("HS01","Nguyen ba dao",new LopHoc("c21.th1", new Khoa("cong nghe thong tin", "ly chinh thang")),8,9,new NgaySinh(5, 2, 2015));
        HocSinh hs2 = new HocSinh("HS01","Nguyen dao ba",new LopHoc("c21.kt1", new Khoa("Kinh te", "ly chinh thang")),3,2,new NgaySinh(10, 06, 2015));
        HocSinh hs3 = new HocSinh("HS01","Ba Dao Nguyen",new LopHoc("c21.th3", new Khoa("cong nghe thong tin", "ly chinh thang")),9,9,new NgaySinh(5, 2, 2015));
        
        hs1.xuatTenKhoa();
        hs2.xuatTenKhoa();
        hs3.xuatTenKhoa();
        
        hs1.xuatTrungBinh();
        hs2.xuatTrungBinh();
        hs3.xuatTrungBinh();
        
        hs1.xuatXepLoai();
        hs2.xuatXepLoai();
        hs3.xuatXepLoai();
        
        System.out.println("phim hs1 co ngay chieu giong hs2" + hs1.kiemTraNgaySinhGiongNhau(hs2));     
        System.out.println("phim hs1 co ngay chieu giong hs3" + hs1.kiemTraNgaySinhGiongNhau(hs3));        
        System.out.println("phim hs2 co ngay chieu giong hs3" + hs2.kiemTraNgaySinhGiongNhau(hs3));        


    }
}
