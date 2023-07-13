/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import java.io.Serializable;

public class HocSinh implements Serializable{
    private String maHS,tenHS;
    private int tuoi;

    public HocSinh(String maHS, String tenHS,int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.tuoi = tuoi;
    }

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

    

    @Override
    public String toString() {
        return "MaHS: " + this.maHS + " - Ho ten: " + this.tenHS + " - Tuoi: " + this.tuoi;
    }
    
}