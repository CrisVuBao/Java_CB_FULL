/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ThiDu_GridLayout extends JFrame{
        // Constructor
    public ThiDu_GridLayout() {
    }
    
    public void khoiTao() {
       // JFrame myJFrame = new JFrame();
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
       
       // 6. Tạo các điều khiển JButton trên cửa sổ
       // => Thiết lập FlowLayout cho cửa sổ
       this.setLayout(new GridLayout());
       for(int i = 0; i < 10; i++) {
           JButton button = new JButton(i + "");
           this.add(button);
       }
       
       // HIển thị JFrame
       this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_GridLayout fl = new ThiDu_GridLayout();
        fl.khoiTao();
    }
}
