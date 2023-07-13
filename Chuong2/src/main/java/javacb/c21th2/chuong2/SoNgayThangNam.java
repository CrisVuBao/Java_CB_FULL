
package javacb.c21th2.chuong2;

import java.util.Scanner;
public class SoNgayThangNam {
    public static void main(String[] args) {
        // Nhập tháng năm. Cho biết tháng nhập có bao nhiêu ngày
        
        int thang, nam;
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        thang = S.nextInt();
        System.out.print("Nhap nam: ");
        nam = S.nextInt();
        
        // Dùng If Else
//        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
//            System.out.println("thang nhap co 31 ngay");
//        }
//        else if (thang ==4 || thang == 6 || thang == 9 || thang == 11){
//            System.out.println("thang nhap co 30 ngay");
//        }
//        else if (thang == 2) {
//            if(nam % 4 == 0 && nam % 100 !=0 || nam % 400 == 0) {
//                System.out.println("thang nhap có 29 ngay");
//            }
//            else {
//                System.out.println("thang nhap có 28 ngay");
//            }
//        }
//        else {
//            System.out.println("du lieu nhap khong hop le");
//        }
        
        // dùng Switch case
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
                break;
            case 2:
                if(nam % 4 == 0 || nam % 100 != 0 || nam % 400 == 0) {
                    System.out.println("thang co 29 ngay");
                }
                else {
                    System.out.println("thang co 28 ngay");
                }
            default:
                System.out.println("nhap du lieu khong hop le");
                break;
        }
        
                
        
        
    }
}
