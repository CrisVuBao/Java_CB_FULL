/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;

/**
 *
 * sắp xếp mảng tăng và giảm dần
 */
public class Mang_03 {
    public static void main(String[] args) {
        int[] myArr = {2,3,4,7,1,6,8};
        for (int x:myArr) {
            System.out.printf("%5d",x);
        }    
        System.out.printf("sap xep tang dan");

        //sắp xếp mang tang dan
        for(int i =0; i <myArr.length - 1 ;i++){
            for (int j = i+1; j < myArr.length; j++) {
                if(myArr[i] > myArr[j]){
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }
                
            }
        }
        for (int x:myArr) {
            System.out.printf("%5d",x);
        } 
         System.out.printf("sap xep giam dan");

        //sắp xếp mang tang dan
        for(int i =0; i <myArr.length - 1 ;i++){
            for (int j = i+1; j < myArr.length; j++) {
                if(myArr[i] < myArr[j]){
                    int t = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = t;
                }
                
            }
        }
        for (int x:myArr) {
            System.out.printf("%5d",x);
        } 
    }
}
