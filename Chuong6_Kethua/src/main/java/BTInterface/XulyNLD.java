/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTInterface;

import BT3_ArrayListt_dahinh.*;

/**
 *
 * @author Cris_VuBao
 */
public class XulyNLD {
    public static void main(String[] args) {
        DanhSachNLD nldArr = new DanhSachNLD();
        nldArr.themNLD(new GiaoVien("Tran Win",new Ngay(10,10,2023),new Ngay(10,10,2023),10,10,10));
        nldArr.themNLD(new NhanVien("Chu tich","wow","MTP",new Ngay(10,10,2023),new Ngay(10,10,2023),10));
        nldArr.themNLD(new GiaoVien("Nguyen C",new Ngay(10,10,2023),new Ngay(10,10,2023),10,10,10));
        nldArr.themNLD(new NhanVien("Nhanvien","Nhan Vien","Ha Nhu",new Ngay(10,10,2023),new Ngay(10,10,2023),10));
        nldArr.themNLD(new GiaoVien("Window",new Ngay(10,10,2023),new Ngay(10,10,2023),10,10,10));
    
        nldArr.xuatThongTin();
    }
}
