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
public class PhepToan {
    public static void main(String[] args) {
//        int min = 50;
//        int max = 100;
//        int SoPhatSinh = (int)(Math.random() * (max - min) +min);
//        System.out.println("so phat sinh "+SoPhatSinh);
//        
//        //2 chuyen mot chuoi ve kieu nguyen
//        String str1 = "13";
//        int n = Integer.parseInt(str1);
//        System.out.println("so nguyen khi chuyen la "+n);
//        String str2 = "13.5";
//        float n2 = Float.parseFloat(str2);
//        System.out.println("so thuc khi chuyen la "+n2);
//        
//        //3 bat loi voi try catch
//        Scanner S = new Scanner(System.in);
//        try {
//            System.out.print("Nhap mot so nguyen : ");
//            int a = S.nextInt();
//            System.out.println("Ban vua nhap so:" +a);
//        } catch (Exception e) {
//            System.out.println("Ban nhap sai kieu du lieu");
//        }
//        
        //4. kiểm tra kiểu dữ liệu với hasNextInt
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        if(S.hasNextInt()){
            int a = S.nextInt();
            System.out.println("So nguyen vua nhap :"+a);
        }else{
            System.out.println("So nhap sai kieu du lieu");
        }
        
    }
}
