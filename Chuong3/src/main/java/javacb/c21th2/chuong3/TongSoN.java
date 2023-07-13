/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong3;

/**
 *
 * @author Cris_VuBao
 */
import java.util.Scanner;
public class TongSoN {
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("nhap: ");
        n = s.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.printf("Nhap so thu %d", i);
            int x = s.nextInt();
            tong+=x;
        }
        System.out.printf("Tong = %.2f",tong);
    }
 
}
