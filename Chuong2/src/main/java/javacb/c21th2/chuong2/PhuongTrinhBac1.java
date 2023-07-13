
package javacb.c21th2.chuong2;

import java.util.Scanner;
public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        int a, b;
        float x;
        Scanner S = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a = S.nextInt();
        System.out.println("Nhap b: ");
        b = S.nextInt();
        if(a ==0 ) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            x = -(float)b/a;
        }
    }
}
