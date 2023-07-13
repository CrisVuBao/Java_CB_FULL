/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong8;

public class HocSinh {
    private String maHS, tenHS;
    private int tuoi;
    
    
    // Constructor

    public HocSinh(String maHS, String tenHS, int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
    }
    
    // Getter, setter

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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void xuatThongTin() {
        
    }
}
