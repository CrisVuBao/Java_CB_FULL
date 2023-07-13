/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong6_kethua;

/**
 *
 * @author Cris_VuBao
 */
public class Cho extends DongVat {
    // Field
    private int soChan;

    // Constructor
    public Cho (String ten, String mau, int soChan) {
        super(ten, mau);
        this.soChan = soChan;
    }
    
    // get, set
    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    
    
    // Method
    public void sua() {
        System.out.println("cho sua");
    }
    
    @Override // overloading: tạo các method cùng tên, khác tham số trong cùng 1 class
              // overridding: các các medthod cùng tên, cùng tham số trong class cha và class con
    public void inThongTin() { // nếu Method con giống cha, method con sẽ ghi đè lên method cha
        System.out.println("so chan: " + soChan);
    }
}
