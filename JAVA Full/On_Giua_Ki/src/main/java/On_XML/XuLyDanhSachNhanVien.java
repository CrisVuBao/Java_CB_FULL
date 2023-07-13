/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package On_XML;

import java.io.FileWriter;
import java.util.Collections;
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
public class XuLyDanhSachNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        dsnv.them(new GiaoVienChinh("thuong dang1", 10000, "A01","Giao vien chinh 01" , 20));
        dsnv.them(new GiaoVienChinh("thuong dang4", 11000, "A04","Giao vien chinh 04" , 20));
        dsnv.them(new GiaoVienPhu(10, 1000, "B03", "Gia vien phu 3", 21));
        dsnv.them(new GiaoVienPhu(11, 1200, "B01", "Gia vien phu 1", 24));         
        dsnv.them(new GiaoVienPhu(9, 1100, "B02", "Gia vien phu 2", 30));
        dsnv.them(new GiaoVienChinh("thuong dang3", 12000, "A03","Giao vien chinh 03" , 20));
        dsnv.them(new GiaoVienChinh("thuong dang2", 13000, "A02","Giao vien chinh 02" , 20));
        
        System.out.println("da them thanh cong");
        Collections.sort(dsnv.getDanhSachGV());
        for(NhanVien nv:dsnv.getDanhSachGV()){
            System.out.println(nv.InToanBo());
        }
        
        //in vào file xml thứ nhất all in one
        // sử dụng nhân viên phụ
        GiaoVienPhu gvp = (GiaoVienPhu)dsnv.getDanhSachGV().get(1);
        System.out.println(gvp.InToanBo());
        
        // ghi 1 nhân viên
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document document = builder.newDocument();
            // tạo thẻ (nut - node - Element)
            // tạo nút cha
            Element giaovien = document.createElement("GiaoVienPhu");
            document.appendChild(giaovien);
            // tao lan luot cac the con va them vao the cha sinhvien
            // tạo các nút con bên trong
            Element sobuoi = document.createElement("SoBuoiLam");
            giaovien.appendChild(sobuoi);
            sobuoi.setTextContent(String.valueOf(gvp.SoBuoiLam));
            Element luongcung = document.createElement("LuongCung");
            giaovien.appendChild(luongcung);
            luongcung.setTextContent(String.valueOf(gvp.LuongCung));
            
            Element manv = document.createElement("MaNV");
            giaovien.appendChild(manv);
            manv.setTextContent(gvp.getMaNV());
            
            Element TenNV = document.createElement("TenNV");
            giaovien.appendChild(TenNV);
            TenNV.setTextContent(gvp.getTenNV());
            
            Element tuoi = document.createElement("tuoi");
            giaovien.appendChild(tuoi);
            tuoi.setTextContent(String.valueOf(gvp.getTuoi()));
            
            // ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter write = new FileWriter("data/XML/ghiGV_don.xml");
            StreamResult result = new StreamResult(write);
            DOMSource source = new DOMSource(document);
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("Ghi doi tuong vao tap tin thanh cong");
        } catch (Exception e) {
            System.out.println("Ghi di tuong that bai");
        }
        
        System.out.println("Ghi kiểu cách hai vào ngay thuộc tính của thẻ");
        
        try {
            // tạo 2 doi tuong de phan tich duoc xml
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            // tao doi tuong tai lieu xml
            Document document = builder.newDocument();
            // tạo thẻ (nut - node - Element)
            Element giaovienphu = document.createElement("GiaoVienPhu");
            document.appendChild(giaovienphu);
            
            // tao lan luot cac thuoc tinh va them vao the cha sinhvien
            giaovienphu.setAttribute("SoBuoiLam", gvp.getSoBuoiLam()+"");
            giaovienphu.setAttribute("LuongCung", gvp.getLuongCung()+"");
            giaovienphu.setAttribute("MaNV", gvp.getMaNV());
            giaovienphu.setAttribute("TenNV", gvp.getTenNV());
            giaovienphu.setAttribute("tuoi", gvp.getTuoi()+"");

            // ghi tai lieu xml vao tap tin
            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            FileWriter write = new FileWriter("data/XML/xml_loai_2.xml");
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
