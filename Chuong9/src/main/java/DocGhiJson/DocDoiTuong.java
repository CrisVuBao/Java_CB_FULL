/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import com.google.gson.Gson;
import java.io.FileReader;


public class DocDoiTuong {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            FileReader fileDoc = new FileReader("data/json/hs.json");
            HocSinh hs = gson.fromJson(fileDoc, HocSinh.class);
            fileDoc.close();
            System.out.println(hs);
            System.out.println("Pass");
        } catch (Exception e){
            System.out.println("Error!!!");
        }
    }
}
