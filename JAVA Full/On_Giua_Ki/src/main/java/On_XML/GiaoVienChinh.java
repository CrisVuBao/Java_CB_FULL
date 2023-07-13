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
public class GiaoVienChinh extends NhanVien{
    protected String Loai;
    protected Float Luong;
    public GiaoVienChinh(String Loai, float Luong, String MaNV, String TenNV, int tuoi) {
        super(MaNV, TenNV, tuoi);
        this.Loai = Loai;
        this.Luong = Luong;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
    
    @Override
    public void ThongTin() {
        super.ThongTin(); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public String InToanBo() {
        return "maNv"+super.MaNV +", tenNV:"+super.TenNV +", tuoi:" +super.tuoi +", luong:"+this.Luong +", loai:"+this.Loai;
    }    
    @Override
    public float TinhLuong() {
        return Luong;
    }    


}
