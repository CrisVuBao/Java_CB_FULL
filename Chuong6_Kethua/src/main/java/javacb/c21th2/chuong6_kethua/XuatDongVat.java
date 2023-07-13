/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong6_kethua;
import java.util.Scanner;

public class XuatDongVat {
    public static void main(String[] args) {
        Cho conCho = new Cho("haha","red",10);
        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten cho: ");
        conCho.ten = s.next();
        System.out.print("Nhap mau: ");
        conCho.mau = s.next();
        System.out.print("nhap so chan: ");
        conCho.setSoChan(s.nextInt());
        conCho.inThongTin();
    }
}
