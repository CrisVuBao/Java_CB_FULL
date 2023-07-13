
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class XuLyChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "COMPUTER";
        String sa = "     computer";
        // trích chuỗi con trong 1 chuỗi
        String s1 = s.substring(3, 6);
        System.out.println("chuoi tu vi tri thu 3 den truoc vi tri so 6 :"+s1); // PUT
        String s2 = s.substring(3);
        System.out.println("chuoi tu vi tri thu 3 den den het chuoi :"+s2);
        String s3 = s.substring(0,3);
        System.out.println("Chuoi lay 3 ky tu :"+s3);
        // lấy từ bên phải 3 ký tự
        int doDai = s.length();
        String s4 =s.substring(doDai -3);
        System.out.println(s4);
        
        // các hàm trim toUpperCase , toLowerCase
        String s5 = sa.trim(); // cắt các khoảng trắng thừa ở đầu và cuối chuỗi
        
        System.out.println("Sau khi cắt khoảng trắng thừa :"+s5); 
        String s6 = s5.toUpperCase();
        System.out.println("Doi chu thuong sang chu in " + s6);
        System.out.println("Doi chu in sang chu thuong "+ s6.toLowerCase());
        
        // hàm replaceALl => tìm và thay thế chuỗi con
        String chuoiCha ="Hello các bạn. Các ban co Hello ko";
        String chuoiCon ="Hello";
        String chuoiThayThe="GoodBye";
        String chuoiKQ =chuoiCha.replaceAll(chuoiCon, chuoiThayThe);
        System.out.println(chuoiKQ);
        
        // tìm vị tri bắt đầu của chuỗi con trong chuỗi cha
        int vt = chuoiCha.indexOf(chuoiCon);
        System.out.println("Vu tru bat dau cua chuoi con Hello :"+vt); // vị tri đầu tiên tìm thấy được
        int vt2 = chuoiCha.lastIndexOf(chuoiCon);
        System.out.println("Vu tru bat dau cua chuoi con Hello :"+vt2);
        // ứng dụng ; Cho một chuỗi chứa họ và tên một người .In ra tên của người đó
        // tìm vị trí của khoảng trắng cuối cùng trong chuoi ho ten
        // lấy trong chuoi ho ten tu vi tri tim duoc +1 den het chuoi
        String hoTen ="Nguyen Thi Hong Loan Phung";
        int vt3 = hoTen.lastIndexOf(" ");
        String ten = hoTen.substring(vt3 +1);
        System.out.println("ten: "+ten);
        
        // sử dụng split để chuyển chuỗi thành mảng với các phần tử theo ký tự phân cách các từ trong chuỗi
        String Chuoi = "A01|Le Van Hung|Nam|200000";
        String[] mangTach = Chuoi.split("\\|");
        System.out.println(Arrays.toString(mangTach));
        
   }
    
}
