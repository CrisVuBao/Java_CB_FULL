
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
public class Thi_du_2 {
    public static void main(String[] args) {
        double xA,xB,yA,yB,d;
        Scanner s = new Scanner(System.in);
        xA = nhapSo("Nhap hoanh do A:");
        xB = nhapSo("Nhap tung do A:");
        yA = nhapSo("Nhap hoanh do B");
        yB = nhapSo("Nhap tung do B:");
        // tính khoảng cách theo công thức
        d=TinhKhoangCach(xA, xB, yA, yB);
        System.out.println("Khoang cach giua hai diem:"+d);
    }
    public static double TinhKhoangCach(Double xA,Double xB,Double yA,Double yB){
        double kq;
        double dX = xA - xB;
        double dY = yA - yB;
        kq = Math.sqrt(dX * dX + dY *dY);
        return kq;
    }
    public static double nhapSo(String thongbao){
        Scanner s = new Scanner(System.in);
        double kq ;
        System.out.print(thongbao);
        kq=s.nextDouble();
        return kq;
   }
}
