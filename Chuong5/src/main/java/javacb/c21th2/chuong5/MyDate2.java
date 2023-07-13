/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong5;
//import java.util.Scanner;

public class MyDate2 {
    // Field
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    // Contructor
    public MyDate2(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
    
    // Create function get, set with properties
    public int getDay() {
        return this.day;
    }
    public void setDay(int d) {
        if(d > 1 && d <= 31) {
            this.day = d;
        }
    }
    
    public int getYear() {
        return this.year;
    }
    public void setYear(int y) {
        if(y > 2000) {
            this.year = y;
        }
    }
    
    public void outputDay() {
        System.out.println("Day: " + this.day);
    }
    
    public void outputMonth() {
        System.out.println("Month: " + this.month);
    }
    
    // Method
    public void outputYear() {
        System.out.println("Year: " +  this.year);
    }
    
    public void outputFull() {
        System.out.println(" " +  this.day + "/" + this.month + "/" + this.year);
    }
}
