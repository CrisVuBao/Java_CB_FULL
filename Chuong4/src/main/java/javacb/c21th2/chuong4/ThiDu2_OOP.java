
package javacb.c21th2.chuong4;

import java.util.Scanner;

// Đây là lập trình theo cấu trúc
public class ThiDu2_OOP {
     public static void main(String[] args) {
        double xA, xB, yA, yB, d;
        Scanner s = new Scanner(System.in);
        xA = nhapSo("Nhap xA:");
        yA = nhapSo("Nhap yA:");
        xB = nhapSo("Nhap xB:");
        yB = nhapSo("Nhap yB:");
        
        
        // tính
        double dX = xA - yB;
        double dY = yA -yB;
        d = Math.sqrt((dX * dX) + (dY * dY));
        System.out.println("khoang cach giua hai diem: " + d);
    }
     
     public static double nhapSo(String thongBao) {
         Scanner s = new Scanner(System.in);
         double kq;
         
         System.out.print(thongBao);
         kq = s.nextDouble();
         return kq; // có giá trị trả về là double, nên phải có return
     }
     
     public static double tinhKhoangCach(double xA, double yA, double xB, double yB) {
         double kq;
         double dX = xA - xB;
         double dY = yA - yB;
         kq = Math.sqrt((dX * dX) + (dY * dY));
         return kq;
     }
}
