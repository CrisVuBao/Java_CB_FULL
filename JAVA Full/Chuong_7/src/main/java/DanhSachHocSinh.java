/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DanhSachHocSinh {
    private ArrayList<HocSinhTT> danhSachHS;
    public  DanhSachHocSinh(){
        this.danhSachHS = new ArrayList<>();
    }

    public ArrayList<HocSinhTT> getDanhSachHS() {
        return danhSachHS;
    }

    public void setDanhSachHS(ArrayList<HocSinhTT> danhSachHS) {
        this.danhSachHS = danhSachHS;
    }
    public void themHS(HocSinhTT hs){
        this.danhSachHS.add(hs);
    }
    public  void xoaHS(HocSinhTT hs){
        // xoá dựa trên chỉ số
        //this.danhSachHS.remove(hs);
        // xoá theo chỉ số
        int vt = this.danhSachHS.indexOf(hs);
        this.danhSachHS.remove(vt);
    }
    public void inDanhSachhHS(){
        System.out.println("Danh Sach hoc sinh:");
        for(HocSinhTT hs:this.danhSachHS){
            hs.inHocSinh();
        }
    }
}
