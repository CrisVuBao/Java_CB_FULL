/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

import java.util.Scanner;

/**
 *
 * sử dụng do while và while dể nhập
 */
public class TongNSo {
    public static void main(String[] args) {
        int so,tong =0;
        System.out.print("Nhap so :");
        Scanner S= new Scanner(System.in);
        so= S.nextInt();
        for (int i = 1; i <= so; i++) {
            System.out.printf("Nhap so thu %d :",i);
            int x= S.nextInt();
            tong += x;
        }
        System.out.printf("Tong la: %d",tong);
        System.out.println("@@@@@@@@@@@Nhap lan 2@@@@@@@@@@");
        int so2,tong2=0,dem2 =1;
        System.out.print("Nhap so lan 2 :");
        so2= S.nextInt();
        do {
            System.out.printf("Nhap so thu %d :",dem2);
            int x= S.nextInt();
            tong2 += x;
            dem2++;
        } while (so2 >= dem2);
        System.out.printf("Tong la: %d",tong2);
    }
}
