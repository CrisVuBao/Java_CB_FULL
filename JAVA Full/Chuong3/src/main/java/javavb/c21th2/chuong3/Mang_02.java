/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

import java.util.Scanner;

/**
 *
 * tạo mảng có 5 phần tử nhập từ bàn phím
 * xuất ra tổng giá tri các phần tử
 * xuất tổng giá trị các phần từ chẵn
 * Xuất: số các phần tử lẽ chia hết cho 3
 * Xuất : ra số nguyên tố
 */
public class Mang_02 {
    public static void main(String[] args) {
        int[]myArr = new int[5];
        Scanner s = new Scanner(System.in);
        // nhập mảng
        for(int i =0;i<myArr.length;i++){
            System.out.printf("Nhap myArr[%d]:",i);
            myArr[i] = s.nextInt();
        }
        for (int x:myArr) {
            System.out.printf("%5d",x);
        }
        System.out.println("");
        // tính tổng giá trị các phần tử trong mang
        int tong =0;
        for(int x: myArr){
            tong += x;
        }
        System.out.printf("tong cac phan tu trong mang : %d",tong );
        // tính tổng giá trị các phần tử chẵn trong mang
        int tongchan =0;
        for(int x: myArr){
            if ((x%2)==0) {
                tongchan += x;                
            }
        }
        System.out.printf("tong cac phan tu chẵn trong mang : %d",tongchan );
        // tính sô các phần tử lẻ chia hết cho 3 trong mang
        int demchan_3 =0;
        for(int x: myArr){
            if ((x%2)!=0 && (x%3)==0) {
                demchan_3 ++;                
            }
        }
        System.out.printf("tong cac phan tu chẵn trong mang : %d",demchan_3 );
        System.out.println("");
    }
}
