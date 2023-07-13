/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframe;

import javax.swing.JFrame;

/**
 *
 * @author Cris_VuBao
 */
public class ThiDuJFrame_2 {

    public static JFrame myJFrame = new JFrame();
    
    public static void main(String[] args) {
        khoiTao();
    }
    
    public static void khoiTao() {
//       JFrame myJFrame = new JFrame();
       // Thiết lập các thuộc tính
       // 1. Thiết lập tiêu đề
       myJFrame.setTitle("Demo JFrame");
       // 2. Thiết lập kích thước
       myJFrame.setSize(400,300);
       //3. Thiết lập vị trí hiển thị theo tọa độ ngang x, dọc y
       myJFrame.setLocation(30, 60);
       // 3Bis => Căn giữa cửa sổ theo màn hình làm việc
       myJFrame.setLocationRelativeTo(null);
       // 4. Thiết lập chế độ dừng chương trình khi click nút close
       myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // 5. Thiết lập không thay đổi kích thước
       myJFrame.setResizable(false);
       
       // HIển thị JFrame
       myJFrame.setVisible(true);
    }
    
}
