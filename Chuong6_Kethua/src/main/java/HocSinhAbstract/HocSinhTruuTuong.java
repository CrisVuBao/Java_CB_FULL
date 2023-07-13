/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocSinhAbstract;

public abstract class HocSinhTruuTuong {
    protected String maHS;
    protected String tenHS;
    protected String phai;

    public HocSinhTruuTuong(String maHS, String tenHS, String phai) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
    }
    
    
    
    public void inThongTin() {
        System.out.println("Ma: "+ this.maHS + "Ten: " + this.tenHS);
    }
    
    public abstract double tinhTrungBinh();
    
    public abstract String xepLoai();
}
