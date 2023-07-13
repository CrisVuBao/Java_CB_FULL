/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class DongVat {
    protected String ten;
    protected String mau;

    public DongVat(String ten, String mau) {
        this.ten = ten;
        this.mau = mau;
    }
    public void an(){
        System.out.println("Dong vat biet an");
    }
    public void inThongTin(){
        System.out.println("ten :" +this.ten +"- Mau: "+this.mau); 
   }    
    
}
