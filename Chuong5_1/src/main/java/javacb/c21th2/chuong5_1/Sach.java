/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5_1;

import java.util.HashSet;

/* thực hiện bài tập QLSach 
            1. tạo class Sach gồm :
            1.1 Thuộc tính: tenSach, donGia, namXuatBan, tacGia
            1.2. phương thức:
             + xuatTenSach(): thông tin sách
             + xuatGiaBanSauGiam(double x) với x là %giảm giá
             + xuatCungNamXuatBan(Sach s2): trả về true nếu cùng năm, false nếu khác năm
           
            2. Tạo class TacGia gồm các thông tin: hoTen, ngaySinh có kiểu Ngay
            3. Tạo class Ngay gồm các thông tin: day, month, year
           */
public class Sach {
    private String tenSach;
    private double donGia;
    private int namXuatBan;
    private TacGia nguoiViet;

    public Sach(String tenSach, double donGia, int namXuatBan, TacGia nguoiViet) {
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.namXuatBan = namXuatBan;
        this.nguoiViet = nguoiViet;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getNguoiViet() {
        return nguoiViet;
    }

    public void setNguoiViet(TacGia nguoiViet) {
        this.nguoiViet = nguoiViet;
    }
    
    // Method
    public void xuatTenSach() {
        System.out.println(" - Ten Sach: " + this.tenSach);
    }
    
    public double giaBanSachSauGiam(double x) {
        return (1 - x/100) * this.donGia;
    }
    
    public boolean cungNamXuatBan(Sach s) {
        if(this.namXuatBan == s.namXuatBan) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean kiemTraNgaySinhGiongNhau(Sach ss) {
        if(this.nguoiViet.getNgaySinh().equals(ss.nguoiViet.getNgaySinh())) {
            return true;
        }
        else{
            return false;
        }
    }
}
