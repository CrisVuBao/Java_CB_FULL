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
public class GhiTungObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "Nguyen Van Hung", 20));
        ds.add(new HocSinh("A02", "Tran Van Dat", 20));
        ds.add(new HocSinh("A03", "Ly Van An", 20));
        try {
                for(HocSinh hs:ds){
                String duongdan = "Data/Object/DanhSachHocSinh/"+ hs.getMaHS()+".dat";
                FileOutputStream fileOut = new FileOutputStream(duongdan);
                ObjectOutputStream obj = new ObjectOutputStream(fileOut);
                obj.writeObject(hs);
                obj.close();
                fileOut.close();
                System.out.println("ghi tung object thanh cong");
            }

        } catch (Exception e) {
            System.out.println("Ghi tung Object that bai");
        }
    }
    
}
