/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTInterface;

import BT3_ArrayListt_dahinh.*;
import java.util.ArrayList;

public class DanhSachNLD {
    private ArrayList<NguoiLaoDong> danhSachNLD;
    
    //Constructor

    public DanhSachNLD() {
        this.danhSachNLD = new ArrayList<>();
    }
    
    // Getter, Setter

    public ArrayList<NguoiLaoDong> getDanhSachNLD() {
        return danhSachNLD;
    }

    public void setDanhSachNLD(ArrayList<NguoiLaoDong> danhSachNLD) {
        this.danhSachNLD = danhSachNLD;
    }
    
    // method
//    public void tongSoNhanVien(NguoiLaoDong nv) {
//        for(NguoiLaoDong nv:this.danhSachNLD) {
//        
//        }
//    }
    
    public void themNLD(NguoiLaoDong nld) {
        this.danhSachNLD.add(nld);
    }
    
    public void xuatThongTin() {
        for(NguoiLaoDong nld:this.danhSachNLD) {
            nld.xuatThongTin();
        }
    }
}
