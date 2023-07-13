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
public class SoNguyenTo {
    public static void main(String[] args) {
        //So nguyen to la so > 1 thoa dieu kien chi chia het cho 1 và chính nó
        // dùng vòng lặp while để xác định số nhập vào có nguyên tố hay không
        int so=0,dem=2 ;
        System.out.print("Nhập số :");
        Scanner S= new Scanner(System.in);
        so= S.nextInt();
        // kiểm tra lớn hơn 1
        boolean ktra=false;
            
        while (dem <= (so/2)) {   
            if ((so%dem)==0) {
                ktra= true;
            }
               dem++;
        }
        if(ktra ==false && so >1){
            System.out.printf("%d la so nguyen to",so);
        }
        else{
            System.out.printf(" %d khong phai la so nguyen to",so);
        }
    }
}
