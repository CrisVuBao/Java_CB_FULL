/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docghiJson;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DocDanhSachDoiTuongJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        Gson gson = new Gson();
        //dinh nghia kieu cua ArrayList<HocSinh>
        Type listType = new TypeToken<ArrayList<HocSinh>>(){}.getType();
        try{
            FileReader fileDoc = new FileReader("Data/json/dshs.json");
            ds = gson.fromJson(fileDoc,listType);
            for(HocSinh hs:ds ){
                System.out.println(hs);
            }
        }catch (Exception e) {
            System.out.println("that bai");
        }
    }
    
}
