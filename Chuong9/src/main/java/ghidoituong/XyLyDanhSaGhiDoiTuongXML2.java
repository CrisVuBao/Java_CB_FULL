/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghidoituong;

import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XyLyDanhSaGhiDoiTuongXML2 {
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01","A",10));
        ds.add(new HocSinh("A02","B",10));
        ds.add(new HocSinh("A03","C",10));

        for(HocSinh hs : ds) {
            Document tl = taoTaiLieu(hs);
            ghiTaiLieu(tl);
        }
    }

public static Document taoTaiLieu(HocSinh hs) {
    Document document = null;
         try {
            // Tạo 2 đối tượng sau để phân tích, xử lý được các tài liệu xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Tạo đối tượng tài liệu xml
            document = builder.newDocument();
            
            // Tạo thẻ gốc để chứa các thẻ hocsinh
            Element DShocsinh = document.createElement("DShocsinh");
            
            // Thêm thẻ vừa tạo vào tài liệu
            document.appendChild(DShocsinh);
            
            // Duyệt qua ArrayList và tạo các thẻ hocsinh tương ứng với từng phần tử trong ArrayList
                // Tạo thẻ con hocsinh
                Element hocsinh = document.createElement("hocsinh");
                
                // Tạo lần lượt các thuộc tính
                hocsinh.setAttribute("maHS", hs.getMaHS());
                 hocsinh.setAttribute("tenHS", hs.getMaHS());
                 hocsinh.setAttribute("tuoi", hs.getTuoi() + "");
            
            // Ghi tài liệu xml vao tệp tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter writer = new FileWriter("data/GhiDoiTuong/DShocsinh1.xml");
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(document);
            
            // Cho phép tạo xuongs dòng cho các thẻ
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            transformer.transform(source, result);
            System.out.println("Ghi danh sach thanh cong");
            
        } catch (Exception e) {
            System.out.println("Write Error!!!");
        }
         return document;
    }

public static void ghiTaiLieu(Document document) {
    // Ghi tài liệu xml vào tập tin
    try {
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            
            // Tạo thẻ gốc để chứa các thẻ hocsinh
            Element hocsinh = document.createElement("hocsinh");
            String maHS = hocsinh.getAttribute("maHS");
            String duongDan = "data/GhiDoiTuong/DSHS" + maHS + ".xml";
         
            // Ghi tài liệu xml vao tệp tin
           
            FileWriter writer = new FileWriter(duongDan);
            StreamResult result = new StreamResult(writer);
            DOMSource source = new DOMSource(document);
            
            // Cho phép tạo xuongs dòng cho các thẻ
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            transformer.transform(source, result);
            System.out.println("Ghi danh sach thanh cong");
            
        } catch (Exception e) {
            System.out.println("Write Error!!!");
        }
}
}
