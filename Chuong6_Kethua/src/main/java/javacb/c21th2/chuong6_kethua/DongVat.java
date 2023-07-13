/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong6_kethua;

public class DongVat {
    // Field
    protected String ten;
    protected String mau;
    
    //

    public DongVat(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
    
    
    // Method
    public void eat() {
        System.out.println("an");
    }
    
    public void inThongTin() {
        System.out.println("ten: " + ten + "mau: " + mau);
    }
}
