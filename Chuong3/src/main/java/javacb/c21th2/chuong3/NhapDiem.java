/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

import java.util.Scanner;
public class NhapDiem {
    public static void main(String[] args) {
        float diem;
        Scanner s = new Scanner(System.in);
        for(int i = 1; i <= 3;i++) {
             do {
                System.out.print("Nhap: ");
                diem = s.nextFloat();
                if(diem < 0 || diem > 10) {
                    System.out.println("Nhap tu 0 den 10 !!!");
                }
            }while (diem < 0 || diem > 10);
            System.out.println("diem nhap vao: "+ diem);
        }
    }
}
