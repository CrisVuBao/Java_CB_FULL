package javavb.c21th2.chuong_08;


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
public class HocSinh {
    private String maHS;
    private String tenHS;
    private int tuoi;

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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

    public void inHocSinh(){
        System.out.print("Ma:"+this.maHS+"- Ten:" +this.tenHS);
    }
    // khai bao tinh trung binh va xepLoai la tinh trung tuong
    public HocSinh(String maHS, String tenHS, int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
    }
    public String toString(){
        return "mahs:"+this.maHS +"-ho ten:"+this.tenHS +"-tuoi: "+this.tuoi;
    }
}
