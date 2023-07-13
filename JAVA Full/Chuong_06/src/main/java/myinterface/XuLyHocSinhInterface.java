/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

/**
 *
 * @author Dell
 */
public class XuLyHocSinhInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachHocSInhInterface dshs = new DanhSachHocSInhInterface();
        dshs.them(new HocSinhCap1TT("001", "nguyen cap 1 B", "Nam", 8, 10));
        dshs.them(new HocSinhCap1TT("002", "nguyen cap 1 A", "Nam", 9, 6));
        dshs.them(new HocSinhCap1TT("003", "nguyen cap 1 D", "Nam", 6, 8));
        dshs.them(new HocSinhCap1TT("004", "nguyen cap 1 E", "Nam", 8, 7));
        
        dshs.them(new HocSinhMauGiaoTT(19,"005", "nguyen mau giao", "Nam"));
        dshs.them(new HocSinhMauGiaoTT(3,"006", "nguyen mau giao so 2", "Nu"));
        System.out.println("Truoc khi xoa hoc sinh trong danh sach");
        dshs.in();
        System.out.println("Danh sach hoc sinh sau khi xoa");
        HocSinhTT hsXoa = dshs.getDanhSachHS().get(1);
        dshs.xoa(hsXoa);
        dshs.in();
    }
    
}
