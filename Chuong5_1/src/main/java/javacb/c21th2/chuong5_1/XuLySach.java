/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_1;

/**
 *
 * @author Cris_VuBao
 */
public class XuLySach {
    public static void main(String[] args) {
        // Cách1
        Ngay ns1 = new Ngay(12, 8, 2000);
        TacGia tg1 = new TacGia("Tran Van A", ns1);
        Sach s1 = new Sach("Lap trinh pro",1200,2018,tg1);
        
        // Cách 2
        Sach s2 = new Sach("lap trinh vip", 80000, 2020, new TacGia("Tran Vip",new Ngay(20,10,2000)));
        Sach s3 = new Sach("lap trinh wow", 120000, 2023, new TacGia("Tran wow wow",new Ngay(20,10,2023)));
        
        // Xuất tên sách;
        s2.xuatTenSach();
        s3.xuatTenSach();
        
        // giá bán sau khi giảm
        s1.giaBanSachSauGiam(10);
        System.out.printf(" - gia ban sau giam gia: %.2f VND \n", s2.giaBanSachSauGiam(10)); 
        s3.giaBanSachSauGiam(50);
        
        
        // so sánh cùng năm xuất bản
//        System.out.println(" - so sanh: " + s1.cungNamXuatBan(s3)); 
        if(s1.cungNamXuatBan(s3) == true) {
            System.out.println("cung nam");
        }
        else {
            System.out.println(" - khac nam");
        }
        s3.cungNamXuatBan(s2);
    }
}
