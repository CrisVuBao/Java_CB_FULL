/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5;
//import java.util.Scanner;

public class LoadDate2 {
    public static void main(String[] args) {
//        int d, m, y;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Input Day: ");
//        d = s.nextInt();
//        System.out.println("Input Day: ");
//        m = s.nextInt();       
//        System.out.println("Input Day: ");
//        y = s.nextInt();
//        
//        MyDate2 mD2 = new MyDate2();
//        mD2.outputFull();

           // Ex get, set
           MyDate2 mD2_2 = new MyDate2(10,10,2000);
           mD2_2.outputFull();
           
           mD2_2.setDay(11);
           mD2_2.setYear(2023);
           mD2_2.outputFull();
           
           /* thực hiện bài tập QLSach 
            1. tạo class Sach gồm :
            1.1 Thuộc tính: tenSach, donGia, namXuatBan, tacGia
            1.2. phương thức:
             + xuatTenSach(): thông tin sách
             + xuatGiaBanSauGiam(double x) với x là %giảm giá
             + xuatCungNamXuatBan(Sach s2): trả về true nếu cùng năm, false nếu khác năm
           
            2. Tạo class TacGia gồm các thông tin: hoTen, ngaySinh có kiểu Ngay
            3. Tạo class Ngay gồm các thông tin: day, month, year
           */

    }
}
