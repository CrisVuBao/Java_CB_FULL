package On_XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Doc_XML_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong document tu tap tin            
            Document document = builder.parse(new File("data/XML/ghiGV_don.xml"));
            Element giaovien = document.getDocumentElement();
            Element sobuoi = (Element)giaovien.getElementsByTagName("SoBuoiLam").item(0);
            int sobuoi_ = Integer.parseInt(sobuoi.getTextContent());
            Element LuongCung = (Element)giaovien.getElementsByTagName("LuongCung").item(0);
            int luongCung_ = Integer.parseInt(LuongCung.getTextContent());
            Element MaNV = (Element)giaovien.getElementsByTagName("MaNV").item(0);
            String manv = (MaNV.getTextContent());            
            Element TenNV = (Element)giaovien.getElementsByTagName("TenNV").item(0);
            String tenNV_ = (TenNV.getTextContent());
            Element tuoi = (Element)giaovien.getElementsByTagName("tuoi").item(0);
            int tuoi_ = Integer.parseInt(tuoi.getTextContent());
            
            GiaoVienPhu gv = new GiaoVienPhu(sobuoi_,luongCung_, manv, tenNV_, tuoi_);
            System.out.println(gv.InToanBo());
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
        
        
        // đọc đối tượng loại 2
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong document tu tap tin            
            Document document = builder.parse(new File("data/XML/xml_loai_2.xml"));
            Element giaovien = document.getDocumentElement();
            int luong_cung = Integer.parseInt(giaovien.getAttribute("LuongCung"));
            int tuoi = Integer.parseInt(giaovien.getAttribute("tuoi"));
            int sobuoi_lam = Integer.parseInt(giaovien.getAttribute("SoBuoiLam"));

            String MaNV = giaovien.getAttribute("MaNV");
            String TenNV = giaovien.getAttribute("TenNV");
            
            
            GiaoVienPhu GV1 = new GiaoVienPhu(sobuoi_lam,luong_cung,MaNV,TenNV,tuoi);
            System.out.println(GV1.InToanBo());
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
    }
    
}
