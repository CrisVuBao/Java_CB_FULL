/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapkethua;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DanhSachNhanVIen implements ICapNhat<NhanVien>{
    private ArrayList<NhanVien> danhSachNV;
    public  DanhSachNhanVIen(){
        this.danhSachNV = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhSachNV() {
        return danhSachNV;
    }

    public void setDanhSachNV(ArrayList<NhanVien> danhSachNV) {
        this.danhSachNV = danhSachNV;
    }


    public void them(NhanVien nv) {
        this.danhSachNV.add(nv);
    }

    public void xoa(NhanVien nv ) {
        int vt = this.danhSachNV.indexOf(nv);
        this.danhSachNV.remove(vt);
    }

    public void in() {
        System.out.println("Danh Sach Nhan vien:");
        for(NhanVien hs:this.danhSachNV){
            hs.xuatThongTin();
        }
    }
}
