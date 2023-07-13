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
public class GhiTapTin02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("B01", "Tran van x", 44));
        ds.add(new HocSinh("B02", "Le van q", 45));
        ds.add(new HocSinh("B03", "nguyen van k", 52));
        ds.add(new HocSinh("B04", "bui thi v", 22));
        ds.add(new HocSinh("B05", "Huu gia phai", 32));

        String duongDan = "Data/dsHocSinh.txt";
        try {
            FileWriter file = new FileWriter(duongDan);
            BufferedWriter ghiFile = new BufferedWriter(file);
            for(HocSinh hs:ds){
                String chuoiHS = hs.getMaHS() +";" + hs.getTenHS()+";"+hs.getTuoi();
                ghiFile.write(chuoiHS);
                ghiFile.newLine();
            }
            ghiFile.close();
        } catch (IOException e) {
            System.out.println("ghi tap tin that bai");
        }              
    }
    
}
