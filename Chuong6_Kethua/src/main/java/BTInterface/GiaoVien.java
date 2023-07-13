/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTInterface;
import BT3_ArrayListt_dahinh.*;
import java.util.Scanner;

public class GiaoVien extends NguoiLaoDong{
    private int soGioVuot;
    private double tien1gio;

    public GiaoVien() {
    }

    public GiaoVien(String hoTen, Ngay ngaySinh, Ngay ngayVaoLam, float heSoLong, int soGioVuot, double tien1gio) {
        super(hoTen, ngaySinh, ngayVaoLam, heSoLong);
        this.soGioVuot = soGioVuot;
        this.tien1gio = tien1gio;
    }

    public int getSoGioVuot() {
        return soGioVuot;
    }

    public void setSoGioVuot(int soGioVuot) {
        this.soGioVuot = soGioVuot;
    }

    public double getTien1gio() {
        return tien1gio;
    }

    public void setTien1gio(double tien1gio) {
        this.tien1gio = tien1gio;
    }
    
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner S = new Scanner(System.in);
        System.out.print("\t+ So gio vuot: ");
        this.soGioVuot = S.nextInt();
        System.out.print("\t+ So tien vuot 1 gio: ");
        this.tien1gio = S.nextDouble();
    }
    
    @Override
    public double tinhThuNhap() {
        double lcb = 1490000 * this.heSoLong;
        double tvgio = this.soGioVuot * this.tien1gio;
        double tienpc = ((2023 - this.ngaySinh.getYear()) / 100)* lcb;
        return lcb + tvgio + tienpc;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" - So gio vuot: " + this.soGioVuot + " - Thu nhap: " + this.tinhThuNhap());
    }
       
}
