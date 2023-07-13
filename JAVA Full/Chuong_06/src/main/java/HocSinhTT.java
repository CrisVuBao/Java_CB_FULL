/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
//khai bao class tru tuong
public abstract class HocSinhTT {
    protected String maHS;
    protected String tenHS;
    protected String phai;
    public void inThongTin(){
        System.out.print("Ma:"+this.maHS+"- Ten:" +this.tenHS);
    }
    // khai bao tinh trung binh va xepLoai la tinh trung tuong
    public abstract double tinhTrungBinh();
    public abstract String xepLoai();
    public HocSinhTT(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
}
