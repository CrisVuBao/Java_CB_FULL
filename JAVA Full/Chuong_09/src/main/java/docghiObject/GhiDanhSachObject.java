/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiObject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class GhiDanhSachObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "ngota", 20));
        ds.add(new HocSinh("A02", "Tran Van Dat", 20));
        ds.add(new HocSinh("A03", "Ly Van An", 20));
        try {
            FileOutputStream fileOut = new FileOutputStream("Data/object/dshs.dat");
            ObjectOutputStream obj = new ObjectOutputStream(fileOut);
            obj.writeObject(ds);
            obj.close();
            fileOut.close();
            System.out.println("ghi danh sach object thanh cong");
        } catch (Exception e) {
            System.out.println("ghi danh sach object that bai");
        }
    }
    
}
