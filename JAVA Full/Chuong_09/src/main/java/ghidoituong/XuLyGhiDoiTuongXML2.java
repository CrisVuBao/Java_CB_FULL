/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author Dell
 */
public class XuLyGhiDoiTuongXML2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HocSinh hs = new HocSinh("A01", "Nguyen Van Hung", 20);
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document document = builder.newDocument();
            // tạo thẻ (nut - node - Element)
            Element hocsinh = document.createElement("hocsinh");
            document.appendChild(hocsinh);
            
            // tao lan luot cac thuoc tinh va them vao the cha sinhvien
            hocsinh.setAttribute("maHS", hs.getMaHS());
            hocsinh.setAttribute("tenHS", hs.getTenHS());
            hocsinh.setAttribute("tuoi", hs.getTuoi()+"");

           
            // ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter write = new FileWriter("Data/Ghidoituong/hocsinh2.xml");
            StreamResult result = new StreamResult(write);
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
    }
    
}
