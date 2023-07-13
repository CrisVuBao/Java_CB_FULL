/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien_GiaoVien;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class XuLyArrayList {

    public static void main(String[] args) {
        ArrayList myArr = new ArrayList();
        myArr.add(5);
        myArr.add(5.4);
        myArr.add(true);
        myArr.add("string");

        String chuoiarr = myArr.toString();
        System.out.println(chuoiarr);
        // lấy phần tử thứ i
        double a1 = (double) myArr.get(1);
        System.out.println(a1);
        
        // xoá giá trị
        myArr.remove(1);
        chuoiarr = myArr.toString();
        System.out.println("sau khi xoa :"+chuoiarr);
        
        // gắn x cho mảng tại vị trí số 1
        myArr.add(1, "chuoithem");
        chuoiarr = myArr.toString();
        System.out.println("sau khi gan them :"+chuoiarr);
        // sửa giá trị phần tử vừa thêm
        myArr.set(1, "chuóiua");
        chuoiarr = myArr.toString();
        System.out.println("sau khi gan them :"+chuoiarr);        
    }
}
