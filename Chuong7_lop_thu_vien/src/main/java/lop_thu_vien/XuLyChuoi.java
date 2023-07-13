/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lop_thu_vien;

import java.util.Arrays;

/**
 *
 * @author Cris_VuBao
 */
public class XuLyChuoi {
    public static void main(String[] args) {
        String s = "JAVAPROVIP";
        String sa = "            window";
        
        // Lấy chuỗi con trong một chuỗi
        String s1 = s.substring(3,6); // lấy từ kí tự thứ 3 đến trước kí tự thứ 6
        System.out.println(s1);
        String s2 = s.substring(3);
        System.out.println("lay tu vi tri thu 3 cho den het: " + s2);
        
        int doDai = s.length();
        String s4 = s.substring(doDai - 3);
        System.out.println("Lấy từ bên phải ra 3 ký tự: " + s4);
        
        String s5 = sa.trim(); // Cắt các khoảng trắng thừa ở đầu và cuối chuỗi
        System.out.println(s5);
        
        // ReplaceAll => tìm và thay chuỗi con
        String chuoiCha = "chao cac ban nhe";
        String chuoiCon = "chao";
        String chuoiThay = "Wow";
        String chuoiKQ = chuoiCha.replaceAll(chuoiCon, chuoiThay);
        System.out.println(chuoiKQ);
        
        // !!! Quan Trọng: Tìm vị trí bắt đầu của chuỗi con trong chuỗi cha
        int vt = chuoiCha.indexOf(chuoiCon);
        System.out.println("Vị trí bắt đầu của chuỗi con Hello: " + vt);
        // Vị trí cuối cùng của chuỗi con trong chuỗi cha
        int vt2 = chuoiCha.lastIndexOf(chuoiCon);
        System.out.println("vi tri: " + vt2);
   
    
 
        // Bài Tập: Cho một chuỗi chứa họ và ten một người. In ra ten của người đó => Nguyễn MTP
        //1. Tìm vị trí của khoảng trắng cuỗi cùng trong chuỗi họ tên
        //2. Lấy trong chuỗi họ tên từ vị trí tìm được + 1 đến hết chuỗi
        String hoTen = "Nguyen MTP Pro Vip";
        int vt3 = hoTen.lastIndexOf(" ");
        String ten = hoTen.substring(vt3 + 1);
        System.out.println("Ten: " + ten);
        
        // sử dụng split để chuyển chuỗi thành mảng với các phần tử theo ký tự phân cách các từ trong chuỗi
        String chuoi = "A01| Nguyen MTP | Wow";
        String[] mangTachChuoi = chuoi.split("|");
        System.out.println("Mang nhan duoc sau khi tach chuoi: " + Arrays.toString(mangTachChuoi));
    }
}
