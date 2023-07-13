/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

/**
 *
 *  dùng do while 
 */
public class CuuChuong {
    public static void main(String[] args) {
        int i =1;
        final int CUU_CHUONG_7 =7;
        while(i<=10){
            System.out.printf("%2d * %d = %2d\n",i,CUU_CHUONG_7,CUU_CHUONG_7*i);
            i++;
        }
        int i2=1;
        do {            
            System.out.printf("%2d * %d = %2d\n",i2,CUU_CHUONG_7,CUU_CHUONG_7*i2);
            i2++;
        } while (i2 <= 10);
    }
}
