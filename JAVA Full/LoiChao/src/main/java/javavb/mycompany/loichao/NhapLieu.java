
package javavb.mycompany.loichao;

import java.util.Scanner;


public class NhapLieu {
    public static void main(String[] args) {
        String hoTen , xepLoai;
        int tuoi;
        double diem;
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = s.nextInt();
        System.out.print("Nhap diem: ");
        diem = s.nextDouble();
        s.nextLine();
        System.out.print("Xep loai: ");
        xepLoai = s.nextLine();
        System.out.printf("Ho ten: %s - Tuoi: %d -Diem thi : %.2f -Xep loai : $s",hoTen,tuoi,diem,xepLoai);
        
    }
}
