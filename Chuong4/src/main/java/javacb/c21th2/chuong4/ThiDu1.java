
package javacb.c21th2.chuong4;
import java.util.Scanner;

// Tính khoảng cách giữa hai điểm A,B theo công thức: d = Sqrt((xa-xb)^2 + (ya - yb)^2)
public class ThiDu1 {
    public static void main(String[] args) {
        double xA, xB, yA, yB, d;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nhap hoanh do xA");
        xA = s.nextDouble();
        System.out.print("Nhap tung do yA");
        yA = s.nextDouble();
        System.out.print("Nhap hoanh do xB");
        xB = s.nextDouble();
        System.out.print("Nhap tung do yB");
        yB = s.nextDouble();
        
        // tính
        double dX = xA - yB;
        double dY = yA -yB;
        d = Math.sqrt((dX * dX) + (dY * dY));
        System.out.println("khoang cach giua hai diem: " + d);
    }
}
