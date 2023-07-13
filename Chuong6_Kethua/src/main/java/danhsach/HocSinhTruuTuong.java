/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsach;

import HocSinhAbstract.*;

public abstract class HocSinhTruuTuong {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinhTruuTuong(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }

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
    
    
    
    
    public void inHocSinh() {
        System.out.println("Ma: "+ this.maHS + "Ten: " + this.tenHS);
    }
    
    public abstract double tinhTrungBinh();
    
    public abstract String xepLoai();
}
