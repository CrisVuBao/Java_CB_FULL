
package javavb.mycompany.loichao;
public class HamToanHoc {
    public static void main(String[] args) {
        int a =10 , b =15;
        double p = 3.145775D; //Làm tròn đén 2 chữ số thập phân ???
        
        //Random
        double randomValue = Math.random() * 100;
        int result = (int) randomValue;
        System.out.println("Gia trị ramdom tu 1 den 100 la: " + result);
        System.out.println("So lon nhat: " + Math.max(a,b));
        System.out.println("So sau khi lam tron: "+ Math.round(p *  1) / 10.0);
    }
}