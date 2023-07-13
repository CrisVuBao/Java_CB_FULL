
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
public class phuongTrinhBac1 {
    // bien thanh phan
    int a,b;
    // ham thanh phan
    public void nhap(){
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        this.a= S.nextInt();
        System.out.print("Nhap he so b:");
        this.b= S.nextInt();
    }
    private String giaiPT(){
        String kq="";
        if(this.a==0){
            if (this.b==0) {
                kq ="Phuong trinh vo so nghiem";
            }else{
                kq="Phuong trinh vo nghiem";
            }
        }else{
            float x = -(float)this.b/this.a;
            kq="Phuong trinh co nghiem x= "+x;
        }
        return kq;
    }
    public void Xuat(){
        System.out.println(giaiPT());
    }
}
