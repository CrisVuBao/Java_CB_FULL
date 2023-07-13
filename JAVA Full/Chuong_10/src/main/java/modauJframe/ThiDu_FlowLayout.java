/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modauJframe;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class ThiDu_FlowLayout extends JFrame{
    public ThiDu_FlowLayout(){
        
    }
    public void khoiTao(){
        // 1 thiết lập tiêu đề
        this.setTitle("Demo JFRame");
        
        // 2 thiết lập kích thước
        this.setSize(400,300);
        
        // 3 thiết lập vị trí hiển thị theo tọa độ x và y
        //myJFram.setLocation(null);
        
        // 3.1 => canh giữa các cửa sổ màn hình làm việc
        this.setLocationRelativeTo(null);
        
        // 4 Thiết lập chế độ dừng chương trình khi click vào nút close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 5 Thiết lập không thay đổi kích thước
        // this.setResizable(false);
        
        // 6 Tạo các điều khiển JButton trên cua sổ
        // => thiết lập flowLayout cho của sổ
        this.setLayout(new FlowLayout());
        
        for(int i =0;i<10;i++){
            JButton button = new JButton(i+"");
            this.add(button);
        }
        
        // Hien thi JFrame
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_FlowLayout fl = new ThiDu_FlowLayout();
        fl.khoiTao();
    }
}
