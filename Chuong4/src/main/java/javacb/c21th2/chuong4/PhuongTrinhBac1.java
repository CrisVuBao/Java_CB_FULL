/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong4;
import java.util.Scanner;

/**
 *
 * @author Cris_VuBao
 */
public class PhuongTrinhBac1 {
    // Field
    double a, b;

    // method
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap a: ");
        this.a = s.nextDouble();
        System.out.println("Nhap b: ");
        this.b = s.nextDouble();

    }
    
    public String giaiPT() {
        String kq = "";
        if(a == 0) {
            if(b == 0) {
                kq = "Phuong trinh vo so nghiem";
            }
            else {
                kq = "Phuong trinh vo nghiem";
            }
        }
        else {
            double x = -(double)this.b / this.a;
            kq = "PT co nghiem: " + x;
        }
        return kq;
    }
    
    public void xuat() {
        System.out.println(giaiPT());
    }
     
}
