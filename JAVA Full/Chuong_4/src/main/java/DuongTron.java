
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class DuongTron {
    //Biến thành phần
    double bk;
    Diem tam;
    //Hàm thành phần
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ban kinh");
        this.bk = s.nextDouble();
        System.out.print("Nhap toạ độ");
        this.tam = new Diem();
        this.tam.nhap();        
    }
    public void Xuat(){
        System.out.printf("\n Duong tron co tam 0(%.2f,%.2f) \n",this.tam.x,this.tam.y);
    }
    public double tinhChuVi(){
        return 2*3.14*this.bk;
    }
    public double tinhDienTich(){
        return 3.14* this.bk * this.bk;
    }
}
