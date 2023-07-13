
package javacb.c21th2.chuong2;

import java.util.Scanner;
public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        int a,b,c,delta;
        double x1,x2;
        
        Scanner S = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = S.nextInt();
        System.out.println("Nhap b: ");
        b = S.nextInt();
        System.out.println("Nhap c: ");
        c = S.nextInt();
        
        if(a == 0) {
            PhuongTrinhBac1(b, c);
        }
        else {
            delta = b * b - 4 * a * c;
            if(delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta == 0) {
                x1 = -(double)b/(2*a);
                System.out.printf("Phuong trinh co nghiem kep x = %.2f", x1);
            }
            if(delta > 0) {
                x1 = (-b + Math.sqrt(delta)/(2*a));
                x2 = (-b - Math.sqrt(delta)/(2*a));
                System.out.printf("Phuong trinh có nghiem x1 = %.2f, x2 = %.2f ", x1,x2);
            }
        }
        
    }
    
    public static void PhuongTrinhBac1(int a, int b) {
        if(a ==0 ) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
           float x = -(float)b/a;
        }
    }
}
