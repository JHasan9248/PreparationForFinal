package Summer_222.Q3.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWork {
    JFrame frame;
    JButton foot,inch;
    JTextField ftf,itf;
    FrameWork()
    {
        frame=new JFrame("Conversion");
        frame.setLayout(new FlowLayout());
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Foot:"));
        ftf=new JTextField(10);
        ftf.setText("0");
        frame.add(ftf);

        inch=new JButton("Convert to inch:");
        frame.add(inch);
        foot=new JButton("Convert to foot");
        frame.add(foot);


        frame.add(new JLabel("Inch:"));
        itf=new JTextField(10);
        itf.setText("0");
        frame.add(itf);

        foot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==inch)
                {
                    itf.setText((Double.parseDouble(ftf.getText())*12)+"");
                }
                if(e.getSource()==foot)
                {
                    ftf.setText((Double.parseDouble(itf.getText())/12)+"");
                }
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new FrameWork();
    }
}
