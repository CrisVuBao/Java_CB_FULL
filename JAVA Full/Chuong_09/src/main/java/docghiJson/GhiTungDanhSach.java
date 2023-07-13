/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiJson;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class GhiTungDanhSach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "Nguyen Van Hung", 20));
        ds.add(new HocSinh("A02", "Tran Van Dat", 20));
        ds.add(new HocSinh("A03", "Ly Van An", 20));
        try {
            for(HocSinh hs:ds){
                String duongdan = "Data/json/DanhSachHocSinh/"+ hs.getMaHS()+".json";
                FileWriter fileGhi = new FileWriter(duongdan);
                gson.toJson(hs,fileGhi);
                fileGhi.close();
                System.out.println("ghi danh sach doi tuong thanh cong");
            }
        } catch (Exception e) {
            System.out.println("Ghi danh sach doi tuong that bai");
        }
    }
    
}
