/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class WriteManyFileJson {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("01","A1",10));
        ds.add(new HocSinh("02","A2",10));
        ds.add(new HocSinh("03","A3",10));
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();
        for (int i = 0; i < ds.size(); i++) {
            String json = gson.toJson(ds.get(i));
            try (FileWriter writer = new FileWriter("data/json/HocSinh_" + i + ".json")) {
                writer.write(json);
                System.out.println("Pass");
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
    }
}
