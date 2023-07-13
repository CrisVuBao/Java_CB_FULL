/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong4;

/**
 *
 * @author Cris_VuBao
 */
public class ThiDu3 {
    public static void main(String[] args) {
        // Khởi tạo và nhập các điểm A, B
        Diem A = new Diem();
        A.nhap();
        Diem B = new Diem();
        B.nhap();
        
        // Xuất thong tin các điểm A, B
        A.xuat();
        B.xuat();
        
        // Tính khoảng cách giữa 2 điểm A, B;
        double d = A.tinhKhoangCach(B);
        System.out.println(" khoang cach AB: " + d);
    } 
}
