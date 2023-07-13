
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
public class Diem {
    //Biến thành phần
    double x,y;
    //Hàm thành phần
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap hoanh do:");
        this.x = s.nextDouble();
        System.out.print("Nhap tung do:");
        this.y = s.nextDouble();
    }
    public void xuat(){
        System.out.printf("Diem co toa do(%f,%f)",this.x,this.y);
    }
    public double TinhKhoangcach(Diem B){
        double kq;
        double dX = this.x - B.x;
        double dY = this.y - B.y;
        kq = Math.sqrt(dX * dX + dY *dY);
        return kq;
    }
}
