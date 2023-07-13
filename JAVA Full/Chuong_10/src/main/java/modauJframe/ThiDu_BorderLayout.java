/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modauJframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class ThiDu_BorderLayout extends JFrame {

    public ThiDu_BorderLayout() {

    }

    public void khoiTao() {
        // 1 thiết lập tiêu đề
        this.setTitle("Demo JFRame");

        // 2 thiết lập kích thước
        this.setSize(400, 300);

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
        this.setLayout(new BorderLayout(5, 4));

        Font font = new Font("Arial",Font.BOLD,20);
        
        JButton button1 = new JButton("phia trai");
        this.add(button1, BorderLayout.WEST);
        button1.setFont(font);
        button1.setForeground(Color.red);
        JButton button2 = new JButton("phia Phai");
        button2.setFont(font);        
        button2.setForeground(Color.BLUE);
        this.add(button2, BorderLayout.EAST);
        
        JButton button3 = new JButton("phia tren");
        button3.setFont(font);  
        button3.setForeground(Color.CYAN);
        this.add(button3, BorderLayout.NORTH);

        JButton button4 = new JButton("phia duoi");
        button4.setFont(font);  
        button4.setForeground(Color.YELLOW);
        this.add(button4, BorderLayout.SOUTH);

        JButton button5 = new JButton("trung tam");
        button5.setFont(font); 
        button5.setForeground(Color.PINK);
        this.add(button5, BorderLayout.CENTER);

        // Hien thi JFrame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        ThiDu_BorderLayout gl = new ThiDu_BorderLayout();
        gl.khoiTao();
    }
}
