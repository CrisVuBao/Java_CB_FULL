/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinh {
    protected String maHS;
    protected String tenHS;
    protected String phai;
    public void inThongTin(){
        System.out.print("Ma:"+this.maHS+"- Ten:" +this.tenHS);
    }
    public double tinhTrungBinh(){
        return 0;
    }
    public String xepLoai(){
        return "";
    }
    public HocSinh(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
}
