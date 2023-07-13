
package javacb.c21th2.chuong3;

public class TrungBinhCong {
    public static void main(String[] args) {
        int batDau = 27, ketThuc = 250, dem = 0, tong = 0;
        while(batDau<=ketThuc) {
            if(batDau % 3 == 0) {
                tong += batDau;
                dem++;
            }
            batDau++;
        }
        float tbCong = (float)tong/dem;
        System.out.printf("tb cong: %.2f", tbCong);
    }
}
