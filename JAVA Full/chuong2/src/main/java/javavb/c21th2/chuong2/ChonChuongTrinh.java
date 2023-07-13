/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong2;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class ChonChuongTrinh {
    public static void main(String[] args) {
        boolean ktra =true;
        do{
            int so;
            
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("chọn chuc nang chuong trinh:");
            System.out.println("1. Giai PT bac 1");
            System.out.println("2. Giai PT bac 2");
            System.out.println("3. So ngay trong thang nam");
            System.out.println("4. Ket thuc");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.print("Chon chuong trinh :");
            Scanner S= new Scanner(System.in);
            so= S.nextInt();
            switch(so){
                case 1:
                    PTB1();
                    break;
                case 2:
                    PTB2();
                    break;
                case 3:
                    ngaythang();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.print("Nhap sai du lieu");
                    break;
            }
        }while(ktra == true);
        
    }
    public static void PTB1(){
        int a,b;
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        a= S.nextInt();
        System.out.print("Nhap he so b:");
        b= S.nextInt();
        GiaiPT(a, b);
    }
    public static void GiaiPT(int a, int b){
        float x;
        if(a==0){
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            x=-(float)b/a;
            System.out.printf("Phuong trinh co nghiem x= %.2f",x);
        }         
    }
    public static void PTB2(){
        int a,b,c,delta;
        double x1,x2;
        
        Scanner S= new Scanner(System.in);
        System.out.print("Nhap he so a:");
        a= S.nextInt();
        System.out.print("Nhap he so b:");
        b= S.nextInt();
        System.out.print("Nhap he so c:");
        c= S.nextInt();
        if(a==0){
            //
            GiaiPT(b, c);
            //
        }else{
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta == 0){
                x1 = -(double)b / (2*a);
                System.out.printf("Phuong trinh co nghiem kep x= %.2f",x1);
            }
            if(delta > 0){
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.printf("Phuong trinh co nghiem x=%.2f,x2=%.2f",x1,x2);
            }
            
        }
        
    }
    public static void ngaythang(){
        int thang ,nam;
        Scanner S = new Scanner(System.in);
        System.out.print("Nhap thang:");
        thang= S.nextInt();
        System.out.print("Nhap nam :");
        nam= S.nextInt();
        switch(thang){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               System.out.println("Tháng có 31 ngay");
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("Tháng có 30 ngay");
               break;
           case 2:
                if(nam %4 ==0 && nam % 100 !=0 || nam %400 == 0 ){
                    System.out.println("Thang nhap co 29 ngay");
                }else{
                    System.out.println("Thang nhap co 28 ngay");
                }
                break;
            default:
               System.out.println("du lieu nhap khong hop le");
       }
    }
}
