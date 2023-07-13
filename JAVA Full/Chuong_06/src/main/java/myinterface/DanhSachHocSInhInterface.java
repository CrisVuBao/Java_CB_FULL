/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DanhSachHocSInhInterface implements ICapNhat<HocSinhTT>{
    private ArrayList<HocSinhTT> danhSachHS;
    public  DanhSachHocSInhInterface(){
        this.danhSachHS = new ArrayList<>();
    }

    public ArrayList<HocSinhTT> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<HocSinhTT> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    public void in() {
    System.out.println("Danh Sach hoc sinh:");
        for(HocSinhTT hs:this.danhSachHS){
            hs.inHocSinh();
        }
    }

    public void them(HocSinhTT hs) {
        this.danhSachHS.add(hs);
    }
    public void xoa(HocSinhTT hs) {
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt); 
    }
}
