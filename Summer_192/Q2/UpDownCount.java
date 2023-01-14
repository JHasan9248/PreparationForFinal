package Summer_192.Q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpDownCount implements ActionListener {
    JFrame frame;
    JTextField txt;
    JButton up,down,reset;
    UpDownCount()
    {
        frame=new JFrame("Up and Down Count");
        frame.setLayout(new FlowLayout());
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt=new JTextField(10);
        txt.setText("0");
        frame.add(txt);

        up=new JButton("Up");
        frame.add(up);
        down=new JButton("Down");
        frame.add(down);
        reset=new JButton("Reset");
        frame.add(reset);

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new UpDownCount();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==up)
        {
            txt.setText((Integer.parseInt(txt.getText()))+1+"");
        }
        else if(e.getSource()==down)
        {
            txt.setText((Integer.parseInt(txt.getText()))-1+"");
        }
        else if(e.getSource()==reset)
        {
            txt.setText("0");
        }
    }
}
