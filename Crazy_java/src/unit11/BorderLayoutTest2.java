package unit11;

import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame frame=new Frame("���Դ���");
        frame.setLayout(new BorderLayout(30,5));
        frame.add(new Button("��") , SOUTH);
        frame.add(new Button("��") , NORTH);
        Panel panel=new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("�����"));
        frame.add(panel);
        frame.add(new Button("��") , EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
