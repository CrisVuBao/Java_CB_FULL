/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On_XML;

/**
 *
 * @author Dell
 */
public class GiaoVienPhu extends NhanVien{
    protected int SoBuoiLam;
    protected int LuongCung;

    public GiaoVienPhu(int SoBuoiLam, int LuongCung, String MaNV, String TenNV, int tuoi) {
        super(MaNV, TenNV, tuoi);
        this.SoBuoiLam = SoBuoiLam;
        this.LuongCung = LuongCung;
    }

    public int getSoBuoiLam() {
        return SoBuoiLam;
    }

    public void setSoBuoiLam(int SoBuoiLam) {
        this.SoBuoiLam = SoBuoiLam;
    }

    public int getLuongCung() {
        return LuongCung;
    }

    public void setLuongCung(int LuongCung) {
        this.LuongCung = LuongCung;
    }

    @Override
    public void ThongTin() {
        super.ThongTin(); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public String InToanBo() {
        return "manv"+super.MaNV +", tennv:"+super.TenNV+", so buoi"+this.SoBuoiLam;
    }    
    @Override
    public float TinhLuong() {
        return getSoBuoiLam() * getLuongCung();
    }    

    
}
