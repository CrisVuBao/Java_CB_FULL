/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocSinhCap2_override;

public class HocSinh {
    
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinh(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
    
    
    
    public void inThongTin() {
        System.out.println("Ma: "+ this.maHS + "Ten: " + this.tenHS);
    }
    
    public double tinhTrungBinh() {
        return 0;
    }
    
    public String xepLoai() {
        return "";
    }
}
