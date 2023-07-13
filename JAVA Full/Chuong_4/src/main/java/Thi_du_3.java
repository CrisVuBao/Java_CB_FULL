/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Thi_du_3 {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin diem A");
        Diem A = new Diem();
        A.nhap();
        A.xuat();
        System.out.println("Nhap thong tin diem B");
        Diem B = new Diem();
        B.nhap();
        B.xuat();
        System.out.print("Diem co khoang cach la:"+ B.TinhKhoangcach(A));
    }
}
