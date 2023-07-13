/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javavb.c21th2.chuong_08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DocTapTin03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        //1 khai báo folder chua danh sach các tap tin
        File folder = new File("Data");
        // 2 duyệt qua folder để tiến hành truy xuât các tập tin
        File[] listFile = folder.listFiles();
        if (listFile != null) {
            for(File file:listFile){
                if(file.isFile() && file.getName().startsWith("A") && file.getName().endsWith(".txt")){
                    // Lấy đường dẫn của file
                    String duongDan = file.getAbsolutePath();
                    try {
                        FileReader f = new FileReader(duongDan);
                        BufferedReader docFile = new BufferedReader(f);
                        String chuoiHS = docFile.readLine();
                        String[] mangTach = chuoiHS.split(";");
                        ds.add(new HocSinh(mangTach[0], mangTach[1], Integer.parseInt(mangTach[2])));
                        docFile.close();
                    } catch (IOException e) {
                        System.out.println("khong doc duoc tep tin nay");
                    }
                }
            }
        }
        // in danh sach hoc sinh doc duoc
        for(HocSinh hs:ds){
            System.out.println(hs);
        }
        // xoá học sinh A04
        HocSinh hsA04 = ds.get(3);
        String duongDan="Data/"+hsA04.getMaHS()+".txt";
        File hscx = new File(duongDan);
        if (hscx.exists()) {
            hscx.delete();
        }
    }
    
}
