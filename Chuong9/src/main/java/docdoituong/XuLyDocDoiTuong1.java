/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package docdoituong;

import ghidoituong.HocSinh;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author Cris_VuBao
 */
public class XuLyDocDoiTuong1 {
    public static void main(String[] args) {
        try {
            // Tạo 2 đối tượng sau để phân tích, xử lý được các tài liệu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Tạo đối tượng tài liệu xml
            Document document = builder.parse(new File("data/GhiDoiTuong/hocsinh1.xml"));
            Element hocsinh = document.getDocumentElement();
            Element maHS = (Element) hocsinh.getElementsByTagName("maHS").item(0);
            String mahs = maHS.getTextContent();
            Element tenHS = (Element) hocsinh.getElementsByTagName("tenHS").item(0);
            String tenhs = maHS.getTextContent();
            Element tuoiHS = (Element) hocsinh.getElementsByTagName("tuoi").item(0);
            int tuoi = Integer.parseInt(tuoiHS.getTextContent());
            HocSinh hs = new HocSinh(mahs, tenhs, tuoi);
            System.out.println(hs);
            System.out.println("Ghi thanh cong");
            
        } catch (Exception e) {
            System.out.println("Write Error!!!");
        }
    }
}
