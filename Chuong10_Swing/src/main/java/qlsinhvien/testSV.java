/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsinhvien;

/**
 *
 * @author Cris_VuBao
 */
public class testSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienList dssv = new SinhVienList();
        dssv.DocDanhSachSinhVien();
        for(SinhVien sv : dssv.getSinhVienList()) {
            System.out.println(sv);
        }
    }
    
}
