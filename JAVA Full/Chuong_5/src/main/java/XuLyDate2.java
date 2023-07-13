
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
public class XuLyDate2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Nhap ngay:");
//        int d = s.nextInt();
//        System.out.print("Nhap thang:");
//        int m = s.nextInt();
//        System.out.print("Nhap nam:");
//        int y = s.nextInt();
//        MyDate2 d2 = new MyDate2(d, m, y);
        MyDate2 d3 = new MyDate2(25,8,2011);
        int d = d3.getDay();
        System.out.println("Ngay nhap :" +d);
        d3.setDay(11);
        d3.xuatngaythangnam();
    }
}
