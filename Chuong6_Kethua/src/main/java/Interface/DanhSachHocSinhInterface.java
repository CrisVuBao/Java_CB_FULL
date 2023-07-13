/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.ArrayList;

public class DanhSachHocSinhInterface {
    private ArrayList<danhsach.HocSinhTruuTuong> danhSachHS;
    
    public DanhSachHocSinhInterface() {
        this.danhSachHS = new ArrayList<>();
    }

    public ArrayList<danhsach.HocSinhTruuTuong> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<danhsach.HocSinhTruuTuong> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    
    // Method
    public void themHS(danhsach.HocSinhTruuTuong hs) {
        this.danhSachHS.add(hs);
    }
    
    public void xoaHS(danhsach.HocSinhTruuTuong hs) {
        // xóa theo chỉ số (vt : vị trí)
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt);
    }
    
    public void inDanhSachHS() {
        System.out.println("Danh sach hoc sinh: ");
        for(danhsach.HocSinhTruuTuong hs:this.danhSachHS) {
            hs.inHocSinh();
        }
    }
}
