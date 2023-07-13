
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dell
 */
public class XuLyDanhSachHocSinh {
    public static void main(String[] args) {
        DanhSachHocSinh dshs = new DanhSachHocSinh();
        dshs.themHS(new HocSinhCap2TT("005", "nguyen cap2 P", "Nam", 10, 9, 8, 7,23));
        dshs.themHS(new HocSinhCap2TT("006", "nguyen cap2 O", "Nam", 7, 6, 8, 8,54));
        dshs.themHS(new HocSinhCap2TT("007", "nguyen cap2 U", "Nam", 8, 6, 4, 5,11));
        dshs.themHS(new HocSinhCap2TT("008", "nguyen cap2 A", "Nam", 9, 5, 8, 9,90));
        dshs.themHS(new HocSinhCap1TT("001", "nguyen cap 1 A", "Nam", 8, 10,20));
        dshs.themHS(new HocSinhCap1TT("002", "nguyen cap 1 F", "Nam", 9, 6,13));
        dshs.themHS(new HocSinhCap1TT("003", "nguyen cap 1 E", "Nam", 6, 8,33));
        dshs.themHS(new HocSinhCap1TT("004", "nguyen cap 1 B", "Nam", 8, 7,53));
       
        
//        // xử lý lấy tên học sinh
//        
//        // in một học sinh
//        HocSinhTT hs1 = dshs.getDanhSachHS().get(0);
//        System.out.println(hs1);
//        for(HocSinhTT hs:dshs.getDanhSachHS()){
//            System.out.println(hs);
//        }
//        // sắp xếp danh sách số nguyên
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        nums.add(5);
//        nums.add(4);
//        nums.add(6);
//        nums.add(9);
//        // in danh sách số nguyên
//        System.out.println("truoc khi sap tang" +nums.toString());
//        // sắp xếp tăng
//        Collections.sort(nums);
//        System.out.println("sau khi sap tang "+nums.toString());
//        // sắp xếp giảm
//        Collections.sort(nums,Comparator.reverseOrder());
//        System.out.println("sau khi sap giam "+nums.toString());
        
        // sắp xếp tăng dần mảng học sinh theo họ tên
        System.out.println("sap xep theo ten");
        Collections.sort(dshs.getDanhSachHS());
        for(HocSinhTT hs:dshs.getDanhSachHS()){
            System.out.println(hs);
        }
        System.out.println("///////////////////////");
//        System.out.println("Sap giam dan theo họ tên");
//        Collections.sort(dshs.getDanhSachHS(),Comparator.reverseOrder());
//        for(HocSinhTT hs:dshs.getDanhSachHS()){
//            System.out.println(hs);
//        }
//
//        System.out.println("Sap giam dan theo tuoi");
//        Collections.sort(dshs.getDanhSachHS(),HocSinhTT.comparaByTuoi().reversed());
//        for(HocSinhTT hs:dshs.getDanhSachHS()){
//            System.out.println(hs);
//        }
    }
}
