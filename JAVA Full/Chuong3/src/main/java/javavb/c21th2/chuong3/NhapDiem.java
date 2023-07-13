/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;
import java.util.Scanner;
/**
 *
 * for sử dụng để nhập và dơ while
 */
public class NhapDiem {
    public static void main(String[] args) {
        float diem;
        int dem =0;
        Scanner S= new Scanner(System.in);
        do {
            System.out.print("Nhap diem :");
            diem = S.nextFloat();
            if (diem < 0 || diem > 10) {
                System.out.println("Diem khong hop le nhạp lai :");
                dem++;
                if (dem==3) {
                    break;
                }
            }
        } while (diem >10 || diem < 0);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.print("Nhap diem lan 2 :");
        
    }
}
