package unit11;

import javax.swing.*;
import java.awt.*;

public class BoxSpaceTest {
    private Frame frame=new Frame();
    private Box horizontial=Box.createHorizontalBox();
    private Box vertial=Box.createVerticalBox();
    public void init(){
        horizontial.add(new Button("ˮƽ��ťһ"));
        horizontial.add(Box.createHorizontalBox());
        horizontial.add(new Button("ˮƽ��ť��"));
        //��������
        horizontial.add(Box.createHorizontalStrut(10));
        horizontial.add(new Button("ˮƽ��ť��"));
        vertial.add(new Button("��ֱ��ťһ"));
        vertial.add(Box.createGlue());
        vertial.add(new Button("��ֱ��ť��"));
        vertial.add(Box.createHorizontalStrut(10));
        vertial.add(new Button("��ֱ��ť��"));
        frame.add(horizontial,BorderLayout.NORTH);
        frame.add(vertial);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxSpaceTest().init();
    }
}
