/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghidoituong;

import java.io.FileWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XyLyGhiDoiTuongXML1 {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "Nguyen A", 20);
        try {
            // Tạo 2 đối tượng sau để phân tích, xử lý được các tài liệu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Tạo đối tượng tài liệu xml
            Document document = builder.newDocument();
            
            // Tạo thẻ (nut - node - Element)
            Element hocsinh = document.createElement("hocsinh");
            
            // Thêm thẻ vừa tạo vào tài liệu
            document.appendChild(hocsinh);
            
//            // C1: Tạo lần lượt các thẻ con và thêm vào thẻ cha sinhvien
//            Element maHS = document.createElement("maHS");
//            hocsinh.appendChild(hocsinh);
//            maHS.setTextContent(hs.getMaHS());
//            Element tenHS = document.createElement("tenHS");
//            hocsinh.appendChild(tenHS);
//            tenHS.setTextContent(hs.getTenHS());
//            Element tuoi = document.createElement("tuoi");
//            hocsinh.appendChild(tuoi);
//            // Chuyển số qua chuỗi
//            tuoi.setTextContent(hs.getTuoi() + "");
////            tuoi.setTextContent(String.valueOf(hs.getTuoi()));
////            tuoi.setTextContent(Integer.toString(hs.getTuoi()));

             // C2: Tạo lần lượt các thuộc tính và thêm vào thẻ cha sinhvien
             hocsinh.setAttribute("maHS", hs.getMaHS());
             hocsinh.setAttribute("tenHS", hs.getMaHS());
             hocsinh.setAttribute("tuoi", hs.getTuoi() + "");
             
            // Ghi tài liệu xml vao tệp tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter writer = new FileWriter("data/GhiDoiTuong/hocsinh1.xml");
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(document);
            
            // Cho phép tạo xuongs dòng cho các thẻ
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            transformer.transform(source, result);
            System.out.println("Ghi thanh cong");
            
        } catch (Exception e) {
            System.out.println("Write Error!!!");
        }
    }
}
