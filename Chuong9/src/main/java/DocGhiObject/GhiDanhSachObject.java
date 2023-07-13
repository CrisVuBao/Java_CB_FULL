/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiObject;

import DocGhiJson.HocSinh;
import com.google.gson.Gson;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class GhiDanhSachObject {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("01","A1",10));
        ds.add(new HocSinh("02","A2",10));
        ds.add(new HocSinh("03","A3",10));
        try {
            FileOutputStream fileOut = new FileOutputStream("data/object/hs.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);
            obj.writeObject(ds);
            obj.close();
            fileOut.close();
        }catch (Exception e){
            System.out.println("Error!!!");
        }
    }
}
