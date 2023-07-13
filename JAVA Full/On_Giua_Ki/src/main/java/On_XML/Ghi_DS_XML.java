/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On_XML;

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
public class Ghi_DS_XML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<GiaoVienPhu> gv = new ArrayList<>();
        gv.add(new GiaoVienPhu(10, 1000, "B03", "Gia vien phu 3", 21));
        gv.add(new GiaoVienPhu(11, 1200, "B01", "Gia vien phu 1", 24));
        gv.add(new GiaoVienPhu(9, 1100, "B02", "Gia vien phu 2", 30));
        
        System.out.println("Ghi trong 1 XML");
         try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document document = builder.newDocument();
            // tạo thẻ (nut - node - Element)
            Element dsgiaovienphu = document.createElement("DSGiaoVienPhu");
            document.appendChild(dsgiaovienphu);
            
            // duyệt qua array list và tạo các thẻ hoc sinh tương ứng với từng phần tử trong ArrayList
            for (GiaoVienPhu g : gv) {
                // tạo thẻ con hocsinh 
                Element giaovienphu = document.createElement("GiaoVienPhu");
                dsgiaovienphu.appendChild(giaovienphu);
                // tao lan luot cac thuoc tinh 
                giaovienphu.setAttribute("SoBuoiLam", g.getSoBuoiLam()+"");
                giaovienphu.setAttribute("LuongCung", g.getLuongCung()+"");
                giaovienphu.setAttribute("MaNV", g.getMaNV());
                giaovienphu.setAttribute("TenNV", g.getTenNV());
                giaovienphu.setAttribute("tuoi", g.getTuoi()+"");
            }
            // ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter write = new FileWriter("data/ListXML/DSGV_1.xml");
            StreamResult result = new StreamResult(write);
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
         
         
        System.out.println("Ghi trong mot folder");
        
        for (GiaoVienPhu g : gv) {
            Document tl =  taoTaiLieu(g);
            ghiTaiLieu(tl);
        }
    }
    public static Document taoTaiLieu(GiaoVienPhu g) {
        Document document = null;
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            document = builder.newDocument();
            // tạo thẻ goc de chua cac the hoc sinh
            Element giaovien = document.createElement("giaovien");
            document.appendChild(giaovien);
            // tao lan luot cac thuoc tinh 
            giaovien.setAttribute("SoBuoiLam", g.getSoBuoiLam()+"");
            giaovien.setAttribute("LuongCung", g.getLuongCung()+"");
            giaovien.setAttribute("MaNV", g.getMaNV());
            giaovien.setAttribute("TenNV", g.getTenNV());
            giaovien.setAttribute("tuoi", g.getTuoi()+"");

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
            // lấy maNV
            Element nhanvien = document.getDocumentElement();
            String MaNV = nhanvien.getAttribute("MaNV");

            FileWriter write = new FileWriter("data/ListXML/folder_list/" + MaNV + ".xml");
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
