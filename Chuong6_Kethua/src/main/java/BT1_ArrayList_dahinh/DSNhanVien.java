/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_ArrayList_dahinh;

import java.util.ArrayList;

public class DSNhanVien {
    private ArrayList<NhanVien> danhSachNV; 

    public DSNhanVien() {
        this.danhSachNV = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(ArrayList<NhanVien> danhSachNV) {
        this.danhSachNV = danhSachNV;
    }
    
    // Method
    public void themNV(NhanVien nv) {
        this.danhSachNV.add(nv);
    }
    
    public void xoaNV(NhanVien nv) {
        int viTri = this.danhSachNV.indexOf(nv);
        this.danhSachNV.remove(viTri);
    }
    
    public void inDanhSach() {
        System.out.println("Danh sach nhan vien: ");
        for(NhanVien hs:this.danhSachNV) {
            hs.xuatThongTin();
        }
    }
}
