/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DocGhiObject;

import DocGhiJson.HocSinh;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GhiObject {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("01","A10",10);
        try{
            FileOutputStream fileOut = new FileOutputStream("data/object/hs.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);
            obj.writeObject(hs);
            obj.close();
            fileOut.close();
            System.out.println("Pass");
        }catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
