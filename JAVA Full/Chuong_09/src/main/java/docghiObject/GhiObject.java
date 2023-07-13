/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Dell
 */
public class GhiObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "nguyen hieu ngao da", 9);
        try {
            FileOutputStream fileOut = new FileOutputStream("Data/Object/hs.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);
            obj.writeObject(hs);
            obj.close();
            fileOut.close();
            System.out.println("ghi object thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi doi tuong Object that bai");
        }
    }
    
}
