
package javacb.c21th2.chuong3;

public class CuuChuong {
    public static void main(String[] args) {
        int i = 1;
        final int CUU_CHUONG_7 = 7; // final: khai báo hằng số (biến phải ghi chữ in)
        while(i<=10) {
            System.out.printf("%2d * %2d = %d\n", i,CUU_CHUONG_7,i*CUU_CHUONG_7); // %.2f để lấy số thập phân, %2d để lấy khoảng trắng
            i++;
        }
    }
}
