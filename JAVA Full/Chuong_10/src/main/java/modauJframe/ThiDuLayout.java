/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modauJframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


/**
 *
 * @author Dell
 */
public class ThiDuLayout extends JFrame{
    public ThiDuLayout() {

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
        this.setLayout(new BorderLayout());
        Font font = new Font("Arial",Font.BOLD,20);
        
        JTextField jTextField = new JTextField(20);
        this.add(jTextField,BorderLayout.NORTH);
        // tạo panel để chứa các button
        Panel pnl_center = new Panel();
        pnl_center.setLayout(new GridLayout(4,6));
        for (int i = 0; i < 24; i++) {
        
//            if((i%6)==0 && i!=0){
//                int index= (i/6)-1;
//                String bien = (String)mang.get(index);
//                JButton button2 = new JButton(bien+"");
//                pnl_center.add(button2);
//            }
//            else{
                JButton button1 = new JButton(i+" ");
                
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        JButton btnclick = (JButton)e.getSource();
//                        String giaTri = btnclick.getName();
//                        jTextField.setText(giaTri);
                        jTextField.setText(((JButton)e.getSource()).getText());
                    }
                });
                pnl_center.add(button1);
            //}
        }
        // them cai panelCenter vào cửa sổ 
        this.add(pnl_center,BorderLayout.CENTER);

        // thêm cái panel chứa các nút +,-,*,/
        Panel paNelEats = new Panel(new GridLayout(4,1));
        JButton btnCong = new JButton("+");
        btnCong.setForeground(Color.red);
        JButton btnTru = new JButton("-");
        btnTru.setForeground(Color.red);
        JButton btnNhan = new JButton("*");
        btnNhan.setForeground(Color.red);
        JButton btnChia = new JButton("/");
        btnChia.setForeground(Color.red);
        paNelEats.add(btnCong);
        paNelEats.add(btnTru);
        paNelEats.add(btnNhan);
        paNelEats.add(btnChia);
        this.add(paNelEats,BorderLayout.EAST);
        // Hien thi JFrame
        this.setVisible(true);
    }
    public static void main(String[] args) {
        ThiDuLayout fl = new ThiDuLayout();
        fl.khoiTao();
    }
    
}
