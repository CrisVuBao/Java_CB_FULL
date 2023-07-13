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
public class GhiDanhSachDoiTuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        ArrayList<ghidoituong.HocSinh> ds = new ArrayList<>();
        ds.add(new ghidoituong.HocSinh("A01", "Nguyen Van Hung", 20));
        ds.add(new ghidoituong.HocSinh("A01", "Tran Van Dat", 20));
        ds.add(new ghidoituong.HocSinh("A01", "Ly Van An", 20));
        try {
            FileWriter fileGhi = new FileWriter("Data/json/dshs.json");
            gson.toJson(ds,fileGhi);
            fileGhi.close();
            System.out.println("ghi danh sach doi tuong thanh cong");
            
        } catch (Exception e) {
            System.out.println("Ghi danh sach doi tuong that bai");
        }
    }
    
}
