/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Dell
 */
public class HocSinhMauGiaoTT extends HocSinhTT{
    private int soNgayVang;

    public HocSinhMauGiaoTT(int soNgayVang, String maHS, String tenHS, String phai) {
        super(maHS, tenHS, phai);
        this.soNgayVang = soNgayVang;
    }

    public int getSoNgayVang() {
        return soNgayVang;
    }

    public void setSoNgayVang(int soNgayVang) {
        this.soNgayVang = soNgayVang;
    }

    @Override
    public String xepLoai() {
        return this.soNgayVang > 10 ?"suy dinh duong":"be khoe be ngoan";
    }

    @Override
    public void inHocSinh() {
        super.inHocSinh(); 
        System.out.println("ma :"+ this.maHS +"- ten hs:"+ this.tenHS +" -Xep loai :"+xepLoai());
    }
}
