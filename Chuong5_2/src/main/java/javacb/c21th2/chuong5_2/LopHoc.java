/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_2;

public class LopHoc {
    //Field
    private String tenLop;
    private Khoa khoa;

    // Contrucstor

    public LopHoc(String tenLop, Khoa khoa) {
        this.tenLop = tenLop;
        this.khoa = khoa;
    }
    
    //Getter, Setter

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
    
}
