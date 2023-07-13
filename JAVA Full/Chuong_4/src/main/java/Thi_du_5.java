/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nhap thong tin hoc sinh :hoTen,DiemVan,DiemToan
 * Tính và xuất thông tin với điểm trung bình và xếp loại 
 */
public class Thi_du_5 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        System.out.println("Nhap thong tin hoc sinh");
        hs.Nhap();
        hs.xuat();
    }
}
