/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong2;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        int a,b;
        float x;
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        a= S.nextInt();
        System.out.print("Nhap he so b:");
        b= S.nextInt();
        if(a==0){
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            x=-(float)b/a;
            System.out.printf("Phuong trinh co nghiem x= %.2f",x);
        }
    }
}
