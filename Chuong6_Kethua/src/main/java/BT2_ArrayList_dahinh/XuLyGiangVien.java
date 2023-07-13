/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT2_ArrayList_dahinh;

/**
 *
 * @author Cris_VuBao
 */
public class XuLyGiangVien {
    public static void main(String[] args) {
        DanhSachGiangVien dsgv = new DanhSachGiangVien();
        dsgv.themGiangVien(new GVThinhGiang("wow1",new Ngay(10,10,2023),10,10));
        dsgv.themGiangVien(new GVThinhGiang("wow2",new Ngay(10,10,2023),10,10));
        dsgv.themGiangVien(new GVThinhGiang("wow3",new Ngay(10,10,2023),10,10));
        GiangVien gvgv = dsgv.getDsGiangVien().get(1);
        dsgv.xoaGiangVien(gvgv);
    }
}
