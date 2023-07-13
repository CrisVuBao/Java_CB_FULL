
package jframe;

import javax.swing.JFrame;
import static jframe.ThiDuJFrame_2.myJFrame;

public class MyWindow extends JFrame{
    public MyWindow() {
        
    }
    
    public void khoiTao() {
        //       JFrame myJFrame = new JFrame();
       // Thiết lập các thuộc tính
       // 1. Thiết lập tiêu đề
       this.setTitle("Demo JFrame");
       // 2. Thiết lập kích thước
       this.setSize(400,300);
       //3. Thiết lập vị trí hiển thị theo tọa độ ngang x, dọc y
       this.setLocation(30, 60);
       // 3Bis => Căn giữa cửa sổ theo màn hình làm việc
       this.setLocationRelativeTo(null);
       // 4. Thiết lập chế độ dừng chương trình khi click nút close
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // 5. Thiết lập không thay đổi kích thước
       this.setResizable(false);
       
       // HIển thị JFrame
       this.setVisible(true);
       // This là thuộc tính MyWindow + JFrame
    }
    
    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
        mw.khoiTao();
    }
}
