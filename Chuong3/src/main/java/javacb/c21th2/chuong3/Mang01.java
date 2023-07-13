/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

import java.util.Scanner;
public class Mang01 {
    public static void main(String[] args) {
        int[] myArr1; // khai báo mảng ko biết số phần tử
        int n = 10; // để chứa số phần tử của mảng
        
        Scanner s = new Scanner(System.in);
        
        myArr1 = new int[n]; //Khởi tạo mảng chứa n giá trị
        
        // Nhập liệu
        for(int i = 0; i < myArr1.length; i++) {
            System.out.printf("Nhap myArr1[%d]: ",i);
            myArr1[i] = s.nextInt();
        }
//        // Xuất mảng
//        for(int i = 0; i < myArr1.length; i++) {
//            System.out.printf("%d\t",myArr1[i]); // \t cách 1 tab
//        }



//    // sử dụng for-each
//        for(int x: myArr1) {
//            System.out.printf("%d\t",x);
//        }



      // khai báo và sử dụng giá trị trong mảng
      


    }
}
