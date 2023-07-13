/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class MyDate2 {
    private int day = 1;
    private int month=1;
    private int year=1;
    
    public MyDate2(int d , int m ,int y){
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
    // tạo hàm get set với thuộc tính
    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        if(d>1 && d<=31){
            this.day = d;
        }
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int m){
        if(m>1 && m<=12){
            this.month = m;
        }
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
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
    
}
