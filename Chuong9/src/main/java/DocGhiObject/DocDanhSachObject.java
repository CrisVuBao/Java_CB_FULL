/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiObject;

import DocGhiJson.HocSinh;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class DocDanhSachObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("data/object/hs.dat");
            ObjectInputStream obj = new ObjectInputStream(fileIn);
            ArrayList<HocSinh> ds = (ArrayList<HocSinh>)obj.readObject();
            for(HocSinh hs : ds)
            System.out.println("Doc Object thanh cong");
        }catch(Exception e) {
            System.out.println("Error");
        }
    }
}
