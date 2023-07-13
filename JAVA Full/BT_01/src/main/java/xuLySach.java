/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class xuLySach {
    public static void main(String[] args) {
        Ngay ns1 = new Ngay(12, 8, 2000);
        tacGia tg1 = new tacGia("Tran Van Hung", ns1);
        Sach s1 = new Sach("lap trinh java", 120000, 2015, tg1);
        
        Sach s2 = new Sach("thiet ke web", 9000, 1999, new tacGia("le ba dao", new Ngay(12, 6, 2009)));
        Sach s3 = new Sach("SQL", 17000, 2015, new tacGia("nguyen dao ba", new Ngay(5, 2, 2015)));
        
        // xuat ten sach
        s1.xuatTenSach();
        
        s2.xuatTenSach();
        s3.xuatTenSach();
        
        // gia ban sau giam
        System.out.println(s1.xuatGiaBanSauGiam(10));
        System.out.println(s2.xuatGiaBanSauGiam(20));
        System.out.println(s3.xuatGiaBanSauGiam(30));
        
        System.out.println("s1 cung nam xuat ban voi s2" + s1.xuatCungNamXuatBan(s2));
        System.out.println("s1 cung nam xuat ban voi s3" + s1.xuatCungNamXuatBan(s3));
        
    }
}
