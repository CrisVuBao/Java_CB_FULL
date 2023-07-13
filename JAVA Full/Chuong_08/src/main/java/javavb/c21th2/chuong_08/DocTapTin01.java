/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong_08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DocTapTin01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> mangDong = new ArrayList<>();
        String duongdan ="Data/baitho";
        try {
            
            FileReader file = new FileReader(duongdan);
            BufferedReader docFile = new BufferedReader(file);
            String dong;
            while ((dong = docFile.readLine()) != null) {
                mangDong.add(dong);
            }
            for(String d: mangDong){
                System.out.println(d);
            }
            docFile.close();
        } catch (IOException ex) {
            System.out.println("Doc tap tin that bai");
            ex.printStackTrace();
        }
    }
    
}
