
package jframe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ThiDuLayout extends JFrame{
    public ThiDuLayout() {
       
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
       
       // Thiết lập Font
       Font font = new Font("Arial", Font.BOLD,20);
       
       JTextField jTextField = new JTextField(20);
       this.add(jTextField, BorderLayout.NORTH);
       // Tạo panel để chứa các button
       Panel paNelCenter = new Panel();
       // Gán Layout cho panel
       paNelCenter.setLayout(new GridLayout(4,6));
       
       
       for(int i = 0; i < 25; i++) {
           JButton btn = new JButton(i + "");
           // Phát ính sự kiện và phương thức xử lý sự kiện của JButton
           btn.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  
                  // Lấy thông tin của Button phát ra sự kiện
                  JButton btnClick = (JButton)e.getSource();
                  String giaTri = btnClick.getText();
                  jTextField.setText(giaiTri);
                  
              }
           });
           paNelCenter.add(btn);
           
       }
       
       // Thêm panelCenter vào cửa sổ
       this.add(paNelCenter, BorderLayout.CENTER);
       
       // Thêm panel chứa các nut +,-...
       Panel paNelEats = new Panel(new GridLayout(4,1));
       JButton btnCong = new JButton("+");
       JButton btnTru = new JButton("+");
       JButton btnNhan = new JButton("+");
       JButton btnChia = new JButton("+");

       paNelEats.add(btnCong);
       paNelEats.add(btnCong);
       paNelEats.add(btnCong);
       paNelEats.add(btnCong);

       this.add(paNelCenter,BorderLayout.EAST);
       // HIển thị JFrame
       this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDuLayout fl = new ThiDuLayout();
        fl.khoiTao();
    }
}
