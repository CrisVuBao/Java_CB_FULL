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
public class GhiTapTin01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> mangDong = new ArrayList<>();
        String cau1 = "hom qua mua to ";
        String cau2="bo quen chiec ao tren bon cau";
        mangDong.add(cau1);
        mangDong.add(cau2);
        // ghi du lieu tu mang vao tap tin
        String duongDan ="Data/baine.txt";
        try {
            FileWriter ghiFile = new FileWriter(duongDan);
            BufferedWriter ghi = new BufferedWriter(ghiFile);
            for(String dong:mangDong){
                ghi.write(dong);
                ghi.newLine();
            }
            ghi.close();
        } catch (IOException e) {
            System.out.println("ghi tap tin that bai");
        }
        
    }
    
}
