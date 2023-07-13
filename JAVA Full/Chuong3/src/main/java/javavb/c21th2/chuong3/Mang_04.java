/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong3;
import java.util.Arrays;
/**
 *
 * @author Dell
 */
public class Mang_04 {
    public static void main(String[] args) {
        int[] myArr = {2,1,4,5,8,6,3};
        System.out.println("mang chua sap xep;" + Arrays.toString(myArr));
        System.out.println("Sau khi sap xep:" );
        Arrays.sort(myArr);
        System.out.println("amng khi sap xep:"+ Arrays.toString(myArr) );
        System.out.println("Tim kiem phan tu gia tri la 6 trong mang:");
        int vt=Arrays.binarySearch(myArr,6);
        System.out.println("vi tri trong mang :" +vt);
        System.out.println("Mang sau khi dien gia tri 1");
        Arrays.fill((myArr), 1);
        System.out.println("mang sau khi dien gia tri 1;" + Arrays.toString(myArr));

    }
}
