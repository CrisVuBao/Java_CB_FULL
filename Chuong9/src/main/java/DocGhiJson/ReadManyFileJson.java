/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class ReadManyFileJson {
    public static void main(String[] args) {
         Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        
        // Đinh ghĩa kiểu của arraylist<hocsinh>
        Type listType = new TypeToken<ArrayList<HocSinh>>(){}.getType();
            try {
                FileReader fileDoc = new FileReader("data/json/dshs.json");
                ds = gson.fromJson(fileDoc, listType);
                fileDoc.close();
                for(HocSinh hs : ds) {
                    System.out.println(hs);
                }
                System.out.println("Pass");
            } catch(Exception e) {
                System.out.println("Error");
            }
    }
}
