/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

import java.util.Arrays;
public class Mang04 {
    public static void main(String[] args) {
        // xuất mảng trước khi sắp xếp
        int[] myArr = {7,5,3,8,9,1,10};
        System.out.println("xuat mang" + Arrays.toString(myArr));
        
        Arrays.sort(myArr);
        System.out.println("sap xep tang dan: " + Arrays.toString(myArr));
    }
}
