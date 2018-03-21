package unit11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
    Frame frame=new Frame("����");
    Dialog dialog1=new Dialog(frame,"ģʽ�Ի���",true);
    Dialog dialog2=new Dialog(frame,"��ģʽ�Ի���",false);
    Button button1=new Button("��ģʽ�Ի���");
    Button button2=new Button("�򿪷�ģʽ�Ի���");
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
