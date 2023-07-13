
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinh {
    // biến thành phần (field - trường)
    String hoTen;
    float diemVan,diemToan;
    //Hàm thành phần(method- phương thức)
    public void Nhap(){
        Scanner s = new Scanner(System.in);        
        System.out.print("Nhap ho ten học sinh");
        this.hoTen = s.nextLine();
        System.out.print("Nhap diem van");
        this.diemVan = s.nextFloat();
        System.out.print("Nhap diem toan");
        this.diemToan = s.nextFloat();
    }
    private double tinhTrungBinh(){
        return (this.diemVan + this.diemToan)/2;
    }
    private String tinhXepLoai(){
        String kq="";
        double dtb = tinhTrungBinh();
        if (dtb >= 9) {
            kq ="xuat sac";
        }
        else if(dtb >= 8){
            kq="gioi";
        }else if(dtb >=7){
            kq ="kha";
        }else if(dtb >=5){
            kq="Trung binh";
        }else{
            kq="yeu";
        }
        return kq;
    }
        
    public void xuat(){
        System.out.printf("\n Hoc sinh: %s - Diem trung binh: %.2f - Xep loai: %s \n",this.hoTen,this.tinhTrungBinh(),this.tinhXepLoai());
    }
}
