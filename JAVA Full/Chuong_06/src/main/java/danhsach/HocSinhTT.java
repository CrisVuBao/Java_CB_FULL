package danhsach;

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

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }
    public void inHocSinh(){
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
