/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiJson;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Dell
 */
public class DocTungDanhSach{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File folder = new File("Data/json/DanhSachHocSinh");
            File[] listFile = folder.listFiles();
            for (File file : listFile) {
                if (file.isFile() && file.getName().endsWith(".json")) {
                    try {
                        Gson gson = new Gson();
                        FileReader fileDoc = new FileReader(file.getAbsoluteFile());
                        HocSinh hs = gson.fromJson(fileDoc,HocSinh.class); // lấy theo kiểu class hocsinh
                        fileDoc.close();
                        System.out.println(hs);
                    } catch (Exception e) {
                        System.out.println("doc doi tuong that bai");
                    }
                }
            }
           
        } catch (Exception e) {
            System.out.println("Doc doi tuong that bai");
        }
    }
    
}
