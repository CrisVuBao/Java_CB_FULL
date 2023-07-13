
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
public class MyDate {
    private int day = 1;
    private int month=1;
    private int year=1;
    
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ngay:");
        int d = s.nextInt();
        if(d>1 && d<=31){
            this.day = d;
        }
        System.out.print("Nhap thang:");
        int m = s.nextInt();
        if(m>1 && m<=12){
            this.month = m;
        }
        System.out.print("Nhap nam:");
        int y = s.nextInt();
        if(y>=2000 ){
            this.year = y;
        }
    }
    public void xuatngay(){
        System.out.println("Ngay nhap:"+this.day);       
    }
    public void xuatthang(){
        System.out.println("Ngay thang:"+this.month);         
    }
    public void xuatnam(){
        System.out.println("Ngay nam:"+this.year);            
    }
    public void xuatngaythangnam(){
        System.out.println("Ngay thang nam:"+this.day +" _ " +this.month +" _ "+this.year);            
    }
    
    // sử dụng overloading
    public void nhapThongTin(int d, int m, int y){
        if(d>1 && d<=31){
            this.day = d;
        }
        if(m>1 && m<=12){
            this.month = m;
        }
        if(y>=2000 ){
            this.year = y;
        }
    }    
}
