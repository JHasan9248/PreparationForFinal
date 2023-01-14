package Summer_222.Q3.A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWork {
    JFrame frame;
    JButton foot;
    JTextField ftf,itf;
    FrameWork()
    {
        frame=new JFrame("Conversion");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,130);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Foot:"));
        ftf=new JTextField(10);
        ftf.setText("0");
        frame.add(ftf);
        foot=new JButton("Convert to inch");
        frame.add(foot);
        frame.add(new JLabel("Inch:"));
        itf=new JTextField(10);
        itf.setText("0");
        frame.add(itf);

        foot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               double footDig=Double.parseDouble((String) foot.getText());
//               double ichDig=footDig*12;
//               itf.setText(ichDig+"");
                itf.setText((Double.parseDouble(ftf.getText())*12)+"");
            }
        });


        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FrameWork();
    }
}
