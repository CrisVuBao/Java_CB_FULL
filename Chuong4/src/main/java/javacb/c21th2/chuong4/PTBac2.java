
package javacb.c21th2.chuong4;
import java.util.Scanner;
public class PTBac2 {
    
    // Feild
    double a, b, c, delta , x1, x2;
    
    // Method
    public void nhap() {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        this.a = s.nextDouble();
        System.out.print("Nhap b: ");
        this.b = s.nextDouble();
        System.out.print("Nhap c: ");
        this.c = s.nextDouble();
    }
    
    public static void PhuongTrinhBac1(double a, double b) {
        if(a ==0 ) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
           double x = -(b/a);
        }
    }
    
    private String tinhPT2() {    
        String kq = "";
        if(a == 0) {
            PhuongTrinhBac1 ptb1 = new PhuongTrinhBac1();
            ptb1.giaiPT();
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
                kq = "Phuong trinh có nghiem x1 = "+ x1 + " x2 = " + x2;
               
               
            }
        }
        
        return kq;
    }
    
    public void xuatPT2() {
        System.out.println(tinhPT2());
    }
}
