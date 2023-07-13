
package c21th2.intro;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);         
        
        int a;
        int b;
        int c;
        
        System.out.print("Nhap so a: ");
        a = s.nextInt();
        System.out.print("Nhap so b: ");
        b = s.nextInt();
        
        c = a + b;
        System.out.println("sum: "+ c);
        
        
    }
}
