/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiJson;

import com.google.gson.Gson;
import java.io.FileWriter;

/**
 *
 * @author Dell
 */
public class GhiDoiTuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "nguyen van hung", 20);
        try {
            Gson gson = new Gson();
            FileWriter fileGhi = new FileWriter("Data/json/hs.json");
            gson.toJson(hs,fileGhi);
            fileGhi.close();
            System.out.println("ghi doi tuong thanh cong");
            
        } catch (Exception e) {
            System.out.println("Ghi doi tuong that bai");
        }
    }
    
}
