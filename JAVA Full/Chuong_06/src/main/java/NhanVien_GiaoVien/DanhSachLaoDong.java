/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DanhSachLaoDong implements ICapNhat<NguoiLaoDong>{
    private ArrayList<NguoiLaoDong> danhSachLD;
    public  DanhSachLaoDong(){
        this.danhSachLD = new ArrayList<>();
    }

    public ArrayList<NguoiLaoDong> getDanhSachlD() {
        return danhSachLD;
    }

    public void setDanhSachLD(ArrayList<NguoiLaoDong> danhSachLD) {
        this.danhSachLD = danhSachLD;
    }
    public float TinhTongThuNhap(){
        float tongthunhap =0;
        for(NguoiLaoDong ld:this.danhSachLD){
            tongthunhap += ld.thunhap();
        }
        return tongthunhap;
    }
    public int TongLaoDong(){
        return danhSachLD.size();
    }
    public void ThongTinNguoiThuNhapLonNhat(){
        float thunhap=0;
        int maNguoiLaoDong=0;
        for(NguoiLaoDong ld:this.danhSachLD){
            if (thunhap < ld.thunhap()) {
                thunhap = ld.thunhap();
                maNguoiLaoDong = this.danhSachLD.indexOf(ld);
            }
        }
        
    }

    @Override
    public void them(NguoiLaoDong ld) {
        this.danhSachLD.add(ld);
    }

    @Override
    public void xoa(NguoiLaoDong ld) {
        int vt = this.danhSachLD.indexOf(ld);
        this.danhSachLD.remove(vt);    
    }

    @Override
    public void in() {
        System.out.println("Danh Sach lao dong:");
        for(NguoiLaoDong ld:this.danhSachLD){
            ld.XuatThongTin();
        }
    }
}
