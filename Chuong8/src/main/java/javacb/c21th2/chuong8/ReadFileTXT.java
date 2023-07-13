/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacb.c21th2.chuong8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileTXT {
    public static void main(String[] args) {
        ArrayList<String> mangDong = new ArrayList<>();
        String url = "data/baitho.txt";
        try {
            FileReader file = new FileReader(url);
            BufferedReader readFile = new BufferedReader(file);
        } catch (IOException ex){
            System.out.println("Read file Error!!!");
            ex.printStackTrace();
        }
    }
}
