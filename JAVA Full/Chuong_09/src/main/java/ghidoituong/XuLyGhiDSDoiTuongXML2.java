/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghidoituong;

import java.io.File;
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
public class XuLyGhiDSDoiTuongXML2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HocSinh> ds = new ArrayList<>();
        ds.add(new HocSinh("A01", "Nguyen Van Hung", 20));
        ds.add(new HocSinh("A02", "Tran Van Dat", 20));
        ds.add(new HocSinh("A03", "Ly Van An", 20));
        for (HocSinh hs : ds) {
            Document tl =  taoTaiLieu(hs);
            ghiTaiLieu(tl);
        }
    }

    public static Document taoTaiLieu(HocSinh hs) {
        Document document = null;
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            document = builder.newDocument();
            // tạo thẻ goc de chua cac the hoc sinh
            Element hocsinh = document.createElement("hocsinh");
            document.appendChild(hocsinh);
            // tao lan luot cac thuoc tinh 
            hocsinh.setAttribute("maHS", hs.getMaHS());
            hocsinh.setAttribute("tenHS", hs.getTenHS());
            hocsinh.setAttribute("tuoi", hs.getTuoi() + "");

        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
        return document;
    }

    public static void ghiTaiLieu(Document document) {
        // ghi tai lieu xml vao tap tin
        try {
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            // lấy maHS
            Element hocsinh = document.getDocumentElement();
            String maHS = hocsinh.getAttribute("maHS");

            FileWriter write = new FileWriter("Data/DSHS/" + maHS + ".xml");
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
