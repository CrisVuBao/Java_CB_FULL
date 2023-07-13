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
public class XuLyArrayListSoNguyen {

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        myArr.add(5);
        myArr.add(2);
        myArr.add(7);
        myArr.add(9);

        String chuoiarr = myArr.toString();
        System.out.println(chuoiarr);
        // lấy phần tử thứ i
        int a1 =myArr.get(1);
        System.out.println(a1);
        
        // xoá giá trị
        myArr.remove(1);
        chuoiarr = myArr.toString();
        System.out.println("sau khi xoa :"+chuoiarr);
        
        // gắn x cho mảng tại vị trí số 1
        myArr.add(1, 111);
        chuoiarr = myArr.toString();
        System.out.println("sau khi gan them :"+chuoiarr);
        // sửa giá trị phần tử vừa thêm
        myArr.set(1, 999);
        chuoiarr = myArr.toString();
        System.out.println("sau khi gan them :"+chuoiarr);       
        
        System.out.println("tim gia tri 999 :"+myArr.indexOf(999));
    }
}
