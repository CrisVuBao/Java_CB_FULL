/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

/**
 *
 * @author Dell
 */
public class TrungBinhCong {
    public static void main(String[] args) {
        int batdau =27,ketthuc =250,dem=0,tong=0;
        while (batdau <= ketthuc) {            
            if(batdau % 3 == 0){
                tong+= batdau;
                dem++;
            }
            batdau ++;
        }
        float tbCong = (float)tong /dem;
        System.out.printf("Trung binh cong : %.2f",tbCong);
    }
           
}
