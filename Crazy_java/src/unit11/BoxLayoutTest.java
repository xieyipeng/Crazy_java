package unit11;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame frame=new Frame();
    public void init(){
        frame.setLayout(new BoxLayout(frame,BoxLayout.Y_AXIS));
        frame.add(new Button("��һ����ť"));
        frame.add(new Button("�ڶ�����ť"));
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
