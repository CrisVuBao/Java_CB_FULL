/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Tính diện tính và chu vi của đường tròn
 */
public class Thi_du_4 {
    public static void main(String[] args) {
        DuongTron dt = new DuongTron();
        System.out.println("hap thong tin duong tron");
        dt.nhap();
        dt.Xuat();
        System.out.println("Chu vi duong tron :"+dt.tinhChuVi());
        System.out.println("Dien tich duong tron :"+dt.tinhDienTich());

    }
}
