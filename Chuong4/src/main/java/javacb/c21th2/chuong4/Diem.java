
package javacb.c21th2.chuong4;

import java.util.Scanner;
public class Diem {
    // Biến thành phần
    double x,y;
    
    // Hàm thành phần
    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("nhap hoanh do x: ");
        this.x = s.nextDouble();
        System.out.print("nhap tung do y: ");
        this.y = s.nextDouble();
    }
    
    public void xuat() {
        System.out.printf(" diem co toa do (%.0f,%.0f)", this.x, this.y);
    }
    
    public double tinhKhoangCach(Diem B) {
        /* 
            A ---------- B
            Diem A, B
            
            -> A.tinhKhoangCach(B) // this. = A
        */
        
        double kq;
        double dX = this.x - B.x;
        double dY = this.y - B.y;
        kq = Math.sqrt((dX * dX) + (dY * dY));
        return kq;
    }
}
