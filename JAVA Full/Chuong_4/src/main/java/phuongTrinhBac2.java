
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
public class phuongTrinhBac2 {
    int a,b,c,delta;
    double x1,x2;
    public void nhap(){
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        this.a= S.nextInt();
        System.out.print("Nhap he so b:");
        this.b= S.nextInt();
        System.out.print("Nhap he so c:");
        this.c= S.nextInt();
    }
    private String giaiPTB2(){
        String kq="";
        if(this.a==0){
            phuongTrinhBac1 ptb1 = new phuongTrinhBac1();
            ptb1.a = this.b;
            ptb1.b =this.c;
            ptb1.Xuat();
        }else{
            delta = this.b*this.b - 4*this.a*this.c;
            if(this.delta < 0){
                kq="Phuong trinh vo nghiem";
            }
            if(this.delta == 0){
                this.x1 = -(double)this.b / (2*this.a);
                kq="Phuong trinh co nghiem kep x="+x1;
            }
            if(this.delta > 0){
                this.x1 = (-b + Math.sqrt(delta))/(2*this.a);
                this.x2 = (-b - Math.sqrt(delta))/(2*this.a);
                kq="Phuong trinh co nghiem x1=" + this.x1 + " x2= "+ this.x2;
            }
        }
        return kq;
    }
    public void xuat(){
        System.out.println(giaiPTB2());
    }
}
