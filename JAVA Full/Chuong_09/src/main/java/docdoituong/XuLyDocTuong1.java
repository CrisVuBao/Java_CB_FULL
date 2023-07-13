/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docdoituong;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Dell
 */
public class XuLyDocTuong1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong document tu tap tin            
            Document document = builder.parse(new File("Data/Ghidoituong/hocsinh.xml"));
            Element hocsinh = document.getDocumentElement();
            Element maHS = (Element)hocsinh.getElementsByTagName("maHS").item(0);
            String mahs = maHS.getTextContent();
            Element tenHS = (Element)hocsinh.getElementsByTagName("tenHS").item(0);
            String tenhs = tenHS.getTextContent();
            Element tuoiHS = (Element)hocsinh.getElementsByTagName("tuoi").item(0);
            int tuoi = Integer.parseInt(tuoiHS.getTextContent());
            
            HocSinh hs = new HocSinh(mahs, tenhs, tuoi);
            System.out.println(hs);
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
    }
    
}
