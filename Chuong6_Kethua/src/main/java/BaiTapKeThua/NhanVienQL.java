/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapKeThua;

public class NhanVienQL extends NhanVien{
    private int luongCB;
    private int phuCapChucVu;

    public NhanVienQL(String maNV, String hoTen, Ngay ngaySinh, int thuong,int luongCB, int phuCapChucVu) {
        super(maNV, hoTen, ngaySinh, thuong);
        this.luongCB = luongCB;
        this.phuCapChucVu = phuCapChucVu;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(int phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }
  
  
    
    // Method
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
         System.out.println(" - Thu nhap: " + this.tinhLuong());
    }
    
    @Override
    public int tinhLuong() {
         return this.luongCB + this.phuCapChucVu + this.thuong;
    }
}
