/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Cris_VuBao
 */
public class HocSinhMauGiaoTT extends HocSinhTruuTuong{
    private int soNgayVang;

    public HocSinhMauGiaoTT(String maHS, String tenHS, String phai, int soNgayVang) {
        super(maHS, tenHS, phai);
        this.soNgayVang = soNgayVang;
    }

    public int getSoNgayVang() {
        return soNgayVang;
    }

    public void setSoNgayVang(int soNgayVang) {
        this.soNgayVang = soNgayVang;
    }

    @Override
    public String xepLoai() {
        return this.soNgayVang < 10 ? "tot" : "chua tot";
    }
    
    
}
