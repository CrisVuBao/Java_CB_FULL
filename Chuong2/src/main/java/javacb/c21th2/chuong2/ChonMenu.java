
package javacb.c21th2.chuong2;

import java.util.Scanner;
public class ChonMenu {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("=            CHỌN MENU               =");
        System.out.println("=    1. Giải phương trình bậc 1      =");
        System.out.println("=    2. Giải phương trình bậc 2      =");
        System.out.println("=    3. Tính số ngày của tháng năm   =");
        System.out.println("=            4. Thoát                =");
        System.out.println("======================================");
        
        Scanner S = new Scanner(System.in);
        System.out.print("Chọn Menu: ");
        int chucNang = S.nextInt();
        
        switch(chucNang) {
            case 1:
                GiaiPhuongTrinhBac1();
                break;
            case 2:
                GiaiPhuongTrinhBac2();
                break;
            case 3:
                SoNgayThangNam();
                break;
            case 4:
                System.exit(0);
        }
    }
    
    /**/
    public static void GiaiPhuongTrinhBac1() {
        int a,b;
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = S.nextInt();
        System.out.print("Nhap b: ");
        b = S.nextInt();
        
        GiaiPT(a,b);
    }
    public static void GiaiPhuongTrinhBac2() {
        int a, b, c, delta;
        double x1, x2;
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = S.nextInt();
        System.out.print("Nhap b: ");
        b = S.nextInt();
        System.out.print("Nhap c: ");
        c = S.nextInt();
        
        if(a == 0) {
            GiaiPT(b,c);
        }
        else
        {
           delta = (b * b) - 4 * a * c;
           if(delta < 0) {
               System.out.println("phuong trinh vo nghiem");
           }
           else if(delta == 0) {
               x1 = -(double)b / (2 * a);
               System.out.printf("phuong trinh co nghiem kep x = %.2f", x1);
           }
           else if (delta > 0) {
               x1 = (-b + Math.sqrt(delta)/(2*a));
               x2 = (-b - Math.sqrt(delta)/(2*a));
               System.out.printf("phuong trinh co nghiem x1 = %.2f , x2 = %.2f", x1, x2);
           }
        }
        
    }
    public static void SoNgayThangNam() {
        int month;
        int year;
        Scanner S = new Scanner(System.in);
        System.out.print("input month: ");
        month = S.nextInt();
        System.out.print("input year: ");
        year = S.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("month have 31 day");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("month have 30 day");
        }
        else if (month == 2) {
            if(year % 4 == 0 || year % 100 != 0 || year % 400 == 0) {
                System.out.println("year have 29 day");
            }
            else {
                System.out.println("year have 28 day");
            }
        }
        else {
            System.out.println("input day error !");
        }
    }
    
    
    
    public static void GiaiPT(int a, int b) {
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            float x = -(float) b/a;
            System.out.printf("Phuong trinh co nghiem: %.2f ",x);
        }
    }
}
