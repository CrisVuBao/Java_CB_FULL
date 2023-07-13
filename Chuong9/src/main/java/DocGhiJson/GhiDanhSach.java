/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class GhiDanhSach {
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<ghidoituong.HocSinh> ds = new ArrayList<>();
        ds.add(new ghidoituong.HocSinh("01","A1",10));
        ds.add(new ghidoituong.HocSinh("02","A2",10));
        ds.add(new ghidoituong.HocSinh("03","A3",10));
        
        try {
            FileWriter writeFile = new FileWriter("data/json/dshs.json");
            gson.toJson(ds, writeFile);
            writeFile.close();
            System.out.println("Pass");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
