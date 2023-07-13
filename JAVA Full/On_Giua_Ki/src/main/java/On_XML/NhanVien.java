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
public abstract class NhanVien implements Comparable<NhanVien> {
    protected String MaNV;
    protected String TenNV;
    protected int tuoi;

    public NhanVien(String MaNV, String TenNV, int tuoi) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void ThongTin(){
        System.out.println("MaNV:"+ getTenNV()+"-TenNV:"+getTenNV()+"- TuoiNV:"+getTuoi());
    }
    public abstract String InToanBo();
    public abstract float TinhLuong();    
    @Override
    public  int compareTo(NhanVien nv){
        return this.getTenNV().compareTo(nv.getTenNV());
    }
}
