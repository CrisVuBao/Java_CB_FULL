
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class xuLyKeThua {
    public static void main(String[] args) {
//        Cho ch1 = new Cho("ki","vang",4);
////        Scanner s = new Scanner(System.in);
////        System.out.print("Nhap Ten cho cho:");
////        ch1.ten = s.nextLine();
////        System.out.print("Nhap mau cho cho:");
////        ch1.mau = s.nextLine();
////        System.out.print("Nhap mau cho cho:");
////        ch1.setSoChan(s.nextInt());
//        ch1.inThongTin();
        HocSinhCap1 hsc1 = new HocSinhCap1(7, 4,"123", "ho ban", "nam");
        HocSinhCap2 hsc2 = new HocSinhCap2(9,9,7,4,"123", "ho ban", "nu");
        hsc1.inThongTin();
        hsc2.inThongTin();
       
    }
}
