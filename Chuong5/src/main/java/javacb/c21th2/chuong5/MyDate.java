
package javacb.c21th2.chuong5;
import java.util.Scanner;

public class MyDate {
    // Field
    private int day;
    private int month;
    private int year;
    
    // Method
    public void inputInfo() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input Day: ");
        day = s.nextInt();
        int d = 1;
        if(d >= 1 && d <=31) {
            this.day = d;
        } 
        
        System.out.print("Input Month: ");
        month = s.nextInt();
        int m = 1;
        if(m >= 1 && m <= 12) {
            this.month = m;
        }
        
        System.out.print("Input Year: ");
        year = s.nextInt();
        int y = 1;
        if(y > 2000) {
            this.year = y;
        }
    }
    
    public void outputDay() {
        System.out.println("Day: "+ this.day);
    }
  
    public void outputMonth() {
        System.out.println("Day: "+ this.month);
    }

    public void outputYear() {
        System.out.println("Day: "+ this.year);
    }
}
