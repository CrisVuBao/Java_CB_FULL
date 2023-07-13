/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Cho extends DongVat{
    private int soChan;

    public Cho(String ten,String mau, int soChan) {
        super(ten, mau);
        this.soChan = soChan;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }
    public void sua(){
        System.out.println("Gau gau");
    }
//    public void inThongTin(){
//        super.inThongTin();
//        System.out.println("-So chan :"+this.soChan); 
//   }

    @Override
    public void inThongTin() {
        super.inThongTin(); //To change body of generated methods, choose Tools | Templates
        System.out.println("-So chan :"+this.soChan); 
    }
}
