/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhapDiemBreak {
       public static void main(String[] args) {
         Scanner S= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            float diem2;
            diem2 = S.nextFloat();
            if (diem2 <= 10 && diem2 >= 0) {
                System.out.printf("diem lan 2 la :%.2f",diem2);
                break;
            }
            else{
                System.out.print("Nhap sai nhap lai :");

            }
        }
    }
}
