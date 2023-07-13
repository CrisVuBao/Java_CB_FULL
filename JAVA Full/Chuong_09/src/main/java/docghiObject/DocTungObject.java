/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DocTungObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File folder = new File("Data/Object/DanhSachHocSinh");
            File[] listFile = folder.listFiles();
            for (File file : listFile) {
                if (file.isFile() && file.getName().endsWith(".dat")) {
                    try {
                        FileInputStream fileIn = new FileInputStream(file.getAbsoluteFile());
                        ObjectInputStream obj = new ObjectInputStream(fileIn);
                        HocSinh hs = (HocSinh)obj.readObject();
                       
                        System.out.println(hs);
                    } catch (Exception e) {
                        System.out.println("doc doi tuong thanh cong");

                    }
                }
            }
            System.out.println("Doc danh sach object thanh cong");
        } catch (Exception e) {
            System.out.println("Doc Object that bai");
        }
    }

}
