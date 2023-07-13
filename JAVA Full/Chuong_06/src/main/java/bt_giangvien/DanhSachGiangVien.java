/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_giangvien;

import java.util.ArrayList;


/**
 *
 * @author Dell
 */
public class DanhSachGiangVien implements ICapNhat<GiangVien>{
    private ArrayList<GiangVien> danhSachGV;
    public  DanhSachGiangVien(){
        this.danhSachGV = new ArrayList<>();
    }

    public ArrayList<GiangVien> getDanhSachGV() {
        return danhSachGV;
    }

    public void setDanhSachGV(ArrayList<GiangVien> danhSachGV) {
        this.danhSachGV = danhSachGV;
    }


    public void them(GiangVien gv) {
        this.danhSachGV.add(gv);
    }

    public void xoa(GiangVien gv) {
        int vt = this.danhSachGV.indexOf(gv);
        this.danhSachGV.remove(vt);
    }

    public void in() {
        System.out.println("Danh Sach giang vien:");
        for(GiangVien hs:this.danhSachGV){
            hs.xuatThongTin();
        }
    }
}
