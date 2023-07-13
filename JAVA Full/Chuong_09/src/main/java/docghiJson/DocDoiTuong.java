/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiJson;

import com.google.gson.Gson;
import java.io.FileReader;

/**
 *
 * @author Dell
 */
public class DocDoiTuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            FileReader fileDoc = new FileReader("Data/json/hs.json");
            HocSinh hs = gson.fromJson(fileDoc,HocSinh.class); // lấy theo kiểu class hocsinh
            fileDoc.close();
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println("Doc doi tuong that bai");
        }
    }
    
}
