/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_2;

/**
 *
 * @author Cris_VuBao
 */
public class Khoa {
    // Field
    private String tenKhoa, diaChi;
    
    // Contrucstor

    public Khoa(String tenKhoa, String diaChi) {
        this.tenKhoa = tenKhoa;
        this.diaChi = diaChi;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
