/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystatic;

/**
 *
 * @author Dell
 */
public class XuLyPhepToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m=9,n=10;
        System.out.println(PhepToan.tinhCong(m, n));
        System.out.println(PhepToan.tinhTru(m, n));
    }
    public int nhan(int a,int b){
        return a*b;
    }
}
