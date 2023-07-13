
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Tính khoảng cách giữa 2 điểm AB theo 2 điểm 
 * Công thức d = căn của toạ đọ bình phương của 2 điểm khi trừ nhau
 * d= căn (d1)bình + (d2)bình
 */
public class Thi_du_1 {
    public static void main(String[] args) {
        double xA,xB,yA,yB,d;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap hoanh do A:");
        xA=s.nextDouble();
        System.out.print("Nhap tung do A:");
        xB=s.nextDouble();
        System.out.print("Nhap hoanh do B:");
        yA=s.nextDouble();
        System.out.print("Nhap tung do B:");
        yB=s.nextDouble();
        // tính khoảng cách theo công thức
        double dX = xA - xB;
        double dY = yA - yB;
        d = Math.sqrt(dX * dX + dY *dY);
        System.out.println("Khoang cach giua hai diem:"+d);
    }
}
