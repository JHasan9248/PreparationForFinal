package Fall_213.Q4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwapGui {
    JFrame frame;
    JTextField fld1,fld2;
    JButton swap;
    SwapGui()
    {
        frame=new JFrame("Swap");
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        fld1=new JTextField(10);
        frame.add(fld1);
        fld2=new JTextField(10);
        frame.add(fld2);

        swap=new JButton("Swap");
        frame.add(swap);

        swap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1=fld1.getText();
               String str2=fld2.getText();
                fld1.setText(str2);
                fld2.setText(str1);
            }
        });

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new SwapGui();
    }
}
