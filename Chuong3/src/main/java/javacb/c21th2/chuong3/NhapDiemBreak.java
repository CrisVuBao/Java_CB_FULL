/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

/**
 *
 * @author Cris_VuBao
 */
import java.util.Scanner;
public class NhapDiemBreak {
    public static void main(String[] args) {
        int nhap;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap: ");
        nhap = s.nextInt();
        while(nhap < 0 || nhap > 10) {
            System.out.println("Nhap tu 0 den 10 !!! ");
            break;
        }
        System.out.println("ban co: " + nhap);
    }
}
