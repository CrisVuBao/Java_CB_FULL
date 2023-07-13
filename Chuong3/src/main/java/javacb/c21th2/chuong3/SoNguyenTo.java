
package javacb.c21th2.chuong3;

import java.util.Scanner;
public class SoNguyenTo {
    public static void main(String[] args) {
        // số nguyên tố là số lớn hơn 1 thỏa điều kiện chia hết cho 1 và cho chính nó
        // dùng vòng lặp while để xác định số nhập vào có nguyên tố hay không
        int so;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so: ");
        so = s.nextInt();
        for (int i = 2; i <= so / 2; i++) {
            if(so % i == 0) {
                System.out.println("khong phai so nguyen to");
                break;
            }
            else{
                System.out.println(so + " la so nguyen to");
            }
        }
    }
}
