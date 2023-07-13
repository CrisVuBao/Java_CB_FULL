
package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ThiDu_BorderLayout extends JFrame{
    
        public ThiDu_BorderLayout() {
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
//       // 5. Thiết lập không thay đổi kích thước
//       this.setResizable(false);
       
       // 6. Tạo các điều khiển JButton trên cửa sổ
       // => Thiết lập FlowLayout cho cửa sổ
       this.setLayout(new BorderLayout());
       Font font = new Font("Arial", Font.BOLD,20);   
       JButton btn1 = new JButton("Phia bac");
       btn1.setFont(font);
       btn1.setBackground(Color.red);
       this.add(btn1, BorderLayout.NORTH);
       
       JButton btn2 = new JButton("Phia nam");
       btn2.setFont(font);
       btn2.setBackground(Color.blue);
       this.add(btn2, BorderLayout.SOUTH);
       
       
       JButton btn3 = new JButton("Phia tay");
       btn3.setFont(font);
       btn3.setBackground(Color.yellow);
       this.add(btn3, BorderLayout.EAST);

       
       JButton btn4 = new JButton("Phia dong");
       btn4.setFont(font);
       btn4.setBackground(Color.ORANGE);
       this.add(btn4, BorderLayout.WEST);

       
       JButton btn5 = new JButton("Phia bac");
       this.add(btn5, BorderLayout.CENTER);
       
       
       // HIển thị JFrame
       this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDu_BorderLayout fl = new ThiDu_BorderLayout();
        fl.khoiTao();
    }
}
