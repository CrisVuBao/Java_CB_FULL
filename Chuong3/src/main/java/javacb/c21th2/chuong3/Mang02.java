/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

import java.util.Scanner;

/* bt: tạo mảng có 5 phần tử nhập từ bàn phím
    1. xuát tổng giá trị các phần tử
    2.xuất tổng giá trị các phần tử chẵn
    3.xuát số các phần tử lẻ chia hết cho 3
    4.xuất ra các phần tử là số nguyên tố trong mảng
*/
public class Mang02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] myArr = new int[5];
        for(int i = 0; i < myArr.length; i++) { // phần nhập mảng
            System.out.printf("Nhap myArr[%d]: ",i);
            myArr[i] = s.nextInt();
        }
        
        for(int x : myArr) { // phàn xuất mảng
            System.out.printf("%5d",x);
        }
        System.out.println("");
        
        // TÍNH TỔNG GIÁ TRỊ CÓ CÁC PHẦN TỬ TRONG MẢNG
        int tong = 0;
        for(int x : myArr) {
            tong += x;
        }
        System.out.println("tong cac phan tu trong mang: " + tong);
        
        // TỔNG GIÁ TRỊ CÁC PHẦN TỬ CHẴN
        int phanTuChan = 0;
        for(int x : myArr) {
            if(x % 2 == 0) {
                phanTuChan += x;
            }
        }
        System.out.printf("tong gia tri phan tu chan = %.2f", phanTuChan);
    }
}
