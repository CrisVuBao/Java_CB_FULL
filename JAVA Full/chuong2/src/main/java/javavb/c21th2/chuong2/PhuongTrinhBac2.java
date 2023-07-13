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
public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        int a,b,c,delta;
        double x1,x2;
        
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        a= S.nextInt();
        System.out.print("Nhap he so b:");
        b= S.nextInt();
        System.out.print("Nhap he so c:");
        c= S.nextInt();
        if(a==0){
            phuongTrinhBac1(b, c);
        }else{
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta == 0){
                x1 = -(double)b / (2*a);
                System.out.printf("Phuong trinh co nghiem kep x= %.2f",x1);
            }
            if(delta > 0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Phuong trinh co nghiem x=%.2f,x2=%.2f",x1,x2);
            }
            
        }
        
    }
    public static void phuongTrinhBac1(int a , int b){
        if(a==0){
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            float x=-(float)b/a;
            System.out.printf("Phuong trinh co nghiem x= %.2f",x);
        }   
    }
}
