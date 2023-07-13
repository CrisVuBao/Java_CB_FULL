/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On_XML;

import java.util.ArrayList;


/**
 *
 * @author Dell
 */
public class DanhSachNhanVien implements ICapNhat<NhanVien>{
    private ArrayList<NhanVien> danhSachNV;
    public  DanhSachNhanVien(){
        this.danhSachNV = new ArrayList<>();
    }

    public ArrayList<NhanVien> getDanhSachGV() {
        return danhSachNV;
    }

    public void setDanhSachGV(ArrayList<NhanVien> danhSachGV) {
        this.danhSachNV = danhSachGV;
    }


    public void them(NhanVien gv) {
        this.danhSachNV.add(gv);
    }

    public void xoa(NhanVien gv) {
        int vt = this.danhSachNV.indexOf(gv);
        this.danhSachNV.remove(vt);
    }

    public void in() {
        System.out.println("Danh Sach giang vien:");
        for(NhanVien hs:this.danhSachNV){
            hs.InToanBo();
        }
    }
}
