/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modauJframe;

import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class ThiDuJFrame_2 {

    public static JFrame mystJFram = new JFrame();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
        mw.khoiTao();
    }
    public static void khoiTao(){
        // 1 thiết lập tiêu đề
        mystJFram.setTitle("Demo JFRame");
        
        // 2 thiết lập kích thước
        mystJFram.setSize(400,300);
        
        // 3 thiết lập vị trí hiển thị theo tọa độ x và y
        //myJFram.setLocation(null);
        
        // 3.1 => canh giữa các cửa sổ màn hình làm việc
        mystJFram.setLocationRelativeTo(null);
        
        // 4 Thiết lập chế độ dừng chương trình khi click vào nút close
        mystJFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 5 Thiết lập không thay đổi kích thước
        mystJFram.setResizable(false);
        
        // Hien thi JFrame
        mystJFram.setVisible(true);
    }
    
}
