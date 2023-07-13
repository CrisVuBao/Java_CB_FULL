/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author Dell
 */
public class XuLyGhiDSDoiTuongXML1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "Nguyen Van Hung", 20));
        ds.add(new HocSinh("A01", "Tran Van Dat", 20));
        ds.add(new HocSinh("A01", "Ly Van An", 20));
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document document = builder.newDocument();
            // tạo thẻ goc de chua cac the hoc sinh
            Element DShocsinh = document.createElement("DShocsinh");
            document.appendChild(DShocsinh);
            // duyệt qua array list và tạo các thẻ hoc sinh tương ứng với từng phần tử trong ArrayList
            for (HocSinh hs : ds) {
                // tạo thẻ con hocsinh 
                Element hocsinh = document.createElement("hocsinh");
                DShocsinh.appendChild(hocsinh);
                // tao lan luot cac thuoc tinh 
                hocsinh.setAttribute("maHS", hs.getMaHS());
                hocsinh.setAttribute("tenHS", hs.getTenHS());
                hocsinh.setAttribute("tuoi", hs.getTuoi() + "");
            }
            // ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter write = new FileWriter("Data/Ghidoituong/DShocsinh1.xml");
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
