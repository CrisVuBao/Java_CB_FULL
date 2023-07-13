/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.ArrayList;

/**
 *
 * @author Cris_VuBao
 */
public class DocGhiFile {
    
    // Đọc File
    public static ArrayList<String> docFile(String duongDan) {
        ArrayList<String> kq = new ArrayList<>();
        try {
            FileReader fr = new FileReader(duongDan, StandardCharsets.UTF_8);
            BufferedReader buffer = new BufferedReader(fr);
            String dong = "";
            while((dong = buffer.readLine())!= null) {
                kq.add(dong);
            }
            buffer.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return kq;
    }
    
    // Ghi File
    public static void ghiFile(ArrayList<SinhVien> svList, String duongDan) {
        try {
            FileWriter fw = new FileWriter(duongDan, StandardCharsets.UTF_8);
            BufferedWriter buffer = new BufferedWriter(fw);
            for(SinhVien sv :  svList) {
                buffer.write(String.format("%s;%s;%s",sv.getMaSV(),sv.getHoTenSV(),sv.getHocBong()));
                buffer.newLine();
            }
            buffer.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
