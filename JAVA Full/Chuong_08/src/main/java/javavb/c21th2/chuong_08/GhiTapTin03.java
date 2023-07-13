/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong_08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class GhiTapTin03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        String duongDan = "Data/dsHocSinh.txt";
        // Đọc danh sách học sinh vào arrayList
        try {
            FileWriter file = new FileWriter(duongDan);
            BufferedWriter ghiFile = new BufferedWriter(file);
            for(HocSinh hs:ds){
                String chuoiHS = hs.getMaHS() +";" + hs.getTenHS()+";"+hs.getTuoi();
                ghiFile.write(chuoiHS);
                ghiFile.newLine();
                System.out.println(chuoiHS);
            }
            ghiFile.close();
        } catch (IOException e) {
            System.out.println("ghi tap tin that bai");
        }
        // ghi các học sinh trong array voà tập tin với mỗi học sinh là một tập tin
        for(HocSinh hs:ds){
            // ứng với mỗi hs ta sẽ tạo một tập tin có tên là <MaHS>.txt
            String path ="Data/"+hs.getMaHS()+".txt";
            String chuoiHS = hs.getTenHS()+";"+hs.getTenHS()+";"+hs.getTuoi();
            try {
                FileWriter file = new FileWriter(path);
                BufferedWriter ghiFile = new BufferedWriter(file);
                ghiFile.write(chuoiHS);
                ghiFile.close();
            } catch (IOException e) {
                System.out.println("ghi tap tin that bai");
            }            
        }
    }
    
}
