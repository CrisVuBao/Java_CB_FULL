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
public class DocTapTin02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        String duongDan ="Data/dsHocSinh.txt";
        try {
            FileReader file = new FileReader(duongDan);     
            BufferedReader docFile = new BufferedReader(file);
            String dong;
            while ((dong = docFile.readLine())!=null) {
                String[] MangTach = dong.split(";");
                HocSinh hs = new HocSinh(MangTach[0],MangTach[1] ,Integer.parseInt(MangTach[2]));
                ds.add(hs);
            }
            docFile.close();
            // xuat danh sach hoc sinh trong arraylist
            for(HocSinh hs:ds){
                System.out.println(hs);
            }
        } catch (IOException e) {
            System.out.println("Doc tap tin that bai");
        }
        
        
    }
    
}
