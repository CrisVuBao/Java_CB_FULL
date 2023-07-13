/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

/* xắp xếp mảng tăng và giảm dần*/
public class Mang03 {
    public static void main(String[] args) {
        int[] myArr = {2,5,7,4,8,1,10};
        for(int i = 0; i < myArr.length - 1; i++) {
            for(int j = i + 1; j < myArr.length;j++) {
                if(myArr[i] > myArr[j]) {
                    int temp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = temp;
                }
            }
        }
        
        System.out.println("khi xep ok tang dan");
        for(int x : myArr) {
            System.out.printf("%5d",x);      
        }
    }
}
