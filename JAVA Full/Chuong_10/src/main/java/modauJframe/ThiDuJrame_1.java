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
public class ThiDuJrame_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myJFram = new JFrame();
        // thiết lập các thuộc tính
        // 1 thiết lập tiêu đề
        myJFram.setTitle("Demo JFRame");
        
        // 2 thiết lập kích thước
        myJFram.setSize(400,300);
        
        // 3 thiết lập vị trí hiển thị theo tọa độ x và y
        //myJFram.setLocation(null);
        
        // 3.1 => canh giữa các cửa sổ màn hình làm việc
        myJFram.setLocationRelativeTo(null);
        
        // 4 Thiết lập chế độ dừng chương trình khi click vào nút close
        myJFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 5 Thiết lập không thay đổi kích thước
        myJFram.setResizable(false);
        
        // Hien thi JFrame
        myJFram.setVisible(true);
        
    }
    
}
