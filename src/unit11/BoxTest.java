package unit11;

import javax.swing.*;
import java.awt.*;

public class BoxTest {
    private Frame frame=new Frame("����");
    //����ˮƽ�ڷŵ��齨��Box����
    private Box horizontal=Box.createHorizontalBox();
    //���崹ֱ�ڷŵ��齨��Box����
    private Box vertical=Box.createVerticalBox();
    public void init(){
        horizontal.add(new Button("ˮƽ��ťһ"));
        horizontal.add(new Button("ˮƽ��ť��"));
        vertical.add(new Button("��ֱ��ťһ"));
        vertical.add(new Button("��ֱ��ť��"));
        frame.add(horizontal,BorderLayout.NORTH);
        frame.add(vertical);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BoxTest().init();
    }
}
