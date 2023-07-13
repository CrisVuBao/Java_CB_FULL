/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_thu_vien;

import java.util.ArrayList;

public class DanhSachHocSinhInterface {
    private ArrayList<HocSinhTruuTuong> danhSachHS;
    
    public DanhSachHocSinhInterface() {
        this.danhSachHS = new ArrayList<>();
    }

    public ArrayList<HocSinhTruuTuong> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<HocSinhTruuTuong> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    
    // Method
    public void themHS(HocSinhTruuTuong hs) {
        this.danhSachHS.add(hs);
    }
    
    public void xoaHS(HocSinhTruuTuong hs) {
        // xóa theo chỉ số (vt : vị trí)
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt);
    }
    
//    public String toString() {
//        return "tên: " + 
//    }
    
    public void inDanhSachHS() {
        System.out.println("Danh sach hoc sinh: ");
        for(HocSinhTruuTuong hs:this.danhSachHS) {
            
        }
    }
}
