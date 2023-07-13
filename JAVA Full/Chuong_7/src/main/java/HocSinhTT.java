
import java.util.Comparator;



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
public abstract class HocSinhTT implements Comparable<HocSinhTT>{
    protected String maHS;
    protected String tenHS;
    protected String phai;
    protected int tuoi;

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
    public String returnTen() {
        int lastKhoangTrang = this.tenHS.lastIndexOf(" ");
        String ten = this.tenHS.substring(lastKhoangTrang + 1);
        return ten;
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
    public HocSinhTT(String maHS, String tenHS, String phai,int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
        this.tuoi=tuoi;
    }

    @Override
    public String toString() {
        return "MaHS: "+this.maHS +"- Ho ten: "+this.tenHS +"Tuoi:"+this.tuoi;
    }

    @Override
    public  int compareTo(HocSinhTT hs){
        return this.returnTen().compareTo(hs.returnTen());
    }
    public static Comparator<HocSinhTT> comparaByHoTen(){
        return Comparator.comparing(HocSinhTT::getTenHS);
    }
    public static Comparator<HocSinhTT> comparaByTuoi(){
        return Comparator.comparing(HocSinhTT::getTuoi);
    }

}
