/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import com.google.gson.Gson;
import java.io.FileWriter;

public class GhiDoiTuong {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "Nguyen Van Hung", 20);
        try {
            Gson gson = new Gson();
            FileWriter fileGhi = new FileWriter("data/json/hs.json");
            gson.toJson(hs, fileGhi);
            fileGhi.close();
            System.out.println("Pass");
        }catch (Exception e) {
            System.out.println("Error!!!");
        }
    }
}
