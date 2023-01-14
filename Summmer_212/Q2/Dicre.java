package Summmer_212.Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dicre {
    JFrame frame;
    JLabel lb1;
    JButton btn;
    Dicre()
    {
        frame=new JFrame("321Go");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1=new JLabel("3");
        frame.add(lb1);

        btn=new JButton("Click");
        frame.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((Integer.parseInt(lb1.getText())==1))
                {
                    lb1.setText("Go");
                }
                lb1.setText((Integer.parseInt(lb1.getText())-1+""));
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Dicre();
    }
}
