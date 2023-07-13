/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2_ArrayList_dahinh;

import java.util.ArrayList;

public class DanhSachGiangVien {
    private ArrayList<GiangVien> dsGiangVien;
    
    // Constructor
    public DanhSachGiangVien() {
        this.dsGiangVien = new ArrayList<>();
    }
   
    //Getter, Setter
    public ArrayList<GiangVien> getDsGiangVien() {    
        return dsGiangVien;
    }
    
    public void setDsGiangVien(ArrayList<GiangVien> dsGiangVien) {    
        this.dsGiangVien = dsGiangVien;
    }

    // Method
    public void themGiangVien(GiangVien gv) {
        this.dsGiangVien.add(gv);
    }
    
    public void xoaGiangVien(GiangVien gv) {
        int viTri = this.dsGiangVien.indexOf(gv);
        this.dsGiangVien.remove(viTri);
    }
    
    public void inDanhSach() {
        System.out.println("Danh sach giang vien: ");
        for(GiangVien gv:this.dsGiangVien) {
            gv.xuatThongTin();
        }
    }
}
