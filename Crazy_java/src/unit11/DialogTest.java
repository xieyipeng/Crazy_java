package unit11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
    Frame frame=new Frame("测试");
    Dialog dialog1=new Dialog(frame,"模式对话框",true);
    Dialog dialog2=new Dialog(frame,"非模式对话框",false);
    Button button1=new Button("打开模式对话框");
    Button button2=new Button("打开非模式对话框");
    public void init(){
        dialog1.setBounds(20,30,300,400);
        dialog2.setBounds(20,30,300,400);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });
        frame.add(button1);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogTest().init();
    }
}
