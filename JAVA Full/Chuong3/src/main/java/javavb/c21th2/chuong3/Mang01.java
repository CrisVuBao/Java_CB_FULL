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
public class Mang01 {
    // khai báo mảng và không biết số phần từ
    public static void main(String[] args) {
        int[]myArr1;
        int n=5;//để chúa số phần tử mảng
        // Khởi tạo mảng chứa n giá trị
        myArr1 = new int[n]; 
        Scanner s = new Scanner(System.in);
        //Nhập mảng 
        for (int i = 0; i < myArr1.length; i++) {
            System.out.printf("Nhap myArr1[%d] :",i);
            myArr1[i] = s.nextInt();
        }
        // xuất mảng sử dụng for
//        for (int i = 0; i < myArr1.length; i++) {
//            System.out.printf("%d\t",myArr1[i]);
//        }
        // sử dụng foreach
        // xuất mảng sử dụng foreach
        for(int x : myArr1){
            System.out.printf("%d\t",x);
        }
        // khai báo và khởi tạo giá trị cho mảng
        int[] myArr2 = {2,4,5,6,7};
        System.out.println("Danh sach Myarr2");
        for(int x : myArr2){
            System.out.printf("%d\t",x);
        }
    }
}
